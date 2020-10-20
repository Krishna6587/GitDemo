package com.TargetBay.testCases;

import java.awt.AWTException;
import java.util.Properties;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TargetBay.Utilities.Baseclass;
import com.TargetBay.pageObjects.Formfillup;

public class TC_Formfillup_002 extends Baseclass 
{
	@Test
	public void FormfillupTest() throws InterruptedException, AWTException
	{
		Formfillup fl = new Formfillup(driver);
		Properties prop= ReadDatafrmConfig();
		System.out.println(prop.getProperty("react-multistep-URL"));
		driver.get(prop.getProperty("react-multistep-URL"));
		if(driver.getTitle().equals("Gotium"))
		{
			Assert.assertTrue(true);		
		}
		else 
		{
			Assert.assertTrue(false);		
		}
		fl.fillup();	
	}
}
