package com.crm.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.services.UserService;

public class UserTestScript {

	LoginService loginService = null;
	HomeService homeService = null;
	UserService userService = null;

	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;

	@BeforeClass
	public void init() {
		loginService = new LoginService();
		homeService = new HomeService();
		userService = new UserService();

		crmLoginData = CrmTestData.getTestData();
		// appData = crmLoginData.getCrmlogindata();

		InitializeViews.init();

		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication();

	}

	@Test
	public void CreateUserAccountwithdetails() throws InterruptedException {

		//homeService.clickOnDropDown();
		userService.clickOnUserDropDown();
		userService.clickOncreateUser();
		userService.insertusernameandemail();

		userService.insertPhoneNumber();
		userService.GeneratePassword();

		// userService.logoutAccount();
	}

}
