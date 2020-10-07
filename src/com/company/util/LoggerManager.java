package com.company.util;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerManager {
	
	
	private static Logger logger = null;
	
	private static final String LOG_OUTPUT_DIRECTORY = ".\\dist\\logs\\";
	
	private static String filename = null;
	
	private static LoggerManager INSTANCE = null;
	
	private LoggerManager() {
		
	}
	
	public static LoggerManager getSoleInstance() {
		if(INSTANCE == null) {
			init();// this isn't good but will work for this example
			INSTANCE = new LoggerManager();
		} 
		
		return INSTANCE;
	}
	
	public Logger getLogger() {
		return logger;
	}

	private static void init() {
		logger = Logger.getLogger(LoggerManager.class.getName());
		try {
			String date = LocalDateTime.now()+"";
			StringBuilder filenameBuilder = new StringBuilder("iso_processor-");
			filenameBuilder.append(date.substring(0,10)).append(".log");
			
			filename = filenameBuilder.toString();
			FileHandler fileHandler = new FileHandler(LOG_OUTPUT_DIRECTORY+filename, true);
			fileHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(fileHandler);
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		LoggerManager.getSoleInstance().getLogger();
	}

}
