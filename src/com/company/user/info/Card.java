package com.company.user.info;

public interface Card {
	
	//card
	//PAN
	//Person
	//Account
	//expiration
	//CVC
	
	String getPan();
	Person getPerson();
	Person[] getPersons();
	Account getAccount(int accountId);
	Account[] getAccounts();
	String getExpiration();
	String getCVC();
	
	

}
