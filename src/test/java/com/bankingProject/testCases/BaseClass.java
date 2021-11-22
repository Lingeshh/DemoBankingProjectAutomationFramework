package com.bankingProject.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BaseClass {
	

	public String baseURL="http://demo.guru99.com/V4/";
	public String username="mngr367444";
	public String password="YqYhEdU";
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{			

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		
		logger = Logger.getLogger("BankingProjectHAF");
		PropertyConfigurator.configure("Log4j.properties");
				
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
