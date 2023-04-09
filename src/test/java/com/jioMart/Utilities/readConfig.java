package com.jioMart.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readConfig {

	public FileInputStream fis;
	public Properties prop;

	public readConfig() {
		try {
			fis = new FileInputStream(".//Configuration//config.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
	}

	public String getBrowser() {
		String browsername = prop.getProperty("browser");
		return browsername;
	}

	public String getChromePath() {
		String chromepath = prop.getProperty("chromePath");
		return chromepath;
	}

	public String getFfPath() {
		String ffpath = prop.getProperty("fireFoxPath");
		return ffpath;
	}

	public String getBaseUrl() {
		String baseUrl = prop.getProperty("baseURL");
		return baseUrl;
	}

	public String getSignInUrl() {
		String signInUrl = prop.getProperty("signInURL");
		return signInUrl;
	}

	public String getSuccessfulLoginUrl() {
		String successfullLogin = prop.getProperty("successfullLoginURL");
		return successfullLogin;
	}
	
	public String getCustomerAccountUrl() {
		String customerAccount= prop.getProperty("customerAccountURL");
		return customerAccount;
	}

	public String getLoginNo() {
		String loginNumber = prop.getProperty("LoginNumber");
		return loginNumber;
	}
	
	public String getRegNo() {
		String RegNumber = prop.getProperty("RegisterNumber");
		return RegNumber;
	}

	public String getInvalidNo() {
		String invalidNumber = prop.getProperty("invalidNumber");
		return invalidNumber;
	}

	public String getUsername() {
		String username = prop.getProperty("username");
		return username;
	}
}
