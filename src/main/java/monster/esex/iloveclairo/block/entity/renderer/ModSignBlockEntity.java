package monster.esex.iloveclairo.block.entity.renderer;

import monster.esex.iloveclairo.register.BlockEntityInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ModSignBlockEntity extends SignBlockEntity {
    public ModSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(BlockEntityInit.MOD_SIGN.get(), pPos, pBlockState);
    }


    @Override
    public BlockEntityType<?> getType() {
        return BlockEntityInit.MOD_SIGN.get();
    }
}
