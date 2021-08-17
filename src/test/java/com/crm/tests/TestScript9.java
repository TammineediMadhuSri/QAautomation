package com.crm.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountService9;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.validators.CreateAccountValidation;

public class TestScript9 {
	LoginService loginService = null;
	HomeService homeService = null;
	AccountService9 accountService9 = null;
	CreateAccountValidation accountValidation = null;
	
	CrmLoginData crmLoginData = null;
	List<LoginData> appData =null;

	@BeforeClass
	public void init() {
		loginService = new LoginService();
		homeService = new HomeService();
		accountService9 = new AccountService9();
		accountValidation = new CreateAccountValidation();
		
		crmLoginData = CrmTestData.getTestData();
	//	appData = crmLoginData.getCrmlogindata();
		InitializeViews.init();
		
		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication();
		
	}
	
	
	@Test(description = "it creates account with billing address", priority=0)
	public void createAccountWithBillingAddress()throws InterruptedException {
		
        homeService.clickOnAccounts();
		accountService9.clickOnCreateAccount();
		accountService9.insertAccountNameAndEmail();
		accountService9.insertAccountWebSite();
		accountService9.insertPhoneNumber();
		accountService9.insertAccountBillingAddress();
		accountService9.CopyBillingAddress();
		accountService9.SaveTheDetails();
	}
	
	@Test(description = "it edits the account", priority=1)
		public void editAccount() throws InterruptedException {
		accountService9.EditTheDetails();
		accountService9.EditAccountName();
		accountService9.SaveTheDetails();
	}

}
