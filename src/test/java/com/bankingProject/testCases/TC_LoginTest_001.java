package com.bankingProject.testCases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;

import com.bankingProject.pageObjects.LoginPagePO;


public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException 
	{
		
		logger.info("URL is oppened");
		
		LoginPagePO lp = new LoginPagePO(driver);
		
		lp.setUserName(username);
		logger.info("inserted username");
		
		
		lp.setPassword(password);
		logger.info("inserted password");
		
		
		lp.clickSubmit();
		logger.info("clicked login button ");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Logging passed");
		}else {
			
			captureScreen(driver,"loginTest");
			logger.info("Login failed");
			Assert.assertTrue(false);
			
		}
			
		


	}
}
