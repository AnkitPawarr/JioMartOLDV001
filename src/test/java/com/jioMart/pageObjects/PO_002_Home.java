package com.jioMart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_002_Home extends base {

	public PO_002_Home() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "logged_user")
	WebElement LoggedUsername;

	public String getLoggedInUsername() {
		String loggedInUser = LoggedUsername.getText();
		return loggedInUser;
	}

	public void clickUsername() {
		LoggedUsername.click();
	}

}
