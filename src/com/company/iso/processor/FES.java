package com.company.iso.processor;

import java.util.logging.Logger;

import com.company.iso.request.Request;
import com.company.iso.response.Response;
import com.company.util.LoggerManager;

public class FES {
	
	private Logger logger = LoggerManager.getSoleInstance().getLogger();
	private Response response = null;
	private Request request = null;

	public static void main(String[] args) {
				
		//parseISO message
		//create objs from parsed message
		//process the transaction
			//get info from db if available
				//if available get balance info
				//check if transaction matches db info
		//generate appropriate response
		//send response as a string
			
		

	}

}
