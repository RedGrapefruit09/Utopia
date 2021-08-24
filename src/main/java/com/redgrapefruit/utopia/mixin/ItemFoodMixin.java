package com.redgrapefruit.utopia.mixin;

import com.redgrapefruit.utopia.core.*;
import com.redgrapefruit.utopia.util.*;
import com.redgrapefruit.utopia.item.OverdueFoodItem;
import com.redgrapefruit.utopia.item.RottenFoodItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

@Mixin(Item.class)
public class ItemFoodMixin implements ItemFoodMixinAccess {
    @Shadow @Final @Nullable private FoodComponent foodComponent;
    @Unique
    private String utopia$name = "";
    @Unique
    private final Supplier<FoodConfig> utopia$supplierConfig = () -> ConfigDataKt.storedConfig(utopia$name);
    @Unique
    private boolean utopia$isComponentInitialized = false;
    @Unique
    private boolean utopia$isActivated = false;
    @Unique
    @Nullable
    private OverdueFoodItem utopia$overdueVariant = null;
    @Unique
    @Nullable
    private RottenFoodItem utopia$rottenVariant = null;

    // <---- IMPL ---->

    @Inject(method = "inventoryTick", at = @At("TAIL"))
    private void utopia$inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected, CallbackInfo ci) {
        if (!utopia$isActivated || !(entity instanceof PlayerEntity) || utopia$supplierConfig.get() == FoodConfig.Companion.getDefault()) return;

        //noinspection ConstantConditions
        if (entity instanceof PlayerEntity) {
            RealismEngine.INSTANCE.updateFood(utopia$supplierConfig.get(), FoodProfile.Companion.get(stack), (PlayerEntity) entity, slot, world, utopia$rottenVariant, utopia$overdueVariant, false);
        }
    }

    @Inject(method = "appendTooltip", at = @At("TAIL"))
    private void utopia$appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context, CallbackInfo ci) {
        if (!utopia$isActivated || utopia$supplierConfig.get() == FoodConfig.Companion.getDefault()) return;

        RealismEngine.INSTANCE.renderFoodTooltip(tooltip, utopia$supplierConfig.get(), FoodProfile.Companion.get(stack), FoodState.FRESH);
    }

    /**
     * Initializes a component, but for the mixin impl
     */
    private void mixinInitComponent() {
        if (utopia$isComponentInitialized) return;

        if (utopia$supplierConfig.get() == FoodConfig.Companion.getDefault())
            throw new RuntimeException("Late-load system failed. Config not loaded at moment of execution");

        Objects.requireNonNull(foodComponent, "Late-load system failed. No FoodComponent assigned in " + utopia$name);
        MutableFoodComponent mutable = MiscUtil.asMutable(foodComponent);
        FoodConfig config = utopia$supplierConfig.get();

        mutable.setHunger(config.getCategory().getBaseHunger() + config.getHunger());
        if (config.getCategory() == FoodCategory.MEAT) mutable.setMeat(true);
        if (config.getCategory().getBaseHunger() + config.getHunger() < 2) mutable.setSnack(true);
        mutable.setSaturationModifier(config.getCategory().getBaseSaturationModifier() + config.getSaturationModifier());

        ItemAccessor access = (ItemAccessor) ((Item) (Object) this);
        access.setFoodComponent(MiscUtil.asImmutable(mutable));

        utopia$isComponentInitialized = true;
    }

    // <---- API ---->

    @Override
    public void activateFood() {
        utopia$isActivated = true;
    }

    @Override
    public void named(@NotNull String name) {
        utopia$name = name;

        ComponentInitializeCallback.Companion.getEvent().register((loadedName, config) -> {
            if (loadedName.equals(utopia$name)) mixinInitComponent();
        });
    }

    @Override
    public void setOverdueVariant(@NotNull OverdueFoodItem overdueVariant) {
        this.utopia$overdueVariant = overdueVariant;
    }

    @Override
    public void setRottenVariant(@NotNull RottenFoodItem rottenVariant) {
        this.utopia$rottenVariant = rottenVariant;
    }

    @Override
    public boolean isFoodActivated() {
        return utopia$isActivated;
    }
}
