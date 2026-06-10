package astral_mekanism.block.block;

import mekanism.common.block.attribute.Attribute;
import mekanism.common.block.states.BlockStateHelper;
import mekanism.common.registration.impl.BlockRegistryObject;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class AMEAttributeAstralUpgradeable implements Attribute {

    private final Supplier<BlockRegistryObject<?, ?>> upgradeBlock;

    public AMEAttributeAstralUpgradeable(Supplier<BlockRegistryObject<?, ?>> upgradeBlock) {
        this.upgradeBlock = upgradeBlock;
    }

    @NotNull
    public BlockState upgradeResult(@NotNull BlockState current) {
        return BlockStateHelper.copyStateData(current, upgradeBlock.get());
    }
}