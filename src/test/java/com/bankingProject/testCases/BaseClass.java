package com.bankingProject.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	

	public String baseURL="http://demo.guru99.com/V4/";
	public String username="mngr367444";
	public String password="YqYhEdU";
	public static WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{			
		

			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			driver=new ChromeDriver();
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
