package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserContainerPage {

	@FindBy(xpath = "//span[text()='Users']")
	public WebElement ClickOnUsersDropDown;

	@FindBy(xpath = "//a[@data-name='create']")
	public WebElement ClickOnCreateUser;

	@FindBy(xpath = "//input[@data-name='userName']")
	public WebElement insertUserName;

	@FindBy(xpath = "//select[@data-name='salutationName']")
	public WebElement selectNameTitle;

	@FindBy(xpath = "//input[@data-name='firstName']")
	public WebElement insertFirstName;

	@FindBy(xpath = "//input[@data-name='lastName']")
	public WebElement insertLastName;

	@FindBy(xpath = "//input[@data-name='title']")
	public WebElement insertTitle;

	@FindBy(xpath = "//input[@type='email']")
	public WebElement insertEmail;

	@FindBy(xpath = "//select[@data-property-type='type']")
	public WebElement getPhoneDropdown;

	@FindBy(xpath = "//input[@class='form-control phone-number no-margin-shifting']")
	public WebElement txtPhoneNumber;

	@FindBy(xpath = "//select[@data-name='gender']")
	public WebElement ClickOnGender;

	@FindBy(xpath = "//input[@data-name='password']")
	public WebElement GeneratePassword;

	@FindBy(xpath = "//input[@data-name='passwordConfirm']")
	public WebElement ConfirmPassword;

	@FindBy(xpath = "//button[@data-action='save']")
	public WebElement SavetheAccount;

	@FindBy(xpath = "//span[@class='fas fa-ellipsis-v']")
	public WebElement logoutDropdown;

	@FindBy(xpath = "//a[@data-action='logout']")
	public WebElement Clicklogout;

	public WebElement getClickOnUsersDropDown() {
		return ClickOnUsersDropDown;
	}

	public void setClickOnUsersDropDown(WebElement clickOnUsersDropDown) {
		ClickOnUsersDropDown = clickOnUsersDropDown;
	}

	public WebElement getClickOnCreateUser() {
		return ClickOnCreateUser;
	}

	public void setClickOnCreateUser(WebElement clickOnCreateUser) {
		ClickOnCreateUser = clickOnCreateUser;
	}

	public WebElement getInsertUserName() {
		return insertUserName;
	}

	public void setInsertUserName(WebElement insertUserName) {
		this.insertUserName = insertUserName;
	}

	public WebElement getSelectNameTitle() {
		return selectNameTitle;
	}

	public void setSelectNameTitle(WebElement selectNameTitle) {
		this.selectNameTitle = selectNameTitle;
	}

	public WebElement getInsertFirstName() {
		return insertFirstName;
	}

	public void setInsertFirstName(WebElement insertFirstName) {
		this.insertFirstName = insertFirstName;
	}

	public WebElement getInsertLastName() {
		return insertLastName;
	}

	public void setInsertLastName(WebElement insertLastName) {
		this.insertLastName = insertLastName;
	}

	public WebElement getInsertTitle() {
		return insertTitle;
	}

	public void setInsertTitle(WebElement insertTitle) {
		this.insertTitle = insertTitle;
	}

	public WebElement getInsertEmail() {
		return insertEmail;
	}

	public void setInsertEmail(WebElement insertEmail) {
		this.insertEmail = insertEmail;
	}

	public WebElement getClickOnGender() {
		return ClickOnGender;
	}

	public void setClickOnGender(WebElement clickOnGender) {
		ClickOnGender = clickOnGender;
	}

	public WebElement getGeneratePassword() {
		return GeneratePassword;
	}

	public void setGeneratePassword(WebElement generatePassword) {
		GeneratePassword = generatePassword;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public WebElement getGetPhoneDropdown() {
		return getPhoneDropdown;
	}

	public void setGetPhoneDropdown(WebElement getPhoneDropdown) {
		this.getPhoneDropdown = getPhoneDropdown;
	}

	public WebElement getTxtPhoneNumber() {
		return txtPhoneNumber;
	}

	public void setTxtPhoneNumber(WebElement txtPhoneNumber) {
		this.txtPhoneNumber = txtPhoneNumber;
	}

	public void setConfirmPassword(WebElement confirmPassword) {
		ConfirmPassword = confirmPassword;
	}

	public WebElement getSavetheAccount() {
		return SavetheAccount;
	}

	public void setSavetheAccount(WebElement savetheAccount) {
		SavetheAccount = savetheAccount;
	}

	public WebElement getLogoutDropdown() {
		return logoutDropdown;
	}

	public void setLogoutDropdown(WebElement logoutDropdown) {
		this.logoutDropdown = logoutDropdown;
	}

	public WebElement getClicklogout() {
		return Clicklogout;
	}

	public void setClicklogout(WebElement clicklogout) {
		Clicklogout = clicklogout;
	}

}
