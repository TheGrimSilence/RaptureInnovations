package com.bfl.raptureinnovations;

import com.bfl.raptureinnovations.base.RaptureBase;
import com.bfl.raptureinnovations.common.RaptureModule;
import com.bfl.raptureinnovations.common.config.Config;
import com.bfl.raptureinnovations.library.Util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RaptureInnovations.modID)
// Add auto update logic
// https://mcforge.readthedocs.io/en/latest/gettingstarted/autoupdate/
public class RaptureInnovations {
  public static final String modID = Util.modID;

  public static final Logger log = LogManager.getLogger(modID);

  public static RaptureInnovations instance;

  public RaptureInnovations() {
    instance = this;

    // get configs
    ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.commonSpec);
    ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.clientSpec);

    // MinecraftForge.EVENT_BUS.register(this);
    // initialize modules
    IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

    // Base
    bus.register(new RaptureBase());

    // init deferred registers
    RaptureModule.initRegisters();
  }
}
