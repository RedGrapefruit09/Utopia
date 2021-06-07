package com.redgrapefruit.utopia.core

/**
 * A food category classifies an entire group of food
 */
enum class RFoodCategory(
    /**
     * The base hunger value of this category. Only used in new food
     */
    val baseHunger: Int,
    /**
     * The base saturation modifier of this category. Only used in new food
     */
    val baseSaturationModifier: Float,
    /**
     * The name displayed inside the tooltips
     */
    val displayName: String,
    /**
     * Can the food from this category rot
     */
    val canRot: Boolean,
    /**
     * Can the food from this category overdue
     */
    val canOverdue: Boolean,
    /**
     * Can the food from this category be put inside of a fridge
     */
    val canBePutInFridge: Boolean,
    /**
     * The detailed description about the category inside the tooltips
     */
    val details: String
) {
    MEAT(4, 1.6f, "Meat", true, false, true, "Trusty old meat."),
    FRUIT(2, 1.2f, "Fruit", false, true, true, "Sweet, juicy fruit."),
    VEGETABLE(2, 1.3f, "Berries", false, true, true, "Extremely healthy vegetable."),
    BERRIES(1, 0.6f, "Berries", false, true, false, "Small and tasty berries."),
    FISH(3, 1.25f, "Fish", false, true, true, "Nice and yummy fish."),
    NUT(2, 1.1f, "Nut", false, true, false, "Crunchy nuts."),
    PRODUCT(3, 1f, "Product", false, true, true, "Cooked product - bakery, soup, stew etc."),
    MISCELLANEOUS(2, 0.75f, "Miscellaneous", false, true, false, "Food that doesn't fit in regular categories")
}