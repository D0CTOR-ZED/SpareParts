package zed.d0c.spareparts.setup;

import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;
import zed.d0c.spareparts.SpareParts;

import static zed.d0c.spareparts.setup.Config.COMMON;
import static zed.d0c.spareparts.setup.Config.bakedConfig;


public final class IcDefaultCoinRecipes implements ICondition {
    public static final IcDefaultCoinRecipes INSTANCE = new IcDefaultCoinRecipes();
    private static final ResourceLocation NAME = new ResourceLocation(SpareParts.MODID, "default_coin_recipes");

    private IcDefaultCoinRecipes() {
    }

    @Override
    public ResourceLocation getID() {
        return NAME;
    }

    @Override
    public boolean test() {
        return (true || bakedConfig) ? Config.defaultCoinRecipes : COMMON.defaultCoinRecipes.get();
    }

    @Override
    public String toString() {
        return "Config value: "+test();
    }

    public static class Serializer implements IConditionSerializer<IcDefaultCoinRecipes> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void write(JsonObject json, IcDefaultCoinRecipes value) {}

        @Override
        public IcDefaultCoinRecipes read(JsonObject json) {
            return IcDefaultCoinRecipes.INSTANCE;
        }

        @Override
        public ResourceLocation getID() {
            return IcDefaultCoinRecipes.NAME;
        }
    }
}
