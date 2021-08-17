package com.crm.validators;

import com.crm.services.AccountService;

import junit.framework.Assert;

public class CreateAccountValidation {

	public void validateAccountName(AccountService accountService) {
		String insertedAccountName = "Madhu";

		String accountName = accountService.getCreatedAccountName();

		Assert.assertEquals(insertedAccountName, accountName);
	}

	public void validateAddress(AccountService accountService) {
		String Street = "MVP Colony";
		String City = "vizag";
		String State = "AP";
		String Zip = "123456789";
		String Country = "India";
		
		String billingAddress = accountService.getBillingAdressFromWebPage(); 
		
		String line[] = billingAddress.split("\\r?\\n");
		String[] lineIn = line[1].split(" ");
		String removeComm = lineIn[0].replace(",", "");
		
		System.out.println(line[0]);
		System.out.println(line[1]);
		System.out.println(line[2]);
		Assert.assertEquals(Street, line[0]);
		Assert.assertEquals(City, removeComm);
		Assert.assertEquals(State, lineIn[1]);
		Assert.assertEquals(Zip, lineIn[2]);
		Assert.assertEquals(Country, line[2]);
		
	}

	
	
	/*public void validateEmail(AccountService accountService) {
		String insertEmail = "madhu@gmail.com";
		String accountEmail = accountService.insertAccountNameAndEmail();
		Assert.assertEquals(accountEmail, insertEmail);
		}
	
	public void validateWebsite(AccountService accountService) {
		String insertWebsite = "www.madhu.com";
		String accountWebsite = accountService.insertAccountWebSite();
		Assert.assertEquals(accountWebsite, insertWebsite);
	}

	public void validateAddress(AccountService accountService) {
		String insertBillingStreet = "MVP Colony";
		String billingStreet = accountService.insertAccountBillingAddress();
		Assert.assertEquals(billingStreet, insertBillingStreet);

		String insertBillingCity = "Hyderabad";
		String billingCity = accountService.insertAccountBillingAddress();
		Assert.assertEquals(billingCity, insertBillingCity);

		String insertBillingState = "AP";
		String billingState = accountService.insertAccountBillingAddress();
		Assert.assertEquals(billingState, insertBillingState);

		String insertBillingCountry = "India";
		String billingCountry = accountService.insertAccountBillingAddress();
		Assert.assertEquals(billingCountry, insertBillingCountry);
	}*/

}
