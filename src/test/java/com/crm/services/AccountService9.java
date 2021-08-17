package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pages.AccountContainerPage;
import com.crm.util.CommonUtil;

public class AccountService9 {
	public static AccountContainerPage accountContainerPage;
	private static Logger log = Logger.getLogger(AccountService9.class);
	
	public void clickOnCreateAccount() {
		accountContainerPage.getCreateAccount().click();
	}
	
	public String insertAccountNameAndEmail() {
		accountContainerPage.getTxtAccountName().sendKeys("Tom");
		accountContainerPage.getTxtAccountEmail().sendKeys("madhu@gmail.com");
		return null;
	}
	
	public String insertAccountWebSite() {
		accountContainerPage.getTxtAccountWebSite().sendKeys("www.madhu.com");
		return null;
	}
	
	public void insertPhoneNumber() {
		String num = Integer.toString(CommonUtil.generateRandomNumber());
		BrowserDriver.selectDropDownItem(accountContainerPage.getPhoneDropDown(), "Mobile");
		accountContainerPage.getTxtAccountPhoneNumber().sendKeys(num);
	}
	
	public String insertAccountBillingAddress() {
		//String num = Integer.toString(CommonUtil.generateRandomNumber());
		accountContainerPage.getTxtAccountBillingAddressStreet().sendKeys("MVP Colony");
		accountContainerPage.getTxtAccountBillingAddressCity().sendKeys("vizag");
		accountContainerPage.getTxtAccountBillingAddressState().sendKeys("AP");
		accountContainerPage.getTxtAccountBillingAddressPostalCode().sendKeys("123456789");
		accountContainerPage.getTxtAccountBillingAddressCountry().sendKeys("India");
		log.info("Billing Address validates Successfully");
		return null;
	}
	
	public void CopyBillingAddress() {
		accountContainerPage.getTxtCopyBillingAddress().click();
	}
	
	public String getBillingAdressFromWebPage() {
		String str = accountContainerPage.getBillingAddress.getText();
		System.out.println(str);
		return str;
	}

	public void SaveTheDetails() throws InterruptedException {
		accountContainerPage.getTxtSaveTheDetails().click();
		log.info("Account created sucessfully");
		Thread.sleep(8000);
	}
	
	public String getCreatedAccountName() {
		String aname = accountContainerPage.getAccountNameAccountPage().getText();
		return aname;
	}
		
	public static void init() {
		accountContainerPage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AccountContainerPage.class);
	}

	public void EditTheDetails() {
		accountContainerPage.getTxtEditTheDetails().click();
		return;
	}

	public void EditAccountName() throws InterruptedException {
		accountContainerPage.getEditAccountName().sendKeys("Jerry");
		Thread.sleep(6000);
		return;
	}

}
