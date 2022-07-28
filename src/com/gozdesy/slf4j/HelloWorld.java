package com.gozdesy.slf4j;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
	
	private static Logger slf4jLogger = LoggerFactory.getLogger(HelloWorld.class);


    public void sayHello(String name) {
        slf4jLogger.info("Hi, {}", name);
        slf4jLogger.info("Welcome to the HelloWorld example of Log4j using SLF4J");
    }

    public static void main(String[] args) {
    	
    	HelloWorld slf4jHello = new HelloWorld();
    	String log4jConfPath = "/Users/gozde/eclipse-workspace/Log4J-SLF4J/src/com/gozdesy/slf4j/mylog4j.xml";
    	PropertyConfigurator.configure(log4jConfPath);
        slf4jHello.sayHello("hi");
    }

}
