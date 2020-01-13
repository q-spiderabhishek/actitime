package com.actitime.test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.excelant.ExcelAntEvaluateCell;
/**
 * @author Abhishek
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;
import com.actitime.pom.ActiveCustomersProjects;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.Login;
import com.actitime.pom.Open_Tasks;
@Listeners(com.actitime.generics.ListenersCls.class)
public class CreateCustomer extends BaseClass
{
@Test
public void testCreateCustomer()
{
	String xlpath ="./TestData/ActiTime Automation Test Data.xlsx";
	String sheet="Create Customer";
	//String CCvalue = Excel.getCellData(xlpath, sheet, 1, 0);
}

}
