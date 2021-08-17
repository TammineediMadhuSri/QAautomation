package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pages.AccountContainerPage;
import com.crm.util.CommonUtil;

public class AccountService8 {
	public static AccountContainerPage accountContainerPage;
	private static Logger log = Logger.getLogger(AccountService8.class);
	
	public void clickOnCreateAccount() {
		accountContainerPage.getCreateAccount().click();
	}
	
	public String insertAccountNameAndEmail() {
		accountContainerPage.getTxtAccountName().sendKeys("Sai");
		accountContainerPage.getTxtAccountEmail().sendKeys("sai@gmail.com");
		return null;
	}
	
	public String insertAccountWebSite() {
		accountContainerPage.getTxtAccountWebSite().sendKeys("www.sai.com");
		return null;
	}
	
	public void insertPhoneNumber() {
		String num = Integer.toString(CommonUtil.generateRandomNumber());
		BrowserDriver.selectDropDownItem(accountContainerPage.getPhoneDropDown(), "Mobile");
		accountContainerPage.getTxtAccountPhoneNumber().sendKeys(num);
	}
	
	public String insertAccountBillingAddress() {
		//String num = Integer.toString(CommonUtil.generateRandomNumber());
		accountContainerPage.getTxtAccountBillingAddressStreet().sendKeys("Gajuwaka");
		accountContainerPage.getTxtAccountBillingAddressCity().sendKeys("vizag");
		accountContainerPage.getTxtAccountBillingAddressState().sendKeys("Hyd");
		accountContainerPage.getTxtAccountBillingAddressPostalCode().sendKeys("");
		accountContainerPage.getTxtAccountBillingAddressCountry().sendKeys("India");
		log.info("Billing Address validates Successfully");
		return null;
	}
	
	public void CopyBillingAddress() {
		accountContainerPage.getTxtCopyBillingAddress().click();
	}

	public void SaveTheDetails() {
		accountContainerPage.getTxtSaveTheDetails().click();
		log.info("Account created sucessfully");
	}

	public static void init() {
		accountContainerPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AccountContainerPage.class);
	}
	
	public String getCreatedAccountBillingPostalCode() {
		String abpcode = accountContainerPage.getTxtAccountBillingAddressPostalCode().getText();
		return abpcode;
	}

}
