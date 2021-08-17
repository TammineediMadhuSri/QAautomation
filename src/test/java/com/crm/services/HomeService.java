package com.crm.services;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.crm.config.BrowserDriver;
import com.crm.pages.HomeContainerPage;

public class HomeService {
	
	public static HomeContainerPage homeContainerPage;
	private static Logger log = Logger.getLogger(HomeService.class);
	
	public HomeService clickOnAccounts() {
		homeContainerPage.getHomePageAccountsTab().click();
		log.info("Account page opened");
		return this;
	}
	/*public void clickOnDropDown() {
		homeContainerPage.getClickOnDropdownElement().click();
		log.info("User page opened");
	}*/

	
	public static void init() {
		
		homeContainerPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), HomeContainerPage.class);
	}


}