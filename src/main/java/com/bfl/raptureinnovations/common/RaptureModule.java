package com.bfl.raptureinnovations.common;

import javax.annotation.Nullable;

import com.bfl.raptureinnovations.RaptureInnovations;
import com.bfl.raptureinnovations.common.registration.BlockDeferredRegisterExtension;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class RaptureModule {
  // deferred register instances
  protected static final BlockDeferredRegisterExtension BLOCKS = new BlockDeferredRegisterExtension(
      RaptureInnovations.modID);

  /**
   * Called during construction to initialize the registers for this mod.
   */
  public static void initRegisters() {
    IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    BLOCKS.register(bus);
  }

  protected static AbstractBlock.Properties builder(Material material, @Nullable ToolType toolType,
      SoundType soundType) {
    // noinspection ConstantConditions
    return AbstractBlock.Properties.create(material).harvestTool(toolType).sound(soundType);
  }

  /**
   * Creates a Rapture Innovations resource location.
   * 
   * @param id
   * @return
   */
  protected static ResourceLocation location(String id) {
    return new ResourceLocation(RaptureInnovations.modID, id);
  }

  /**
   * Creates a Rapture Innovations resource location string.
   * 
   * @param id
   * @return
   */
  protected static String locationString(String id) {
    return RaptureInnovations.modID + ":" + id;
  }
}
