package com.gozdesy.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jExample {
	
	private static final Logger logger = LogManager.getLogger(Log4jExample.class);  
	
	public static void main(String[] args) {  
		
	  // temel log4j konfigürasyonu aşağıdaki gibidir 
	  BasicConfigurator.configure();  
	  logger.info("hello world");  
	  logger.info("we are in logger info mode");  
	  logger.error("error");
	  logger.fatal("fatal error");
	  logger.warn("warning");
	  logger.debug("debug");
	  
	  System.out.println("------------------------------------------");
	  
	  logger.setLevel(Level.TRACE);

      logger.trace("Trace Message!");
      logger.debug("Debug Message!");
      logger.info("Info Message!");
      logger.warn("Warn Message!");
      logger.error("Error Message!");
      logger.fatal("Fatal Message!");
	}
}
