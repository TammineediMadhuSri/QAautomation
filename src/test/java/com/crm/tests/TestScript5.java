package com.crm.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountService5;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.validators.Validation1;

public class TestScript5 {
	LoginService loginService = null;
	HomeService homeService = null;
	AccountService5 accountService5 = null;
	Validation1 validation1 = null;
	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;

	@BeforeClass
	public void init() {
		loginService = new LoginService();
		homeService = new HomeService();
		accountService5 = new AccountService5();

		crmLoginData = CrmTestData.getTestData();
		InitializeViews.init();

		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication();
		
	//	validation1 = new Validation1();

	}

	@Test(description = "it creates account with billing address", priority = 0)
	public void createAccountWithBillingAddress() throws InterruptedException {

		homeService.clickOnAccounts();
		accountService5.clickOnCreateAccount();
		accountService5.insertAccountNameAndEmail();
		accountService5.insertAccountWebSite();
		accountService5.insertPhoneNumber();
		accountService5.insertAccountBillingAddress();
		accountService5.CopyBillingAddress();
		accountService5.SaveTheDetails();
		validation1.validateAccountBillingStreet(accountService5);

	}

}
