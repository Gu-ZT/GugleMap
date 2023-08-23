package dev.dubhe.guglemap;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(GugleMap.MODID)
@SuppressWarnings("unused")
public class GugleMap {
    public static final String MODID = "guglemap";
    private static final Logger LOGGER = LogManager.getLogger();

    public GugleMap() {
    }

    public static ResourceLocation of(String name) {
        return new ResourceLocation(GugleMap.MODID, name);
    }
}
