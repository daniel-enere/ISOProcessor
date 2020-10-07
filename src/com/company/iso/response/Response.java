package com.company.iso.response;

public interface Response {
	
	//MTI
	//200
//PAN
//Processing Code
//AMOUNT
//Trace number
//transmission Time
//cvc
//network
	String getMTI();
	
	String getPAN();
	
	String getTraceNumber();

	int getResponseCode();
	
	long getTransmissionTime();
}
