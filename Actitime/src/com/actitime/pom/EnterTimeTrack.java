package com.actitime.pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack 

{
	@FindBy(xpath ="//a[contains(@class,'content tasks')]//div[contains(@class,'img')]")
	private WebElement tasksElement;
	
	@FindBy(xpath = "//a[@id='logoutLink']")
	private WebElement logoutElement;

	public EnterTimeTrack(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}

	public void clickTask()

	{
		tasksElement.click();
	}

	public void clickLogout() 
	
	{
		logoutElement.click();
		
	}

}
