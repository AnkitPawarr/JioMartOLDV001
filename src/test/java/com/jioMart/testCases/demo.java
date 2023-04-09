package com.jioMart.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.jioMart.pageObjects.base;

public class demo extends base {

	@Test
	public void demo2() throws InterruptedException {
		driver.get("https://www.jiomart.com/customer/account/login");

		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Sign')]")).getText());
		driver.findElement(By.id("loginfirst_mobileno")).sendKeys("9820654890");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'arrowbtn')]")).click();
		Thread.sleep(3000);

		System.out.println(driver.findElement(By.xpath("//button[@class='btn-login']")).getText());
		
		/*System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Sign')]")).getText());
		String title= driver.findElement(By.xpath("//h2[contains(text(),'Sign')]")).getText();
		driver.findElement(By.id("reg_firstname")).sendKeys("Ankit");
		
		driver.findElement(By.id("reg_lastname")).sendKeys("Pawar1");
		
		
		if(title.contains("Sign up")) {
			log.info("inside loop");
			driver.findElement(By.xpath("//a[@class='change-link chgmob']")).click();
		}
		Thread.sleep(3000);*/
		
	
		//driver.findElement(By.id("reg_email")).sendKeys("a@abc");
		//driver.findElement(By.xpath("//button[@class='btn-login']")).click();
		
		/*WebElement firstname= driver.findElement(By.xpath("//form//div[1]//div[@class='md-form position-relative'][1]//div[1]"));
		String firstnameErr = firstname.getText();
		System.out.println(firstnameErr);*/
		
		
		/*if(driver.findElement(By.xpath("//form//div[1]//div[@class='md-form position-relative'][1]//div[1]")).isDisplayed()) {
			WebElement firstname= driver.findElement(By.xpath("//form//div[1]//div[@class='md-form position-relative'][1]//div[1]"));
			String firstnameErr = firstname.getText();
			System.out.println(firstnameErr);
			}
		
		if(driver.findElement(By.xpath("//form//div[1]//div[@class='md-form position-relative'][2]//div[1]")).isDisplayed()) {
			WebElement lastname=  driver.findElement(By.xpath("//form//div[1]//div[@class='md-form position-relative'][2]//div[1]"));
			String lastnameErr = lastname.getText();
			System.out.println(lastnameErr);
			}*/
		

	}

}
