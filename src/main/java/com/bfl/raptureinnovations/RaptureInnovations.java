package com.bfl.raptureinnovations;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("raptureinnovations")
public class RaptureInnovations {
  public static final String MODID_STRING = "raptureinnovations";

  public RaptureInnovations() {
    MinecraftForge.EVENT_BUS.register(this);
  }
}
