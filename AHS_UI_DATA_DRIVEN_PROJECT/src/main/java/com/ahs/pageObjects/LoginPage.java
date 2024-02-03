package com.ahs.pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ahs.base.baseClass;

public class LoginPage extends baseClass {
	
	/*
	 * Declaration
	 */
	
	@FindBy(id = "Username")
	WebElement txtUserName;
	
	@FindBy(id = "password")
	WebElement txtPassword;
	
	@FindBy(xpath = "//*[text()= 'Login']")
	WebElement btnlogin;
	
	
	
	/*
	 * Initialisation  
	 */
	
	//This is constructor.initElements is a method,when this construct is call all the above object get initialised
	public LoginPage()
	{

		PageFactory.initElements(getDriver(), this); //this means it will inisialise all the above object
		
	}
	
	/*
	 * Action methods
	 */
	
	public void setUserName(String username)
	{
		txtUserName.clear();
		txtUserName.sendKeys(username);
	}
		
	public void setPassword(String Pwd)
	{
		txtPassword.clear();
		txtPassword.sendKeys(Pwd);
	}
		
	public void clickLogin()
	{
		btnlogin.click();
	}
	
}
