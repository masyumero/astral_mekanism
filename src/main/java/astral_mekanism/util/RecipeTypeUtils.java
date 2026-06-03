package astral_mekanism.util;

import java.util.function.Function;

import astral_mekanism.mixin.mekanism.recipe.MekanismRecipeTypeMixin;
import mekanism.api.recipes.MekanismRecipe;
import mekanism.common.recipe.MekanismRecipeType;
import mekanism.common.recipe.lookup.cache.IInputRecipeCache;
import mekanism.common.registration.impl.RecipeTypeDeferredRegister;
import mekanism.common.registration.impl.RecipeTypeRegistryObject;
import net.minecraft.resources.ResourceLocation;

public class RecipeTypeUtils {
    public static <MR extends MekanismRecipe, IIRC extends IInputRecipeCache> RecipeTypeRegistryObject<MR, IIRC> registerRecipeType(
            RecipeTypeDeferredRegister deferredRegister,
            String name,
            Function<String, ResourceLocation> idBuilder,
            Function<MekanismRecipeType<MR, IIRC>, IIRC> inputCacheCreator) {
        return deferredRegister.register(name, () -> {
            MekanismRecipeType<MR, IIRC> recipeType = MekanismRecipeTypeMixin.astral_mekanism$invokeNew(name,
                    (t) -> null);
            @SuppressWarnings("unchecked")
            MekanismRecipeTypeMixin<MR, IIRC> rtMixin = (MekanismRecipeTypeMixin<MR, IIRC>) (Object) recipeType;
            rtMixin.astral_mekanism$setRegistryName(idBuilder.apply(name));
            rtMixin.astral_mekanism$setInputCache(inputCacheCreator.apply(recipeType));
            return recipeType;
        });
    }
}
