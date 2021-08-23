package com.crm.validators;

import org.testng.Assert;

import com.crm.services.AccountService1;
import com.crm.services.AccountService2;
import com.crm.services.AccountService3;
import com.crm.services.AccountService4;
import com.crm.services.AccountService5;
import com.crm.services.AccountService6;
import com.crm.services.AccountService7;
import com.crm.services.AccountService8;


public class Validation1 {
	
	public void validateAccountName(AccountService1 accountService1) {
		String insertedAccountName = "Madhu";

		String accountName = accountService1.getCreatedAccountName();

		Assert.assertEquals(insertedAccountName, accountName);

}

	public void validateAccountEmail(AccountService2 accountService2) {
		String insertedAccountEmail = "madhu@gmail.com";
		String accountEmail = accountService2.getCreatedAccountEmail();
		
		Assert.assertEquals(insertedAccountEmail, accountEmail);
		
		
	}

	public void validateAccountWebSite(AccountService3 accountService3) {
		String insertedAccountWebSite = "www.baru.com";
		String accountWebSite = accountService3.getCreatedAccountWebSite();
		
		Assert.assertEquals(insertedAccountWebSite, accountWebSite);
		
	}

	public void validateAccountPhoneNumber(AccountService4 accountService4) {
		String insertedAccountPhoneNumber = "9876543217";
		String accountPhoneNumber = accountService4.getCreatedAccountPhoneNumber();
		
		Assert.assertEquals(insertedAccountPhoneNumber, accountPhoneNumber);
		
	}

	public void validateAccountBillingStreet(AccountService5 accountService5) {
		String insertedAccountBillingStreet = "Madhurwada";
		String accountBillingStreet = accountService5.getCreatedAccountBillingStreet();
		
		Assert.assertEquals(insertedAccountBillingStreet, accountBillingStreet);
		
	}

	public void validateAccountBillingCity(AccountService6 accountService6) {
		String insertedAccountBillingCity = "vizag";
		String accountBillingCity = accountService6.getCreatedAccountBillingCity();
		
		Assert.assertEquals(insertedAccountBillingCity, accountBillingCity);
		
	}
	
	public void validateAccountBillingState(AccountService7 accountService7) {
		String insertedAccountBillingState = "AP";
		String accountBillingState = accountService7.getCreatedAccountBillingState();
		
		Assert.assertEquals(insertedAccountBillingState, accountBillingState);
		
	}

	public void validateAccountBillingPostalCode(AccountService8 accountService8) {
		String insertedAccountBillingPostalCode = "530012";
		String accountBillingPostalCode = accountService8.getCreatedAccountBillingPostalCode();
		
		Assert.assertEquals(insertedAccountBillingPostalCode, accountBillingPostalCode);
		
	}

	
	

}
