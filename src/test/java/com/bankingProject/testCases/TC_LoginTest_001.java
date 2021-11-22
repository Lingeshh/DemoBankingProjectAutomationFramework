package com.bankingProject.testCases;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.bankingProject.pageObjects.LoginPagePO;


public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
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
			//System.out.println("Passed");
			logger.info("Logging Test Passed");
		
		}
		else
		{
			
			Assert.assertTrue(false);
			logger.info("Logging Test failed");
			
		}
		
	}

}
