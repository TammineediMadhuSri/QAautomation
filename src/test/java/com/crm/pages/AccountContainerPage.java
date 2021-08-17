package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountContainerPage {
	
	@FindBy(xpath = "//a[@data-name='create']")
	public WebElement createAccount;
	
	@FindBy(xpath = "//input[@data-name='name']")
	public WebElement txtAccountName;
	
	@FindBy(xpath = "//input[@data-name='website']")
	public WebElement txtAccountWebSite;
	
	@FindBy(xpath = "//input[@type='email']")
	public WebElement txtAccountEmail;
	
	@FindBy(xpath = "//input[@type='input']")
	public WebElement txtAccountPhoneNumber;
	
	@FindBy(xpath = "//textarea[@data-name=\"billingAddressStreet\"]")
	public WebElement txtAccountBillingAddressStreet;
	
	@FindBy(xpath = "//input[@data-name=\"billingAddressCity\"]")
	public WebElement txtAccountBillingAddressCity;
	
	@FindBy(xpath = "//input[@data-name=\"billingAddressState\"]")
	public WebElement txtAccountBillingAddressState;
	
	@FindBy(xpath = "//input[@data-name=\"billingAddressPostalCode\"]")
	public WebElement txtAccountBillingAddressPostalCode;
	
	@FindBy(xpath = "//input[@data-name=\"billingAddressCountry\"]")
	public WebElement txtAccountBillingAddressCountry;
	
	@FindBy(xpath = "//button[normalize-space()='Copy Billing']")
	public WebElement txtCopyBillingAddress;
	
	@FindBy(xpath = "//button[@data-action='save']")
	public WebElement txtSaveTheDetails;
	
	@FindBy(xpath = "//td[@data-name='name']")
	public WebElement accountNameAccountPage;
	
	@FindBy(xpath = "//select[@data-property-type='type']")
	public WebElement phoneDropDown;
	
	@FindBy(xpath = "//button[@data-action='edit']")
	public WebElement txtEditTheDetails;

	@FindBy(xpath = "//input[@data-name='name']")
	public WebElement editAccountName;
	
	@FindBy(xpath = "//span[@title='Accounts']")
	public WebElement txtDeleteTheDetails;
	
	@FindBy(xpath ="//input[@class='record-checkbox']")
	public WebElement DeleteAccount;
	
	@FindBy(xpath ="//*[@id=\"main\"]/div[3]/div[1]/div[1]/button")
	public WebElement SelectAction;
	
	@FindBy(xpath ="//a[@data-action='remove']")
	public WebElement ButtonRemove;
	
	@FindBy(xpath ="//button[@data-name='confirm']")
	public WebElement ButtonConfirm;
	
	@FindBy(xpath = "//div[@class='field' and @data-name='billingAddress']")
	public WebElement getBillingAddress;;
	
	public WebElement getGetBillingAddress() {
		return getBillingAddress;
	}

	public void setGetBillingAddress(WebElement getBillingAddress) {
		this.getBillingAddress = getBillingAddress;
	}

	public WebElement getTxtEditTheDetails() {
		return txtEditTheDetails;
	}

	public void setTxtEditTheDetails(WebElement txtEditTheDetails) {
		this.txtEditTheDetails = txtEditTheDetails;
	}

	public WebElement getEditAccountName() {
		return editAccountName;
	}

	public void setEditAccountName(WebElement editAccountName) {
		this.editAccountName = editAccountName;
	}

	public WebElement getPhoneDropDown() {
		return phoneDropDown;
	}

	public void setPhoneDropDown(WebElement phoneDropDown) {
		this.phoneDropDown = phoneDropDown;
	}

	public WebElement getAccountNameAccountPage() {
		return accountNameAccountPage;
	}

	public void setAccountNameAccountPage(WebElement accountNameAccountPage) {
		this.accountNameAccountPage = accountNameAccountPage;
	}
	
	public WebElement getTxtCopyBillingAddress() {
		return txtCopyBillingAddress;
	}

	public void setTxtCopyBillingAddress(WebElement txtCopyBillingAddress) {
		this.txtCopyBillingAddress = txtCopyBillingAddress;
	}

	public WebElement getTxtSaveTheDetails() {
		return txtSaveTheDetails;
	}

	public void setTxtSaveTheDetails(WebElement txtSaveTheDetails) {
		this.txtSaveTheDetails = txtSaveTheDetails;
	}

	public WebElement getCreateAccount() {
		return createAccount;
	}

	public void setCreateAccount(WebElement createAccount) {
		this.createAccount = createAccount;
	}
	
	public WebElement getTxtAccountName() {
		return txtAccountName;
	}

	public void setTxtAccountName(WebElement txtAccountName) {
		this.txtAccountName = txtAccountName;
	}

	
	public WebElement getTxtAccountWebSite() {
		return txtAccountWebSite;
	}

	public void setTxtAccountWebSite(WebElement txtAccountWebSite) {
		this.txtAccountWebSite = txtAccountWebSite;
	}
	
	public WebElement getTxtAccountEmail() {
		return txtAccountEmail;
	}

	public void setTxtAccountEmail(WebElement txtAccountEmail) {
		this.txtAccountEmail = txtAccountEmail;
	}

	public WebElement getTxtAccountPhoneNumber() {
		return txtAccountPhoneNumber;
	}

	public void setTxtAccountPhoneNumber(WebElement txtAccountPhoneNumber) {
		this.txtAccountPhoneNumber = txtAccountPhoneNumber;
	}

	public WebElement getTxtAccountBillingAddressStreet() {
		return txtAccountBillingAddressStreet;
	}

	public void setTxtAccountBillingAddressStreet(WebElement txtAccountBillingAddressStreet) {
		this.txtAccountBillingAddressStreet = txtAccountBillingAddressStreet;
	}

	public WebElement getTxtAccountBillingAddressCity() {
		return txtAccountBillingAddressCity;
	}

	public void setTxtAccountBillingAddressCity(WebElement txtAccountBillingAddressCity) {
		this.txtAccountBillingAddressCity = txtAccountBillingAddressCity;
	}

	public WebElement getTxtAccountBillingAddressState() {
		return txtAccountBillingAddressState;
	}

	public void setTxtAccountBillingAddressState(WebElement txtAccountBillingAddressState) {
		this.txtAccountBillingAddressState = txtAccountBillingAddressState;
	}

	public WebElement getTxtAccountBillingAddressPostalCode() {
		return txtAccountBillingAddressPostalCode;
	}

	public void setTxtAccountBillingAddressPostalCode(WebElement txtAccountBillingAddressPostalCode) {
		this.txtAccountBillingAddressPostalCode = txtAccountBillingAddressPostalCode;
	}

	public WebElement getTxtAccountBillingAddressCountry() {
		return txtAccountBillingAddressCountry;
	}

	public void setTxtAccountBillingAddressCountry(WebElement txtAccountBillingAddressCountry) {
		this.txtAccountBillingAddressCountry = txtAccountBillingAddressCountry;
	}

	public WebElement getTxtDeleteTheDetails() {
		return txtDeleteTheDetails;
	}

	public void setTxtDeleteTheDetails(WebElement txtDeleteTheDetails) {
		this.txtDeleteTheDetails = txtDeleteTheDetails;
	}

	public WebElement getDeleteAccount() {
		return DeleteAccount;
	}

	public void setDeleteAccount(WebElement deleteAccount) {
		DeleteAccount = deleteAccount;
	}

	public WebElement getSelectAction() {
		return SelectAction;
	}

	public void setSelectAction(WebElement selectAction) {
		SelectAction = selectAction;
	}

	public WebElement getButtonRemove() {
		return ButtonRemove;
	}

	public void setButtonRemove(WebElement buttonRemove) {
		ButtonRemove = buttonRemove;
	}

	public WebElement getButtonConfirm() {
		return ButtonConfirm;
	}

	public void setButtonConfirm(WebElement buttonConfirm) {
		ButtonConfirm = buttonConfirm;
	}


	

	
	
	

}
