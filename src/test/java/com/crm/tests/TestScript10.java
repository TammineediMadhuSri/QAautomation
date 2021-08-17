package com.crm.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountService10;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.validators.CreateAccountValidation;

public class TestScript10 {
	LoginService loginService = null;
	HomeService homeService = null;
	AccountService10 accountService10 = null;
	CreateAccountValidation accountValidation = null;

	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;

	@BeforeClass
	public void init() {
		loginService = new LoginService();
		homeService = new HomeService();
		accountService10 = new AccountService10();
		accountValidation = new CreateAccountValidation();

		crmLoginData = CrmTestData.getTestData();
		// appData = crmLoginData.getCrmlogindata();
		InitializeViews.init();

		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication();

	}

	@Test(description = "it creates account with billing address", priority = 0)
	public void createAccountWithBillingAddress() throws InterruptedException {

		homeService.clickOnAccounts();
		accountService10.clickOnCreateAccount();
		accountService10.insertAccountNameAndEmail();
		accountService10.insertAccountWebSite();
		accountService10.insertPhoneNumber();
		accountService10.insertAccountBillingAddress();
		accountService10.CopyBillingAddress();
		accountService10.SaveTheDetails();
	}

	@Test(description = "it delete the account", priority = 1)
	public void txtDeleteTheDetails() {
		accountService10.DeleteAccount();
	}

}
