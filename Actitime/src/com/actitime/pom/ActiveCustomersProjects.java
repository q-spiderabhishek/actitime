package com.actitime.pom;
/**
 * 
 * @author Abhishek
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveCustomersProjects

{

	@FindBy(xpath ="//span[contains(text(),'Create Customer')]")
	private WebElement createcustomerElement;

	@FindBy(id = "customerLightBox_nameField")
	private WebElement nametextboxElement;

	@FindBy(id = "customerLightBox_descriptionField")
	private WebElement descriptiontextboxElement;

	@FindBy(xpath ="//span[@class='buttonTitle'][contains(text(),'Create Customer')]") 
	private WebElement clickcreatecustomerbtnElement;

	@FindBy(id = "customerLightBox_cancelBtn")
	private WebElement clickcanclebtnElement;

	@FindBy(xpath ="//span[contains(text(),'Create Project')]")
	private WebElement clickcreateprojectElement;

	@FindBy(xpath = "//input[@id='projectPopup_projectNameField']")
	private WebElement projectnametextboxElement;
	
	@FindBy(xpath = "//button[@id='ext-gen23']")
	private WebElement selectcustomerbtnElement;
	
	@FindBy(xpath = "//textarea[@id='projectPopup_projectDescriptionField']")
	private WebElement projectdescriptiontextboxElement;

	public  ActiveCustomersProjects(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}

	public void ClickCreateCustomer()

	{
		createcustomerElement.click();
	}

	public void setCustomerName(String name)

	{
		nametextboxElement.sendKeys("BOB");
	}

	public void setCustomerDescription(String description)

	{
		descriptiontextboxElement.sendKeys("Hello BOB");	
	}

	public void ClickCreateCustomerBtn()
	{
		clickcreatecustomerbtnElement.click();
	}
	public void ClickCancleBtn()

	{
		clickcanclebtnElement.click();
	}
	public void ClickCreateProject()

	{
		clickcreateprojectElement.click();
	}
	public void setProjectName(String projectname)

	{
		projectnametextboxElement.sendKeys("Mysore BOB Project");
	}
	public void ClickSelectCustomer()
	{
		selectcustomerbtnElement.click();
	}
	public void setProjectDescription(String projectdescription) 
	{
		projectdescriptiontextboxElement.sendKeys("Hello Mysore BOB");
	}
}
