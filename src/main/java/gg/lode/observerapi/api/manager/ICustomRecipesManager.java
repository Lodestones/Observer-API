package gg.lode.observerapi.api.manager;

import gg.lode.observerapi.api.exception.RecipeAddException;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public interface ICustomRecipesManager {
    Map<NamespacedKey, Recipe> recipesAdded();

    ShapedRecipe newEmptyShaped(String id, ItemStack result);

    ShapelessRecipe newEmptyShapeless(String id, ItemStack result);

    void add(ShapedRecipe recipe) throws RecipeAddException;

    void add(ShapelessRecipe recipe) throws RecipeAddException;

    boolean remove(String id);

    @Nullable
    Recipe get(String id);

    void reload();

    void save();

}
