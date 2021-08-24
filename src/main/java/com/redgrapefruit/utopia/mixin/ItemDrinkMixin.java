package com.redgrapefruit.utopia.mixin;

import com.redgrapefruit.utopia.Constants;
import com.redgrapefruit.utopia.core.DrinkProfile;
import com.redgrapefruit.utopia.core.RealismEngine;
import com.redgrapefruit.utopia.item.RancidDrinkItem;
import com.redgrapefruit.utopia.util.ItemDrinkMixinAccess;
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
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

/**
 * Like {@link ItemFoodMixin}, but for drinks
 */
@Mixin(Item.class)
public class ItemDrinkMixin implements ItemDrinkMixinAccess {
    @Unique
    private boolean utopia$isActivated = false;
    @Unique
    private @Nullable FoodComponent utopia$component = null;
    @Unique
    private @Nullable RancidDrinkItem utopia$rancidVariant = null;
    @Unique
    private int utopia$rancidSpeed = Constants.UNUSED_PROPERTY;
    @Unique
    private int utopia$rancidState = Constants.UNUSED_PROPERTY;

    // <---- IMPL ---->

    @Inject(method = "inventoryTick", at = @At("TAIL"))
    private void utopia$inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected, CallbackInfo ci) {
        if (utopia$invalid()) return;

        if (entity instanceof PlayerEntity) {
            RealismEngine.INSTANCE.updateDrink(DrinkProfile.Companion.get(stack), utopia$rancidSpeed, utopia$rancidState, slot, world, (PlayerEntity) entity, utopia$rancidVariant);
        }
    }

    @Inject(method = "appendTooltip", at = @At("HEAD"))
    private void utopia$appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context, CallbackInfo ci) {
        if (utopia$invalid()) return;

        RealismEngine.INSTANCE.renderDrinkTooltip(tooltip, DrinkProfile.Companion.get(stack), utopia$rancidState, false);
    }

    private boolean utopia$invalid() {
        return !utopia$isActivated || utopia$component == null ||
                utopia$rancidSpeed == Constants.UNUSED_PROPERTY || utopia$rancidState == Constants.UNUSED_PROPERTY ||
                utopia$rancidVariant == null;
    }

    // <---- API ---->

    @Override
    public void activateDrink() {
        utopia$isActivated = true;
    }

    @Override
    public void setComponent(@NotNull FoodComponent component) {
        utopia$component = component;
    }

    @Override
    public void setRancidSpeed(int rancidSpeed) {
        utopia$rancidSpeed = rancidSpeed;
    }

    @Override
    public void setRancidState(int rancidState) {
        utopia$rancidState = rancidState;
    }

    @Override
    public void setRancidVariant(@NotNull RancidDrinkItem rancidVariant) {
        utopia$rancidVariant = rancidVariant;
    }

    @Override
    public boolean isDrinkActivated() {
        return utopia$isActivated;
    }
}
