package com.actitime.pom;

/**
 * @author Abhishek
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Open_Tasks 

{

	@FindBy(xpath ="//a[contains(text(),'Projects & Customers')]")
	private WebElement projectcustomerElement;

	public Open_Tasks(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}

	public void clickProjectCustomer()

	{
		projectcustomerElement.click();
	}

}
