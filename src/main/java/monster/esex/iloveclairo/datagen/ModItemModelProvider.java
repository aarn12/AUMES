package monster.esex.iloveclairo.datagen;

import monster.esex.iloveclairo.Iloveclairo;
import monster.esex.iloveclairo.register.BlockInit;
import monster.esex.iloveclairo.register.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Iloveclairo.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ItemInit.AMONGUY);
        simpleBlockItem(BlockInit.SUS_BLOCK);

        simpleItem(ItemInit.JACARANDA_SIGN);
        simpleItem(ItemInit.JACARANDA_HANGING_SIGN);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Iloveclairo.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Iloveclairo.MOD_ID,"block/" + item.getId().getPath()));
    }

}
