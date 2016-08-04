package TeamRoots.Goetia.proxy;

import TeamRoots.Goetia.common.util.handler.ConfigHandler;
import TeamRoots.Goetia.registry.MainRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by TeamRoots on 4.8.2016.
 */
public abstract class CommonProxy implements IProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        ConfigHandler.init(e.getSuggestedConfigurationFile());
        MainRegistry.register();
        registerEvents();
    }

    @Override
    public void init(FMLInitializationEvent e) {

    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {

    }

    private void registerEvents()
    {
        MinecraftForge.EVENT_BUS.register(new ConfigHandler());
    }
}