package com.TargetBay.testCases;

import java.util.Properties;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.TargetBay.Utilities.Baseclass;
import com.TargetBay.pageObjects.FileUpload;

public class TC_FileUpload_001 extends Baseclass 
{
	@Test
	public void FileUploadTest() throws InterruptedException
	{		
		FileUpload fu = new FileUpload(driver);
		Properties prop= ReadDatafrmConfig();
		System.out.println(prop.getProperty("react-avatar-URL"));
		driver.get(prop.getProperty("react-avatar-URL"));
		if(driver.getTitle().equals("React Avatar"))
		{
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
		fu.Chooseafile();
		fu.closeafile();	
	}
}
