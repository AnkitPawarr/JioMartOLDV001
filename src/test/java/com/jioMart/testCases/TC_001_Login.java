package com.jioMart.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.jioMart.pageObjects.PO_001_Login;
import com.jioMart.pageObjects.PO_002_Home;
import com.jioMart.pageObjects.PO_003_CustomerAccount;
import com.jioMart.pageObjects.PO_004_SignUp;
import com.jioMart.pageObjects.base;

public class TC_001_Login extends base {

	PO_001_Login loginPage;
	PO_002_Home successPage;
	PO_003_CustomerAccount custAccountPage;
	PO_004_SignUp signUpPage;

	@Test(dataProvider = "signIn")
	public void LoginDDT(String LoginNum, String a) throws InterruptedException {
		loginPage = new PO_001_Login();
		successPage = new PO_002_Home();
		custAccountPage = new PO_003_CustomerAccount();
		signUpPage = new PO_004_SignUp();

		driver.get(signInURL);
		log.info("SignIn URL Loaded");

		loginPage.setLoginPhoneNo(LoginNum);
		log.info("Entered Login Number");
		Thread.sleep(1000);
		loginPage.clickSubmitArrowBtn();
		log.info("Next Page Arrow Button is Clicked");
		Thread.sleep(2000);

		log.info("Page Header: " + loginPage.getSignInOrUp());
		
		if(loginPage.getSignInOrUp().contains("Sign in")) {
			Thread.sleep(2000);
			if (driver.getPageSource().contains(loginPage.getLoginPhoneNoErr())) {
				log.error(loginPage.getLoginPhoneNoErr());
			}
			else if(driver.getPageSource().contains(loginPage.VerifyLoginBtn())) {
				Thread.sleep(6000);
				log.info("OTP Text: " + loginPage.getWaitOTPText());
				log.info("Click and Enter an Login OTP");
				
				loginPage.clickVerifyLoginBtn();
				log.info("Verify button is Clicked");
					if (driver.getPageSource().contains(loginPage.getOTPLoginErr())) {
						log.error(loginPage.getOTPLoginErr());
					}
			}
			else {
				log.error("No such Account Found.");
			}
			/*else if(driver.getPageSource().contains(loginPage.getWaitOTPText())) {
				Thread.sleep(6000);
				log.info("OTP Text: " + loginPage.getWaitOTPText());
				log.info("Click and Enter an Login OTP");
				
				loginPage.clickVerifyLoginBtn();
				log.info("Verify button is Clicked");
					if (driver.getPageSource().contains(loginPage.getOTPLoginErr())) {
						log.error(loginPage.getOTPLoginErr());
					}
				}*/
			}

		if(loginPage.getSignInOrUp().contains("Sign up")) {
			log.error("Redirecting to Sign In page.");
			signUpPage.clickChangeRegNo();
		}

		/*
		 * log.info("Waiting till Resend Button is Displayed after 45sec");
		 * wait.until(ExpectedConditions.visibilityOf(loginPage.resendLoginOTP()));
		 * loginPage.clickResendLoginOTP(); log.info("Resend button is Clicked");
		 * log.info("Print OTP Text After Resend button is Clicked");
		 * System.out.println(loginPage.getWaitOTPText()); Thread.sleep(6000);
		 */
		
	}

}
