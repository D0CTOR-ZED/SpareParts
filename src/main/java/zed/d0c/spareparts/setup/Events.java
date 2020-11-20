package zed.d0c.spareparts.setup;

import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import zed.d0c.spareparts.SpareParts;

@Mod.EventBusSubscriber(modid= SpareParts.MODID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class Events {

    @SubscribeEvent
    public static void registerRecipeSerializers(RegistryEvent.Register<IRecipeSerializer<?>> event) {
        CraftingHelper.register(IcDefaultCoinRecipes.Serializer.INSTANCE);
    }

}
