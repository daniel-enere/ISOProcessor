package com.company.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionManager {
	
	private static final String PROPERTY_CONFIG_DIRECTORY = ".\\dist\\config";
	private static final String PROPERTY_CONFIG_FILENAME = "com_company_dbUtils_properties";
	private Logger logger = LoggerManager.getSoleInstance().getLogger();
	
	private static ConnectionManager INSTANCE = null;

	
	private Connection connection = null;
	
	private ConnectionManager() {
		
	}
	
	public static ConnectionManager getSoleInstance() {
		if(INSTANCE == null) {
			INSTANCE = new ConnectionManager();
		}
		
		return INSTANCE;
	}
	
	public Connection getConnection() {
		if(connection == null) {
			init();
		}
		
		return connection;
	}

	private void init() {
		Properties prop = new Properties();
		File propertyFile = new File(PROPERTY_CONFIG_DIRECTORY+PROPERTY_CONFIG_FILENAME);
		
		if(propertyFile.exists()) {			 
			try {
				FileReader propertyFileReader = new FileReader(propertyFile);
				prop.load(propertyFileReader);
			} catch (FileNotFoundException e1) {
				logger.log(Level.SEVERE, e1.getMessage());
			}catch (IOException e) {
				logger.log(Level.SEVERE, e.getMessage());
			}
			
			
		}else {
			logger.log(Level.SEVERE,PROPERTY_CONFIG_DIRECTORY+PROPERTY_CONFIG_FILENAME+" did not exist. Exiting application" );
			System.exit(-1);
		}
	}
	
	

}
