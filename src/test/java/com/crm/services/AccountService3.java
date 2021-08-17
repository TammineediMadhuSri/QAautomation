package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pages.AccountContainerPage;
import com.crm.util.CommonUtil;

public class AccountService3 {
	public static AccountContainerPage accountContainerPage;
	private static Logger log = Logger.getLogger(AccountService3.class);
	
	public void clickOnCreateAccount() {
		accountContainerPage.getCreateAccount().click();
	}
	
	public String insertAccountNameAndEmail() {
		accountContainerPage.getTxtAccountName().sendKeys("Baru");
		accountContainerPage.getTxtAccountEmail().sendKeys("baru@gmail.com");
		return null;
	}
	
	public String insertAccountWebSite() {
		accountContainerPage.getTxtAccountWebSite().sendKeys("www.sri");
		return null;
	}
	
	public void insertPhoneNumber() {
		String num = Integer.toString(CommonUtil.generateRandomNumber());
		BrowserDriver.selectDropDownItem(accountContainerPage.getPhoneDropDown(), "Mobile");
		accountContainerPage.getTxtAccountPhoneNumber().sendKeys(num);
	}
	
	public String insertAccountBillingAddress() {
		//String num = Integer.toString(CommonUtil.generateRandomNumber());
		accountContainerPage.getTxtAccountBillingAddressStreet().sendKeys("PM Palam");
		accountContainerPage.getTxtAccountBillingAddressCity().sendKeys("vizag");
		accountContainerPage.getTxtAccountBillingAddressState().sendKeys("AP");
		accountContainerPage.getTxtAccountBillingAddressPostalCode().sendKeys("520016");
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
	
	public String getCreatedAccountWebSite() {
		String awebsite = accountContainerPage.getTxtAccountWebSite().getText();
		return awebsite;
		
	}

}
