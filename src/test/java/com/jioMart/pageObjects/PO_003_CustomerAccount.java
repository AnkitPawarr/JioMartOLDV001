package com.jioMart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_003_CustomerAccount extends base {

	public PO_003_CustomerAccount() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[2]/ul[@class='info']//li[4]//div[2]")
	WebElement getLoggedInPhoneNo;

	@FindBy(xpath = "//a[contains(@class,'logout')]")
	WebElement logoutBtn;

	public String getLoggedInPhoneNo() {
		String loggedInPhoneNo = getLoggedInPhoneNo.getText();
		return loggedInPhoneNo;
	}

	public void clickLogout() {
		logoutBtn.click();
	}
}
