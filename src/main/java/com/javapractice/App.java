package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	 private static final Logger LOG=LogManager.getLogger(App.class);
	public static void main( String[] args )
    {
    	String message = "HelloJava";
    	LOG.debug(message + "will be printing on debug");
    	LOG.info(message + "will be printing on info");
    	LOG.warn(message + "will be printing on warn");
    	LOG.error(message + "will be printing on error");
    	LOG.fatal(message + "will be printing on fatal");
    	LOG.info("Appending string: {}", message);
		System.out.println( message );
    }
}
