package com.bfl.raptureinnovations.library;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Util {
  public static final String modID = "raptureinnovations";

  public static Logger getLogger(String type) {
    String log = modID;

    return LogManager.getLogger(log + "-" + type);
  }

}
