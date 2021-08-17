package com.crm.tests;


//import java.io.File;
import java.util.List;

//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountService1;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.validators.Validation1;

public class AccountTestScript1 {
	LoginService loginService = null;
	HomeService homeService = null;
	AccountService1 accountService1 = null;
	Validation1 validation1 = null;
	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;

	@BeforeClass
	public void init() {
		loginService = new LoginService();
		homeService = new HomeService();
		accountService1 = new AccountService1();

		crmLoginData = CrmTestData.getTestData();
		InitializeViews.init();

		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication();
		
		validation1 = new Validation1();

	}

	@Test(description = "it creates account with billing address", priority = 0)
	public void createAccountWithBillingAddress() throws InterruptedException {

		homeService.clickOnAccounts();
		accountService1.clickOnCreateAccount();
		accountService1.insertAccountNameAndEmail();
		accountService1.insertAccountWebSite();
		accountService1.insertPhoneNumber();
		accountService1.insertAccountBillingAddress();
		accountService1.CopyBillingAddress();
		accountService1.SaveTheDetails();
		validation1.validateAccountName(accountService1);

	}
	
}
