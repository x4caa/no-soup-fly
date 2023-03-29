package jax.nosoupfly;

import java.io.IOException;
import jax.nosoupfly.init.ChatListener;
import jax.nosoupfly.proxy.ClientProxy;
import jax.nosoupfly.proxy.CommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class CobraUtilities {
		
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Mod.Instance("CU")
	public static CobraUtilities instance;
	
	@EventHandler()
	public static void preInit(FMLPreInitializationEvent event) { 
		proxy.registerEventHandlers();
	}
	
	@EventHandler()
	public static void init(FMLInitializationEvent event) throws IOException { 
		proxy.registerRenders();
	}
	
	@EventHandler()
	public static void postInit(FMLPostInitializationEvent event) { 
		
	}
	
}
