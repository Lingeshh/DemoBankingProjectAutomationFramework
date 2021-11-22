package com.bankingProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePO {
	
	WebDriver ldriver;
	
	public LoginPagePO(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="uid")
	@CacheLookup
	WebElement userName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement loginBtn;
	
	public void setUserName(String uname)
	{
		userName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		loginBtn.click();
	}	
	
	
}





