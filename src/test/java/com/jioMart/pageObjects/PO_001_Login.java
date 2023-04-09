package com.jioMart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_001_Login extends base {

	public PO_001_Login() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h2[contains(text(),'Sign')]")
	WebElement SignInOrUp;
	
	@FindBy(id = "loginfirst_mobileno")
	WebElement loginPhoneNo;

	@FindBy(xpath = "//button[contains(@class,'arrowbtn')]")
	WebElement submitArrowBtn;

	@FindBy(xpath = "//div[contains(@class,'md-form')]//div[1]")
	WebElement LoginPhoneNoErr;

	@FindBy(xpath = "//div[contains(@class,'md-form')][1]//input")
	WebElement EnteredLoginPhoneNo;

	@FindBy(xpath = "//a[@class='change-link chgmob']")
	WebElement changeLoginNo;

	@FindBy(xpath = "//div[contains(text(),'Waiting for OTP')]")
	WebElement waitOTPText;

	@FindBy(xpath = "//span[contains(@class,'otpcount')]")
	WebElement OTPTimeCount;

	@FindBy(id = "login_resend_otp")
	WebElement resendLoginOTP;

	@FindBy(xpath = "//input[@formcontrolname='loginotp0']")
	WebElement enterLoginOTP;

	@FindBy(xpath = "//button[@class='btn-login']")
	WebElement verifyLoginBtn;

	@FindBy(xpath = "//form//div[1]//div[2]//div[3]")
	WebElement OTPLoginErr;

	public String getSignInOrUp() {
		String SignInUp = SignInOrUp.getText();
		return SignInUp;
	}
	
	public void setLoginPhoneNo(String loginNo) {
		loginPhoneNo.clear();
		loginPhoneNo.sendKeys(loginNo);
	}

	public void clickSubmitArrowBtn() {
		submitArrowBtn.click();
	}

	public String getLoginPhoneNoErr() {
		String phoneNoErr = LoginPhoneNoErr.getText();
		return phoneNoErr;
	}

	public String getEnteredLoginPhoneNo() {
		String enteredPhoneNo = EnteredLoginPhoneNo.getText();
		return enteredPhoneNo;
	}

	public void clickChangeLoginNo() {
		changeLoginNo.click();
	}
	
	public WebElement resendLoginOTP() {
		return resendLoginOTP;
	}

	public String getWaitOTPText() {
		String waitOTP = waitOTPText.getText();
		return waitOTP;
	}

	public String getOTPTimeCount() {
		String OTPTime = OTPTimeCount.getText();
		return OTPTime;
	}

	public void clickResendLoginOTP() {
		resendLoginOTP.click();
	}

	public void setLoginOTP() {
		enterLoginOTP.clear();
		enterLoginOTP.click();
	}

	public void clickVerifyLoginBtn() {
		verifyLoginBtn.click();
	}
	
	public String VerifyLoginBtn() {
		String verifyBtn = verifyLoginBtn.getText();
		return verifyBtn;
	}

	public String getOTPLoginErr() {
		String OTPError = OTPLoginErr.getText();
		return OTPError;
	}

}
