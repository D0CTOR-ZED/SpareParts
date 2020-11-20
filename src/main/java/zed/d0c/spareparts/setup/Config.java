package zed.d0c.spareparts.setup;


import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import zed.d0c.spareparts.SpareParts;

@Mod.EventBusSubscriber(modid = SpareParts.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {

    private static final Logger LOGGER = LogManager.getLogger();


    public static final CommonConfig COMMON;
    public static final ForgeConfigSpec COMMON_SPEC;
    static {
        final Pair<CommonConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(CommonConfig::new);
        COMMON_SPEC = specPair.getRight();
        COMMON = specPair.getLeft();
    }

    public static boolean bakedConfig = false;
    public static boolean defaultCoinRecipes;

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onModConfigEvent(final ModConfig.ModConfigEvent configEvent) {
        if (configEvent.getConfig().getSpec() == Config.COMMON_SPEC) {
            bakeConfig();
        }
    }

    public static void bakeConfig() {
        defaultCoinRecipes = COMMON.defaultCoinRecipes.get();
        bakedConfig = true;
    }

    public static class CommonConfig {

        public final ForgeConfigSpec.BooleanValue defaultCoinRecipes;

        public CommonConfig(ForgeConfigSpec.Builder builder) {
            builder.push("coins");
            defaultCoinRecipes = builder
                    .comment("Create coin exchange rate recipes")
                    .translation("spareparts.config.common.default_coin_recipes")
                    .define("default_coin_recipes",false);
            builder.pop();
        }
    }

}
