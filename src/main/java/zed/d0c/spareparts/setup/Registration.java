package zed.d0c.spareparts.setup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import zed.d0c.spareparts.SpareParts;
import zed.d0c.spareparts.items.Coin;
import zed.d0c.spareparts.items.Part;

public class Registration {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpareParts.MODID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> WOODEN_COIN  = ITEMS.register("coins/wooden_coin" , () -> new Coin( 1, new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> STONE_COIN   = ITEMS.register("coins/stone_coin"  , () -> new Coin( 2, new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> COPPER_COIN  = ITEMS.register("coins/copper_coin" , () -> new Coin( 5, new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> IRON_COIN    = ITEMS.register("coins/iron_coin"   , () -> new Coin(10, new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> GOLDEN_COIN  = ITEMS.register("coins/golden_coin" , () -> new Coin(20, new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> DIAMOND_COIN = ITEMS.register("coins/diamond_coin", () -> new Coin(50, new Item.Properties().group(ModSetup.ITEM_GROUP)));

    public static final RegistryObject<Item> SCRAP          = ITEMS.register("scrap",           () -> new Part(new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> TOOL_PART      = ITEMS.register("tool_part",       () -> new Part(new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> PAPER_FRAGMENT = ITEMS.register("paper_fragment",  () -> new Part(new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> VALUABLE_SHARD = ITEMS.register("valuable_shard",  () -> new Part(new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> SMALL_MOTOR    = ITEMS.register("small_motor",     () -> new Part(new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> UNUSED_ITEM_01 = ITEMS.register("item_01", () -> new Part(new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> UNUSED_ITEM_02 = ITEMS.register("item_02", () -> new Part(new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> UNUSED_ITEM_03 = ITEMS.register("item_03", () -> new Part(new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> UNUSED_ITEM_04 = ITEMS.register("item_04", () -> new Part(new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> UNUSED_ITEM_05 = ITEMS.register("item_05", () -> new Part(new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> UNUSED_ITEM_06 = ITEMS.register("item_06", () -> new Part(new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> UNUSED_ITEM_07 = ITEMS.register("item_07", () -> new Part(new Item.Properties().group(ModSetup.ITEM_GROUP)));


}
