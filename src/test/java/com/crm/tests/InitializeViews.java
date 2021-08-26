package com.crm.tests;

import org.openqa.selenium.WebDriver;

import com.crm.config.BrowserDriver;
import com.crm.services.AccountService;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
//import com.crm.services.UserService;

public class InitializeViews {
	
	protected static WebDriver driver = null;

	public static void init() {
		driver = BrowserDriver.getCurrentDriver();
		LoginService.init();
		HomeService.init();
	//	UserService.init();
		AccountService.init();
	//	AccountService1.init();
	//	AccountService2.init();
	//	AccountService3.init();
	//	AccountService4.init();
	//	AccountService5.init();
	//	AccountService6.init();
	//	AccountService7.init();
	//	AccountService8.init();
	//	AccountService9.init();
	//	AccountService10.init();
		
	}

}
