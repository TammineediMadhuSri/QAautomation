package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeContainerPage {
	/*@FindBy(xpath = "//span[@class='fas fa-ellipsis-h more-icon']")
	public WebElement ClickOnDropdownElement;

	public WebElement getClickOnDropdownElement() {
		return ClickOnDropdownElement;
	}

	public void setClickOnDropdownElement(WebElement clickOnDropdownElement) {
		ClickOnDropdownElement = clickOnDropdownElement;
	}*/
	
	@FindBy(xpath = "//span[text()='Accounts']")
	public WebElement homePageAccountsTab;

	public WebElement getHomePageAccountsTab() {
		return homePageAccountsTab;
	}

	public void setHomePageAccountsTab(WebElement homePageAccountsTab) {
		this.homePageAccountsTab = homePageAccountsTab;
	}
	
	
	

}