package com.crm.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountService;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.util.BaseListener;
import com.crm.validators.CreateAccountValidation;

public class CreateAccountTestScript extends BaseListener {
	
	LoginService loginService = null;
	HomeService homeService = null;
	AccountService accountService = null;
	CreateAccountValidation accountValidation = null;
	
	CrmLoginData crmLoginData = null;
	List<LoginData> appData =null;
	
	//static ExtentTest elogger;
	//static ExtentReports extent = new ExtentReports();

	@BeforeClass
	public void init() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("Reports//crm-test-result.html");
		
	//	extent.setSystemInfo("OS Name", "Windows");
	//	extent.setSystemInfo("Enviroment", "QA");
	//	reporter.config().setDocumentTitle("Crm automation test report for QA enviroment");
	//	extent.attachReporter(reporter);
	//	elogger = extent.createTest("Crm automation test cases");
		
		loginService = new LoginService();
		homeService = new HomeService();
		accountService = new AccountService();
		accountValidation = new CreateAccountValidation();
		
		crmLoginData = CrmTestData.getTestData();
	//	appData = crmLoginData.getCrmlogindata();
		InitializeViews.init();
		
		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication();
		test = extent.createTest("Functional Test Cases");
	}
	
/*	@AfterClass
	public void tearDown() {
		BrowserDriver.getCurrentDriver().quit();
		extent.flush();
	}
	
	@AfterMethod
	public void getResult(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			elogger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test case FAILED due to below issues:", ExtentColor.RED));
			elogger.fail(result.getThrowable());
		}else if(result.getStatus() == ITestResult.SUCCESS) {
			elogger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "Test Case PASSED", ExtentColor.GREEN));
		}else {
			elogger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Test Case SKIPPED", ExtentColor.ORANGE));
			elogger.skip(result.getThrowable());
		}
	}*/
	
	@Test(description = "it creates account with billing address", priority=0)
	public void createAccountWithBillingAddress()throws InterruptedException {
		
        homeService.clickOnAccounts();
		accountService.clickOnCreateAccount();
		accountService.insertAccountNameAndEmail();
		accountService.insertAccountWebSite();
		accountService.insertPhoneNumber();
		accountService.insertAccountBillingAddress();
		accountService.CopyBillingAddress();
		accountService.SaveTheDetails();
		accountService.getBillingAdressFromWebPage();
		
		BrowserDriver.getCurrentDriver().findElement(By.id("nav-menu-dropdown")).click();
		BrowserDriver.getCurrentDriver().findElement(By.linkText("Log Out")).click();
	//	accountValidation.validateAddress(accountService);
	//	elogger.pass("Test Case is Passed");
	//	accountValidation.validateAccountName(accountService);
	//	accountValidation.validateWebsite(accountService);
	//	accountValidation.validateEmail(accountService);
	//	accountValidation.validateAddress(accountService);
	}
	
	/*@Test(description = "it edits the account", priority=1)
		public void editAccount() throws InterruptedException {
		accountService.EditTheDetails();
		accountService.EditAccountName();
		accountService.SaveTheDetails();
	}
	
	
	@Test(description = "it delete the account", priority=2)
	    public void txtDeleteTheDetails() {
			accountService.DeleteAccount();
	}*/

}
