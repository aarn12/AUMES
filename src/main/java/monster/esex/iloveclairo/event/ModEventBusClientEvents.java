package monster.esex.iloveclairo.event;

import monster.esex.iloveclairo.Iloveclairo;
import monster.esex.iloveclairo.entity.ModBoatEntity;
import monster.esex.iloveclairo.entity.client.ModModelLayers;
import monster.esex.iloveclairo.register.BlockEntityInit;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Iloveclairo.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.JACARANDA_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.JACARANDA_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
    }

    @SubscribeEvent
    public static void registerBlockEvents(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(BlockEntityInit.MOD_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(BlockEntityInit.MOD_HANGING_SIGN.get(), HangingSignRenderer::new);
    }
}
