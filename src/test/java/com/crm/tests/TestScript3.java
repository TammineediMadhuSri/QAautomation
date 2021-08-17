package com.crm.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountService3;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.validators.Validation1;

public class TestScript3 {
	LoginService loginService = null;
	HomeService homeService = null;
	AccountService3 accountService3 = null;
	Validation1 validation1 = null;
	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;

	@BeforeClass
	public void init() {
		loginService = new LoginService();
		homeService = new HomeService();
		accountService3 = new AccountService3();

		crmLoginData = CrmTestData.getTestData();
		InitializeViews.init();

		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication();
		
		validation1 = new Validation1();

	}

	@Test(description = "it creates account with billing address", priority = 0)
	public void createAccountWithBillingAddress() throws InterruptedException {

		homeService.clickOnAccounts();
		accountService3.clickOnCreateAccount();
		accountService3.insertAccountNameAndEmail();
		accountService3.insertAccountWebSite();
		accountService3.insertPhoneNumber();
		accountService3.insertAccountBillingAddress();
		accountService3.CopyBillingAddress();
		accountService3.SaveTheDetails();
		validation1.validateAccountWebSite(accountService3);

	}

}
