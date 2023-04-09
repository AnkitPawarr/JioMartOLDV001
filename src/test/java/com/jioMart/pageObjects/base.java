package com.jioMart.pageObjects;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.jioMart.Utilities.readConfig;
import com.jioMart.Utilities.xlUtil;

public class base {

	readConfig rConfig = new readConfig();

	public String browser = rConfig.getBrowser();
	public String chromePath = rConfig.getChromePath();
	public String fireFoxPath = rConfig.getFfPath();
	public String baseURL = rConfig.getBaseUrl();
	public String signInURL = rConfig.getSignInUrl();
	public String successfulLogin = rConfig.getSuccessfulLoginUrl();
	public String customerAccountURL = rConfig.getCustomerAccountUrl();
	public String LoginNumber = rConfig.getLoginNo();
	public String RegNumber = rConfig.getRegNo();
	public String invalidNumber = rConfig.getInvalidNo();
	public String username = rConfig.getUsername();

	public static WebDriver driver;
	public static Logger log;
	public static WebDriverWait wait;

	@BeforeClass
	public void setUp() {

		log = Logger.getLogger("eCommerce");
		PropertyConfigurator.configure("Log4j.properties");

		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", chromePath);
			driver = new ChromeDriver();

		} else if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", fireFoxPath);
			driver = new FirefoxDriver();

		} else if (browser.equals("Safari")) {
			driver = new SafariDriver();

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 50);

	}

	@BeforeMethod
	public void nameBefore(Method method) {
		System.out.println("***************************************************** Test Method Name : "
				+ method.getName() + " *******************************************************");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@DataProvider(name="signIn")
	public String[][] getLoginData() throws IOException {
		String path=".//TestData//LoginDDT.xlsx";
		
		xlUtil xlUtil = new xlUtil(path);
		int totalRow = xlUtil.getRowCount("Sheet1");
		int totalCol = xlUtil.getColCount("Sheet1", 1);

		String loginData[][] = new String[totalRow][totalCol];

		for (int r = 1; r <= totalRow; r++) 
		{
			for (int c = 1; c <= totalCol; c++) 
			{
				loginData[r - 1][c-1] = xlUtil.readData("Sheet1", r, c);
			}
		}
		return loginData;
	}

}
