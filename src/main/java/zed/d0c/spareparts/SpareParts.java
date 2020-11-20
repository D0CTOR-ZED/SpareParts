/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  SPARE PARTS
 *      A collection of useless items, for mod pack makers.
 *
 *  Copyright (c) 2020 D0CTOR ZED
 *
 *  This code is licensed under the MIT License, available in the root folder.
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
package zed.d0c.spareparts;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import zed.d0c.spareparts.setup.Config;
import zed.d0c.spareparts.setup.Registration;

// Reminder: This value needs to match the entry in META-INF/mods.toml
@Mod(SpareParts.MODID)
public class SpareParts {
    public static final String MODID = "spareparts";
    public SpareParts()
    {
        Registration.init();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_SPEC);

    }

}
