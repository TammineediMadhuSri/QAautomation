package com.crm.services;

import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

import com.crm.config.BrowserDriver;
import com.crm.pages.LoginContainerPage;

public class LoginService {
	
	public static LoginContainerPage loginContainerPage;
	private static Logger log = Logger.getLogger(LoginService.class);
	
	//reusable application login method
	public void loginToApplication() {
		loginContainerPage.getTxtFieldUserName().sendKeys("admin");
		loginContainerPage.getTxtFieldPassword().sendKeys("admin");
		loginContainerPage.getLoginButton().click();
		log.info("User logged into Crm Application");
		
	}
	public static void init() {
		loginContainerPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginContainerPage.class);
	}

}
