package com.jioMart.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_004_SignUp extends base {

	public PO_004_SignUp() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "loginfirst_mobileno")
	WebElement regPhoneNo;

	@FindBy(xpath = "//button[contains(@class,'arrowbtn')]")
	WebElement submitArrowBtn;

	@FindBy(xpath = "//div[contains(@class,'md-form')]//div[1]")
	WebElement LoginPhoneNoErr;

	@FindBy(id = "reg_firstname")
	WebElement firstName;

	@FindBy(xpath = "//form//div[1]//div[@class='md-form position-relative'][1]//div[1]")
	WebElement firstNameErr;

	@FindBy(id = "reg_lastname")
	WebElement lasttName;

	@FindBy(xpath = "//form//div[1]//div[@class='md-form position-relative'][2]//div[1]")
	WebElement lastNameErr;

	@FindBy(id = "reg_email")
	WebElement mailId;
	
	@FindBy(xpath = "//form//div[1]//div[@class='md-form position-relative'][3]//div[1]")
	WebElement mailIdErr;

	@FindBy(id = "register_pwd")
	WebElement password;

	@FindBy(xpath = "//div[@class='password-msg']")
	WebElement passwordPolicyText;
	
	@FindBy(xpath = "//form//div[2]//div[@class='password-msg']//div")
	WebElement passwordErr;

	@FindBy(id = "register_confirm_pwd")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//form//div[3]//div[@class='md-form position-relative']//div[1]")
	WebElement confirmPassErr;

	@FindBy(xpath = "//input[@class='whatcheckbox']")
	WebElement wpCheckBox;

	@FindBy(xpath = "//p[@class='otptxt mt-0']//span")
	WebElement verifyRegPhoneNo;

	@FindBy(xpath = "//a[@class='change-link chgmob']")
	WebElement changeRgNo;

	@FindBy(xpath = "//div[contains(text(),'Waiting for OTP')]")
	WebElement waitOTPText;

	@FindBy(xpath = "//span[contains(@class,'otpcount')]")
	WebElement OTPTimeCount;

	@FindBy(xpath = "//input[@formcontrolname='regotp0']")
	WebElement enterRegOTP;

	@FindBy(id = "login_resend_otp")
	WebElement resendRegOTP;
	
	@FindBy(xpath = "//form//div[5]//div[1]//div[3]")
	WebElement OTPRegErr;

	@FindBy(xpath = "//button[@class='btn-login']")
	WebElement verifyRegBtn;
	
	public void clickChangeRegNo() {
		changeRgNo.click();
	}
}
