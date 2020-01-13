package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib 

{
	public String getPropertyValue(String path, String key) throws IOException

	{
		FileInputStream fis = new FileInputStream(path);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}

	public static String getCellData(String xlpath, String sheet, int row, int cell)

	{
		String v= "";
		try 
		{

			FileInputStream fis = new FileInputStream(xlpath);
			Workbook wb = WorkbookFactory.create(fis);
			wb.getSheet(sheet).getRow(row).getCell(cell).toString();

		} 
		catch (Exception e) 
		{

		}
		return v;	
	}
	
	public static int getRowcount(String xlpath, String sheet)
	
	{
		int rc = 0;
		try 
		{
			FileInputStream fis = new FileInputStream(xlpath);
			Workbook wb = WorkbookFactory.create(fis);
			rc = wb.getSheet(sheet).getLastRowNum();
		}
		catch (Exception e) 
		{
		
		}
		return rc;
	}
}


