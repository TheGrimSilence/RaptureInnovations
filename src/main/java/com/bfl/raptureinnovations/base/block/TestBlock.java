package com.bfl.raptureinnovations.base.block;

import com.bfl.raptureinnovations.library.Util;

import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * A simple test block.
 */
public class TestBlock extends Block {

  public static final Logger log = Util.getLogger("block");

  public TestBlock(Properties properties) {
    super(properties);
  }

  @Override
  public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
    super.onBlockHarvested(worldIn, pos, state, player);
    log.info("block harvested!");
  }
}
