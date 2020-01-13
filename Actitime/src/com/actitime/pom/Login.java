package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Abhishek
 *
 */
public class Login 

{
	@FindBy(id = "username")
	private WebElement untextboxElement;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement pwdtextboxElement;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	public Login(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}
	/**
	 * to enter the value in username text box
	 * @param un
	 */
	public void setUserName(String un)

	{
		untextboxElement.sendKeys("admin");
	}
	public void setPassWord(String pwd)

	{
		pwdtextboxElement.sendKeys("manager");
	}

	public void clickLoginButton()

	{
		loginButton.click();
	}
}
