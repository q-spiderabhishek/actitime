package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.Login;

public class BaseClass {
	static
	{
System.setProperty("webdriver.chrome.driver","./DRIVER/chromedriver.exe");
System.setProperty("webdriver.gecko.driver", "./DRIVER/geckodriver.exe");
	}
	public WebDriver driver;
	FileLib f = new FileLib();
    String path ="./TestData/commondata.properties";
    String xlpath ="./TestData/ActiTime Automation Test Data.xlsx";
	
	@BeforeTest
	
	public void openBrowser() throws Exception
	
	{
      String browsername=f.getPropertyValue(path,"browser");
      if(browsername.equals("chrome"))
      {
    	  driver = new ChromeDriver();
      }
      else if (browsername.equals("firefox")) 
      {
    	  driver = new FirefoxDriver();
	  }
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	@AfterTest
	public void closeBrowser() 
	
	{
		driver.close();
	}
	
	@BeforeMethod
	
	public void login() throws Exception
	{
		String url = f.getPropertyValue(path, "url");
		String UNvalue = f.getPropertyValue(path, "username");
		String PWvalue = f.getPropertyValue(path, "password");
		driver.get(url);
		
		Login l = new Login(driver);
		l.setUserName(UNvalue);
		l.setPassWord(PWvalue);
		l.clickLoginButton();
		
	}
	
	@AfterMethod
	
	public void logout()
	
	{
		EnterTimeTrack e = new EnterTimeTrack(driver);
		e.clickLogout();
	}
	}
	
	


