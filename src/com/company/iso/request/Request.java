package com.company.iso.request;

public interface Request {
	//sample request = 200 54211 00 00000000000 225 12456
	
	//MTI
	//200
//PAN
//Processing Code
//AMOUNT
//Trace number
//transmission Time
//cvc
//network
	String getPan();
	String getMTI();
	String getProcessingCode();
//	String getTraceNumber();
	long getTransmissionTime();
	double getAmount();
	int getCVC();
	String getNetwork();
}
