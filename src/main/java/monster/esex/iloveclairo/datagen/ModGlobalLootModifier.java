package monster.esex.iloveclairo.datagen;

import monster.esex.iloveclairo.Iloveclairo;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifier extends GlobalLootModifierProvider {
    public ModGlobalLootModifier(PackOutput output) {
        super(output, Iloveclairo.MOD_ID);
    }

    @Override
    protected void start() {

    }
}
