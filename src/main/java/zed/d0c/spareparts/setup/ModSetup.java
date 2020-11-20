package zed.d0c.spareparts.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import zed.d0c.spareparts.SpareParts;

@Mod.EventBusSubscriber(modid = SpareParts.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {
    public static final ItemGroup ITEM_GROUP = new ItemGroup("spareparts") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Registration.WOODEN_COIN.get());
        }
    };
}
