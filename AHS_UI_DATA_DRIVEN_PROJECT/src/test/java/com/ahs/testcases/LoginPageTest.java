package com.ahs.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.ahs.base.baseClass;
import com.ahs.dataProvider.DataProviders;
import com.ahs.pageObjects.LoginPage;
import com.ahs.utility.Log;



public class LoginPageTest extends baseClass{
	
	LoginPage login;
	
	@BeforeMethod
	public void setup(String browser)
	{
		launchApp(browser); 
	}
	
	@AfterMethod
	public void tearDown()
	{
		getDriver().quit();
	}
	
	@Test(dataProvider = "credentials", dataProviderClass = DataProviders.class , groups= {"Smoke","Sanity"})
	public void loginTest(String uname , String password)
	{
		 Log.startTestCase("loginTest");
		 login = new LoginPage();
		 Log.info("Enter UserName");
		 login.setUserName(uname);
		 Log.info("Enter Password");
		 login.setPassword(password);
		 login.clickLogin();
		 Log.info("User LoggedIn");
		 Log.endTestCase("loginTest");
		 
	}

}
