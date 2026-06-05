package astral_mekanism.recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import astral_mekanism.AMEConstants;
import astral_mekanism.registries.AMEItems;
import astral_mekanism.registries.AMEMachines;
import mekanism.api.providers.IBlockProvider;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.level.ItemLike;

public class BuildAppliedMachineRecipe {

    public static void build(Consumer<FinishedRecipe> consumer, Function<ItemLike, CriterionTriggerInstance> function) {
        LIST.forEach(data -> {
            ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, data.applied)
                    .pattern("ACA")
                    .pattern("CXC")
                    .pattern("ACA")
                    .define('A', AMEItems.AUTONOMY_ALLOY_INGOT)
                    .define('C', AMEItems.AUTONOMY_PROCESSOR)
                    .define('X', data.astral)
                    .unlockedBy("has_astral", function.apply(data.astral))
                    .save(consumer, AMEConstants.rl("crafting/applied_machine"
                            + data.applied.getRegistryName().getPath().replace("applied_", "")));
        });
    }

    private static final List<AppliedAndAstral> LIST = new ArrayList<>();

    private static record AppliedAndAstral(IBlockProvider applied, ItemLike astral) {
    }

    static {
        LIST.add(new AppliedAndAstral(AMEMachines.APPLIED_CRUSHER, AMEMachines.ASTRAL_CRUSHER));
        LIST.add(new AppliedAndAstral(AMEMachines.APPLIED_ENRICHMENT_CHAMBER, AMEMachines.ASTRAL_ENRICHMENT_CHAMBER));
    }
}
