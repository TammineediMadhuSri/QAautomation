package com.crm.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountService2;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.validators.Validation1;

public class TestScript2 {
	LoginService loginService = null;
	HomeService homeService = null;
	AccountService2 accountService2 = null;
	Validation1 validation1 = null;
	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;

	@BeforeClass
	public void init() {
		loginService = new LoginService();
		homeService = new HomeService();
		accountService2 = new AccountService2();

		crmLoginData = CrmTestData.getTestData();
		InitializeViews.init();

		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication();
		
		validation1 = new Validation1();

	}

	@Test(description = "it creates account with billing address", priority = 0)
	public void createAccountWithBillingAddress() throws InterruptedException {

		homeService.clickOnAccounts();
		accountService2.clickOnCreateAccount();
		accountService2.insertAccountNameAndEmail();
		accountService2.insertAccountWebSite();
		accountService2.insertPhoneNumber();
		accountService2.insertAccountBillingAddress();
		accountService2.CopyBillingAddress();
		accountService2.SaveTheDetails();
		validation1.validateAccountEmail(accountService2);

	}

}
