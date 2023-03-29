package jax.nosoupfly.proxy;

import jax.nosoupfly.init.ChatListener;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {
	
	public void registerRenders() {
		
	}
	
	public void registerEventHandlers() {
		MinecraftForge.EVENT_BUS.register(new ChatListener());
	}
	
}
