package com.company.iso.request;

public interface Request {
	
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
