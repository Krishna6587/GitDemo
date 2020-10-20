package com.TargetBay.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUpload 
{
	 WebDriver ldriver;
	 public FileUpload(WebDriver rdriver)
	 {
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
     }
	 
	 @FindBy(xpath="//input")
	 WebElement FileUpload;
	 @FindBy(xpath="//body/div[@id='root']/div[1]/div[5]/div[2]/div[1]/div[1]/*[1]")
	 WebElement Fileclose;
	 
     
	 public void Chooseafile()
	 {	 
	  FileUpload.sendKeys(System.getProperty("user.home")+"\\Desktop\\Mohan\\SE_Test.jpg");	
	 }
	 
	 public void closeafile()
	 {
	  Fileclose.click();	
	 }
	 
}
