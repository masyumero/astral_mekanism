package astral_mekanism.util;

import astral_mekanism.block.block.AMEAttributeAstralUpgradeable;
import mekanism.common.content.blocktype.BlockType;
import mekanism.common.registration.impl.BlockRegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class AMEUpgradeableUtils {

    private static final List<BlockUpgradeBlock> BLOCK_UPGRADE_BLOCKS = new ArrayList<>();

    private static void addAttributeUpgradeable(BlockType type, BlockRegistryObject<?, ?> upgradeBlock) {
        type.add(new AMEAttributeAstralUpgradeable(() -> upgradeBlock));
    }

    public static void addDeferredAttributeUpgradeable(Supplier<BlockType> block, BlockRegistryObject<?, ?> upgradeBlock) {
        BLOCK_UPGRADE_BLOCKS.add(new BlockUpgradeBlock(block, upgradeBlock));
    }

    public static void applyDeferredAttributeUpgradeable() {
        BLOCK_UPGRADE_BLOCKS.forEach(blockUpgradeBlock ->
                addAttributeUpgradeable(blockUpgradeBlock.block.get(), blockUpgradeBlock.upgradeBlock)
        );
    }

    private record BlockUpgradeBlock(Supplier<BlockType> block, BlockRegistryObject<?, ?> upgradeBlock) {}
}
