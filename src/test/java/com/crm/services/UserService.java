package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pages.UserContainerPage;
import com.crm.util.CommonUtil;

public class UserService {

	public static UserContainerPage userContainerPage;
	private static Logger log = Logger.getLogger(UserService.class);

	public UserService clickOnUserDropDown() {
		userContainerPage.getClickOnUsersDropDown().click();
		return this;
	}

	public UserService clickOncreateUser() {
		userContainerPage.getClickOnCreateUser().click();
		return this;

	}

	public UserService insertusernameandemail() {
		userContainerPage.getInsertUserName().sendKeys("Prameela");
		BrowserDriver.selectDropDownItem(userContainerPage.getSelectNameTitle(), "Mr.");
		userContainerPage.getSelectNameTitle().sendKeys();
		// userPageContainer.getSelectNameTitle().click();
		userContainerPage.getInsertFirstName().sendKeys("Pammi");
		userContainerPage.getInsertLastName().sendKeys("Padma");
		userContainerPage.getInsertEmail().sendKeys("pammi@gmail.com");
		return this;
	}

	public UserService insertPhoneNumber() {

		String num = Integer.toString(CommonUtil.generateRandomNumber());
		BrowserDriver.selectDropDownItem(userContainerPage.getGetPhoneDropdown(), "Mobile");
		userContainerPage.getTxtPhoneNumber().sendKeys(num);
		userContainerPage.getInsertTitle().sendKeys("mobile");
		BrowserDriver.selectDropDownItem(userContainerPage.getClickOnGender(), "Male");
		userContainerPage.getClickOnGender().sendKeys("Female");
		return this;
	}

	public UserService GeneratePassword() throws InterruptedException {
		userContainerPage.getGeneratePassword().sendKeys("pammi");
		userContainerPage.getConfirmPassword().sendKeys("pammi");
		userContainerPage.getSavetheAccount().click();
		Thread.sleep(12000);

		log.info("userpage created succesfully");
		return this;
	}

	public UserService logoutAccount() {
		userContainerPage.getLogoutDropdown().click();
		userContainerPage.getClicklogout().click();
		return this;
	}

	public static void init() {
		userContainerPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), UserContainerPage.class);
	}

}
