package com.bfl.raptureinnovations.common.config;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
  /**
   * Common specific configuration
   */
  public static class Common {
    // public final BooleanValue chestsKeepInventory;
    Common(ForgeConfigSpec.Builder builder) {
      builder.comment("Gameplay settings").push("gameplay");
      // ADD GAMEPLAY SETTINGS
      // this.chestsKeepInventory = builder
      // .comment("Pattern and Part chests keep their inventory when harvested.")
      // .translation("tconstruct.configgui.chestsKeepInventory")
      // .worldRestart()
      // .define("chestsKeepInventory", true);
      builder.pop();

      builder.comment("World generation settings").push("worldgen");
      // ADD WORLD GENERATION SETTINGS
      builder.pop();
    }
  }

  /**
   * Client specific configuration - only loaded client-side from
   * raptureinnovations-client.toml
   */
  public static class Client {
    Client(ForgeConfigSpec.Builder builder) {
      builder.comment("Client only settings").push("client");
      builder.pop();
    }
  }

  public static final ForgeConfigSpec clientSpec;
  public static final Client CLIENT;

  static {
    final Pair<Client, ForgeConfigSpec> sPair = new ForgeConfigSpec.Builder().configure(Client::new);
    clientSpec = sPair.getRight();
    CLIENT = sPair.getLeft();
  }

  public static final ForgeConfigSpec commonSpec;
  public static final Common COMMON;

  static {
    final Pair<Common, ForgeConfigSpec> sPair = new ForgeConfigSpec.Builder().configure(Common::new);
    commonSpec = sPair.getRight();
    COMMON = sPair.getLeft();
  }
}
