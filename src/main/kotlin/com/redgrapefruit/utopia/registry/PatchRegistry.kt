package com.redgrapefruit.utopia.registry

import com.redgrapefruit.utopia.EDIBLE_1
import com.redgrapefruit.utopia.EDIBLE_3
import com.redgrapefruit.utopia.YUCK
import com.redgrapefruit.utopia.util.*

/**
 * A registry containing all of the mod's patches
 */
object PatchRegistry : IRegistry {
    override fun run() {
        // Common FoodComponent patches
        addComponent("hops", "croptopia", EDIBLE_1)
        addComponent("mustard", "croptopia", YUCK)
        addComponent("vanilla", "croptopia", YUCK)
        addComponent("paprika", "croptopia", EDIBLE_1)
        addComponent("chile_pepper", "croptopia", EDIBLE_3)
        addComponent("turmeric", "croptopia", EDIBLE_1)
        addComponent("ginger", "croptopia", EDIBLE_3)
        addComponent("olive_oil", "croptopia", YUCK)
        addComponent("flour", "croptopia", YUCK)
        addComponent("noodle", "croptopia", EDIBLE_1)
        addComponent("molasses", "croptopia", YUCK)
        addComponent("caramel", "croptopia", EDIBLE_1)
        addComponent("soy_sauce", "croptopia", YUCK)
        addComponent("dough", "croptopia", YUCK)
        addComponent("ravioli", "croptopia", EDIBLE_1)
        addComponent("cinnamon", "croptopia", EDIBLE_1)
        addComponent("pepper", "croptopia", EDIBLE_3)
        addComponent("milk_bottle", "croptopia", EDIBLE_1)

        // Realism patches
        moduleSpecific(Module.REALISM) {
            // Food
            configureFood("almond", "croptopia", FoodRegistry.OVERDUE_ALMOND)
            configureFood("almond_brittle", "croptopia", FoodRegistry.OVERDUE_ALMOND_BRITTLE)
            configureFood("apple_pie", "croptopia", FoodRegistry.OVERDUE_APPLE_PIE)
            configureFood("apricot", "croptopia", FoodRegistry.OVERDUE_APRICOT)
            configureFood("artichoke", "croptopia", FoodRegistry.OVERDUE_ARTICHOKE)
            configureFood("artichoke_dip", "croptopia", FoodRegistry.OVERDUE_ARTICHOKE_DIP)
            configureFood("asparagus", "croptopia", FoodRegistry.OVERDUE_ASPARAGUS)
            configureFood("avocado", "croptopia", FoodRegistry.OVERDUE_AVOCADO)
            configureFood("baked_beans", "croptopia", FoodRegistry.OVERDUE_BAKED_BEANS)
            configureFood("banana", "croptopia", FoodRegistry.OVERDUE_BANANA)
            configureFood("banana_cream_pie", "croptopia", FoodRegistry.OVERDUE_BANANA_CREAM_PIE)
            configureFood("banana_nut_bread", "croptopia", FoodRegistry.OVERDUE_BANANA_NUT_BREAD)
            configureFood("barley", "croptopia", FoodRegistry.OVERDUE_BARLEY)
            configureFood("basil", "croptopia", FoodRegistry.OVERDUE_BASIL)
            configureFood("beef_jerky", "croptopia", FoodRegistry.ROTTEN_BEEF_JERKY)
            configureFood("beef_wellington", "croptopia", FoodRegistry.ROTTEN_BEEF_WELLINGTON)
            configureFood("bellpepper", "croptopia", FoodRegistry.OVERDUE_BELLPEPPER)
            configureFood("blackbean", "croptopia", FoodRegistry.OVERDUE_BLACKBEAN)
            configureFood("blackberry", "croptopia", FoodRegistry.OVERDUE_BLACKBERRY)
            configureFood("blt", "croptopia", FoodRegistry.OVERDUE_BLT)
            configureFood("blueberry", "croptopia", FoodRegistry.OVERDUE_BLUEBERRY)
            configureFood("broccoli", "croptopia", FoodRegistry.OVERDUE_BROCCOLI)
            configureFood("brownies", "croptopia", FoodRegistry.OVERDUE_BROWNIES)
            configureFood("burrito", "croptopia", FoodRegistry.OVERDUE_BURRITO)
            configureFood("butter", "croptopia", FoodRegistry.OVERDUE_BUTTER)
            configureFood("buttered_toast", "croptopia", FoodRegistry.OVERDUE_BUTTERED_TOAST)
            configureFood("cabbage", "croptopia", FoodRegistry.OVERDUE_CABBAGE)
            configureFood("caesar_salad", "croptopia", FoodRegistry.OVERDUE_CAESAR_SALAD)
            configureFood("candied_nuts", "croptopia", FoodRegistry.OVERDUE_CANDIED_NUTS)
            configureFood("candy_corn", "croptopia", FoodRegistry.OVERDUE_CANDY_CORN)
            configureFood("caramel", "croptopia", FoodRegistry.OVERDUE_CARAMEL)
            configureFood("cantaloupe", "croptopia", FoodRegistry.OVERDUE_CANTALOUPE)
            configureFood("carnitas", "croptopia", FoodRegistry.OVERDUE_CARNITAS)
            configureFood("cashew", "croptopia", FoodRegistry.OVERDUE_CASHEW)
            configureFood("cashew_chicken", "croptopia", FoodRegistry.OVERDUE_CASHEW_CHICKEN)
            configureFood("cauliflower", "croptopia", FoodRegistry.OVERDUE_CAULIFLOWER)
            configureFood("celery", "croptopia", FoodRegistry.OVERDUE_CELERY)
            configureFood("cheese", "croptopia", FoodRegistry.OVERDUE_CHEESE)
            configureFood("cheese_cake", "croptopia", FoodRegistry.OVERDUE_CHEESE_CAKE)
            configureFood("cheese_pizza", "croptopia", FoodRegistry.OVERDUE_CHEESE_PIZZA)
            configureFood("cheeseburger", "croptopia", FoodRegistry.OVERDUE_CHEESEBURGER)
            configureFood("cherry", "croptopia", FoodRegistry.OVERDUE_CHERRY)
            configureFood("cherry_pie", "croptopia", FoodRegistry.OVERDUE_CHERRY_PIE)
            configureFood("chicken_and_dumplings", "croptopia", FoodRegistry.OVERDUE_CHICKEN_AND_DUMPLINGS)
            configureFood("chicken_and_noodles", "croptopia", FoodRegistry.OVERDUE_CHICKEN_AND_NOODLES)
            configureFood("chicken_and_rice", "croptopia", FoodRegistry.OVERDUE_CHICKEN_AND_RICE)
            configureFood("chile_pepper", "croptopia", FoodRegistry.OVERDUE_CHILE_PEPPER)
            configureFood("chili_relleno", "croptopia", FoodRegistry.OVERDUE_CHILI_RELLENO)
            configureFood("chimichanga", "croptopia", FoodRegistry.OVERDUE_CHIMICHANGA)
            configureFood("chocolate", "croptopia", FoodRegistry.OVERDUE_CHOCOLATE)
            configureFood("cinnamon", "croptopia", FoodRegistry.OVERDUE_CINNAMON)
            configureFood("coconut", "croptopia", FoodRegistry.OVERDUE_COCONUT)
            configureFood("coffee_beans", "croptopia", FoodRegistry.OVERDUE_COFFEE_BEANS)
            configureFood("corn", "croptopia", FoodRegistry.OVERDUE_CORN)
            configureFood("cornish_pasty", "croptopia", FoodRegistry.OVERDUE_CORNISH_PASTY)
            configureFood("cranberry", "croptopia", FoodRegistry.OVERDUE_CRANBERRY)
            configureFood("crema", "croptopia", FoodRegistry.OVERDUE_CREMA)
            configureFood("cucumber", "croptopia", FoodRegistry.OVERDUE_CUCUMBER)
            configureFood("cucumber_salad", "croptopia", FoodRegistry.OVERDUE_CUCUMBER_SALAD)
            configureFood("currant", "croptopia", FoodRegistry.OVERDUE_CURRANT)
            configureFood("date", "croptopia", FoodRegistry.OVERDUE_DATE)
            configureFood("dough", "croptopia", FoodRegistry.OVERDUE_DOUGH)
            configureFood("doughnut", "croptopia", FoodRegistry.OVERDUE_DOUGHNUT)
            configureFood("dragonfruit", "croptopia", FoodRegistry.OVERDUE_DRAGONFRUIT)
            configureFood("egg_roll", "croptopia", FoodRegistry.OVERDUE_EGG_ROLL)
            configureFood("eggplant", "croptopia", FoodRegistry.OVERDUE_EGGPLANT)
            configureFood("elderberry", "croptopia", FoodRegistry.OVERDUE_ELDERBERRY)
            configureFood("enchilada", "croptopia", FoodRegistry.OVERDUE_ENCHILADA)
            configureFood("eton_mess", "croptopia", FoodRegistry.OVERDUE_ETON_MESS)
            configureFood("fajitas", "croptopia", FoodRegistry.OVERDUE_FAJITAS)
            configureFood("fig", "croptopia", FoodRegistry.OVERDUE_FIG)
            configureFood("figgy_pudding", "croptopia", FoodRegistry.OVERDUE_FIGGY_PUDDING)
            configureFood("fish_and_chips", "croptopia", FoodRegistry.OVERDUE_FISH_AND_CHIPS)
            configureFood("flour", "croptopia", FoodRegistry.OVERDUE_FLOUR)
            configureFood("french_fries", "croptopia", FoodRegistry.OVERDUE_FRENCH_FRIES)
            configureFood("fried_chicken", "croptopia", FoodRegistry.ROTTEN_FRIED_CHICKEN)
            configureFood("fruit_salad", "croptopia", FoodRegistry.OVERDUE_FRUIT_SALAD)
            configureFood("garlic", "croptopia", FoodRegistry.OVERDUE_GARLIC)
            configureFood("ginger", "croptopia", FoodRegistry.OVERDUE_GINGER)
            configureFood("grape", "croptopia", FoodRegistry.OVERDUE_GRAPE)
            configureFood("grapefruit", "croptopia", FoodRegistry.OVERDUE_GRAPEFRUIT)
            configureFood("greenbean", "croptopia", FoodRegistry.OVERDUE_GREENBEAN)
            configureFood("greenonion", "croptopia", FoodRegistry.OVERDUE_GREENONION)
            configureFood("grilled_cheese", "croptopia", FoodRegistry.OVERDUE_GRILLED_CHEESE)
            configureFood("ham_sandwich", "croptopia", FoodRegistry.OVERDUE_HAM_SANDWICH)
            configureFood("hamburger", "croptopia", FoodRegistry.OVERDUE_HAMBURGER)
            configureFood("hops", "croptopia", FoodRegistry.OVERDUE_HOPS)
            configureFood("kale", "croptopia", FoodRegistry.OVERDUE_KALE)
            configureFood("kale_chips", "croptopia", FoodRegistry.OVERDUE_KALE_CHIPS)
            configureFood("kiwi", "croptopia", FoodRegistry.OVERDUE_KIWI)
            configureFood("kumquat", "croptopia", FoodRegistry.OVERDUE_KUMQUAT)
            configureFood("leafy_salad", "croptopia", FoodRegistry.OVERDUE_LEAFY_SALAD)
            configureFood("leek", "croptopia", FoodRegistry.OVERDUE_LEEK)
            configureFood("leek_soup", "croptopia", FoodRegistry.OVERDUE_LEEK_SOUP)
            configureFood("lemon", "croptopia", FoodRegistry.OVERDUE_LEMON)
            configureFood("lemon_chicken", "croptopia", FoodRegistry.ROTTEN_LEMON_CHICKEN)
            configureFood("lettuce", "croptopia", FoodRegistry.OVERDUE_LETTUCE)
            configureFood("lime", "croptopia", FoodRegistry.OVERDUE_LIME)
            configureFood("mango", "croptopia", FoodRegistry.OVERDUE_MANGO)
            configureFood("mango_ice_cream", "croptopia", FoodRegistry.OVERDUE_MANGO_ICE_CREAM)
            configureFood("molasses", "croptopia", FoodRegistry.OVERDUE_MOLASSES)
            configureFood("mustard", "croptopia", FoodRegistry.OVERDUE_MUSTARD)
            configureFood("nectarine", "croptopia", FoodRegistry.OVERDUE_NECTARINE)
            configureFood("noodle", "croptopia", FoodRegistry.OVERDUE_NECTARINE)
            configureFood("nougat", "croptopia", FoodRegistry.OVERDUE_NOUGAT)
            configureFood("nutmeg", "croptopia", FoodRegistry.OVERDUE_NUTMEG)
            configureFood("nutty_cookie", "croptopia", FoodRegistry.OVERDUE_NUTTY_COOKIE)
            configureFood("oat", "croptopia", FoodRegistry.OVERDUE_OAT)
            configureFood("oatmeal", "croptopia", FoodRegistry.OVERDUE_OATMEAL)
            configureFood("olive", "croptopia", FoodRegistry.OVERDUE_OLIVE)
            configureFood("onion", "croptopia", FoodRegistry.OVERDUE_ONION)
            configureFood("onion_rings", "croptopia", FoodRegistry.OVERDUE_ONION_RINGS)
            configureFood("orange", "croptopia", FoodRegistry.OVERDUE_ORANGE)
            configureFood("paprika", "croptopia", FoodRegistry.OVERDUE_PAPRIKA)
            configureFood("peach", "croptopia", FoodRegistry.OVERDUE_PEACH)
            configureFood("peanut", "croptopia", FoodRegistry.OVERDUE_PEANUT)
            configureFood("peanut_butter_and_jam", "croptopia", FoodRegistry.OVERDUE_PEANUT_BUTTER_AND_JAM)
            configureFood("pear", "croptopia", FoodRegistry.OVERDUE_PEAR)
            configureFood("pecan", "croptopia", FoodRegistry.OVERDUE_PECAN)
            configureFood("pecan_ice_cream", "croptopia", FoodRegistry.OVERDUE_PECAN_ICE_CREAM)
            configureFood("pecan_pie", "croptopia", FoodRegistry.OVERDUE_PECAN_PIE)
            configureFood("pepper", "croptopia", FoodRegistry.OVERDUE_PEPPER)
            configureFood("pepperoni", "croptopia", FoodRegistry.OVERDUE_PEPPERONI)
            configureFood("persimmon", "croptopia", FoodRegistry.OVERDUE_PERSIMMON)
            configureFood("pineapple", "croptopia", FoodRegistry.OVERDUE_PINEAPPLE)
            configureFood("pineapple_pepperoni_pizza", "croptopia", FoodRegistry.OVERDUE_PINEAPPLE_PEPPERONI_PIZZA)
            configureFood("pizza", "croptopia", FoodRegistry.OVERDUE_PIZZA)
            configureFood("plum", "croptopia", FoodRegistry.OVERDUE_PLUM)
            configureFood("popcorn", "croptopia", FoodRegistry.OVERDUE_POPCORN)
            configureFood("pork_and_beans", "croptopia", FoodRegistry.OVERDUE_PORK_AND_BEANS)
            configureFood("pork_jerky", "croptopia", FoodRegistry.ROTTEN_PORK_JERKY)
            configureFood("potato_chips", "croptopia", FoodRegistry.OVERDUE_POTATO_CHIPS)
            configureFood("protein_bar", "croptopia", FoodRegistry.OVERDUE_PROTEIN_BAR)
            configureFood("quesadilla", "croptopia", FoodRegistry.OVERDUE_QUESADILLA)
            configureFood("radish", "croptopia", FoodRegistry.OVERDUE_RADISH)
            configureFood("raisin_oatmeal_cookie", "croptopia", FoodRegistry.OVERDUE_RAISIN_OATMEAL_COOKIE)
            configureFood("raisins", "croptopia", FoodRegistry.OVERDUE_RAISINS)
            configureFood("raspberry", "croptopia", FoodRegistry.OVERDUE_RASPBERRY)
            configureFood("ravioli", "croptopia", FoodRegistry.OVERDUE_RAVIOLI)
            configureFood("refried_beans", "croptopia", FoodRegistry.OVERDUE_REFRIED_BEANS)
            configureFood("rhubarb", "croptopia", FoodRegistry.OVERDUE_RHUBARB)
            configureFood("rice", "croptopia", FoodRegistry.OVERDUE_RICE)
            configureFood("roasted_nuts", "croptopia", FoodRegistry.OVERDUE_ROASTED_NUTS)
            configureFood("rum_raisin_ice_cream", "croptopia", FoodRegistry.OVERDUE_RUM_RAISIN_ICE_CREAM)
            configureFood("rutabaga", "croptopia", FoodRegistry.OVERDUE_RUTABAGA)
            configureFood("saguaro", "croptopia", FoodRegistry.OVERDUE_SAGUARO)
            configureFood("salsa", "croptopia", FoodRegistry.OVERDUE_SALSA)
            configureFood("salsa_chips", "croptopia", FoodRegistry.OVERDUE_SALSA_CHIPS)
            configureFood("saucy_chips", "croptopia", FoodRegistry.OVERDUE_SAUCY_CHIPS)
            configureFood("scones", "croptopia", FoodRegistry.OVERDUE_SCONES)
            configureFood("scrambled_eggs", "croptopia", FoodRegistry.OVERDUE_SCRAMBLED_EGGS)
            configureFood("shepherds_pie", "croptopia", FoodRegistry.OVERDUE_SHEPHERDS_PIE)
            configureFood("snicker_doodle", "croptopia", FoodRegistry.OVERDUE_SNICKER_DOODLE)
            configureFood("soybean", "croptopia", FoodRegistry.OVERDUE_SOYBEAN)
            configureFood("spaghetti_squash", "croptopia", FoodRegistry.OVERDUE_SPAGHETTI_SQUASH)
            configureFood("spinach", "croptopia", FoodRegistry.OVERDUE_SPINACH)
            configureFood("squash", "croptopia", FoodRegistry.OVERDUE_SQUASH)
            configureFood("starfruit", "croptopia", FoodRegistry.OVERDUE_STARFRUIT)
            configureFood("steamed_rice", "croptopia", FoodRegistry.OVERDUE_STEAMED_RICE)
            configureFood("sticky_toffee_pudding", "croptopia", FoodRegistry.OVERDUE_STICKY_TOFFEE_PUDDING)
            configureFood("strawberry", "croptopia", FoodRegistry.OVERDUE_STRAWBERRY)
            configureFood("strawberry_ice_cream", "croptopia", FoodRegistry.OVERDUE_STRAWBERRY_ICE_CREAM)
            configureFood("stuffed_poblanos", "croptopia", FoodRegistry.OVERDUE_STUFFED_POBLANOS)
            configureFood("supreme_pizza", "croptopia", FoodRegistry.OVERDUE_SUPREME_PIZZA)
            configureFood("sushi", "croptopia", FoodRegistry.OVERDUE_SUSHI)
            configureFood("sweet_potato_fries", "croptopia", FoodRegistry.OVERDUE_SWEET_POTATO_FRIES)
            configureFood("sweetpotato", "croptopia", FoodRegistry.OVERDUE_SWEETPOTATO)
            configureFood("taco", "croptopia", FoodRegistry.OVERDUE_TACO)
            configureFood("toast", "croptopia", FoodRegistry.OVERDUE_TOAST)
            configureFood("toast_with_jam", "croptopia", FoodRegistry.OVERDUE_TOAST_WITH_JAM)
            configureFood("tofu", "croptopia", FoodRegistry.OVERDUE_TOFU)
            configureFood("tofu_and_dumplings", "croptopia", FoodRegistry.OVERDUE_TOFU_AND_DUMPLINGS)
            configureFood("tofuburger", "croptopia", FoodRegistry.OVERDUE_TOFUBURGER)
            configureFood("tomatillo", "croptopia", FoodRegistry.OVERDUE_TOMATILLO)
            configureFood("tomato", "croptopia", FoodRegistry.OVERDUE_TOMATO)
            configureFood("tortilla", "croptopia", FoodRegistry.OVERDUE_TORTILLA)
            configureFood("tostada", "croptopia", FoodRegistry.OVERDUE_TOSTADA)
            configureFood("trail_mix", "croptopia", FoodRegistry.OVERDUE_TRAIL_MIX)
            configureFood("treacle_tart", "croptopia", FoodRegistry.OVERDUE_TREACLE_TART)
            configureFood("tres_leche_cake", "croptopia", FoodRegistry.OVERDUE_TRES_LECHE_CAKE)

            // Drinks
            configureDrink("apple_juice", "croptopia", DrinkRegistry.RANCID_APPLE_JUICE)
            configureDrink("apricot_jam", "croptopia", DrinkRegistry.RANCID_APRICOT_JAM)
            configureDrink("blackberry_jam", "croptopia", DrinkRegistry.RANCID_BLACKBERRY_JAM)
            configureDrink("blueberry_jam", "croptopia", DrinkRegistry.RANCID_BLUEBERRY_JAM)
            configureDrink("cherry_jam", "croptopia", DrinkRegistry.RANCID_CHERRY_JAM)
            configureDrink("chocolate_milkshake", "croptopia", DrinkRegistry.RANCID_CHOCOLATE_MILKSHAKE)
            configureDrink("coffee", "croptopia", DrinkRegistry.RANCID_COFFEE)
            configureDrink("cranberry_juice", "croptopia", DrinkRegistry.RANCID_CRANBERRY_JUICE)
            configureDrink("elderberry_jam", "croptopia", DrinkRegistry.RANCID_ELDERBERRY_JAM)
            configureDrink("fruit_smoothie", "croptopia", DrinkRegistry.RANCID_FRUIT_SMOOTHIE)
            configureDrink("grape_jam", "croptopia", DrinkRegistry.RANCID_GRAPE_JAM)
            configureDrink("horchata", "croptopia", DrinkRegistry.RANCID_HORCHATA)
            configureDrink("kale_smoothie", "croptopia", DrinkRegistry.RANCID_KALE_SMOOTHIE)
            configureDrink("lemonade", "croptopia", DrinkRegistry.RANCID_LEMONADE)
            configureDrink("limeade", "croptopia", DrinkRegistry.RANCID_LIMEADE)
            configureDrink("mead", "croptopia", DrinkRegistry.RANCID_MEAD)
            configureDrink("melon_juice", "croptopia", DrinkRegistry.RANCID_MELON_JUICE)
            configureDrink("milk_bottle", "croptopia", DrinkRegistry.RANCID_MILK_BOTTLE)
            configureDrink("olive_oil", "croptopia", DrinkRegistry.RANCID_OLIVE_OIL)
            configureDrink("orange_juice", "croptopia", DrinkRegistry.RANCID_ORANGE_JUICE)
            configureDrink("peach_jam", "croptopia", DrinkRegistry.RANCID_PEACH_JAM)
            configureDrink("pineapple_juice", "croptopia", DrinkRegistry.RANCID_PINEAPPLE_JUICE)
            configureDrink("pumpkin_spice_latte", "croptopia", DrinkRegistry.RANCID_PUMPKIN_SPICE_LATTE)
            configureDrink("raspberry_jam", "croptopia", DrinkRegistry.RANCID_RASPBERRY_JAM)
            configureDrink("rum", "croptopia", DrinkRegistry.RANCID_RUM)
            configureDrink("saguaro_juice", "croptopia", DrinkRegistry.RANCID_SAGUARO_JUICE)
            configureDrink("soy_milk", "croptopia", DrinkRegistry.RANCID_SOY_MILK)
            configureDrink("soy_sauce", "croptopia", DrinkRegistry.RANCID_SOY_SAUCE)
            configureDrink("strawberry_jam", "croptopia", DrinkRegistry.RANCID_STRAWBERRY_JAM)
            configureDrink("strawberry_smoothie", "croptopia", DrinkRegistry.RANCID_STRAWBERRY_SMOOTHIE)
            configureDrink("tea", "croptopia", DrinkRegistry.RANCID_TEA)
            configureDrink("tomato_juice", "croptopia", DrinkRegistry.RANCID_TOMATO_JUICE)
        }
    }
}