package com.TargetBay.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Formfillup 
{
	WebDriver ldriver;
	WebDriverWait wd;
	
	public Formfillup(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wd=new WebDriverWait(ldriver,30);	
	} 
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	 WebElement FirstName;
	@FindBy(xpath="//input[@placeholder='Last Name']")
	 WebElement LastName;
	@FindBy(xpath="//*[@id='app']/div/div[1]/div/div[2]/button[2]")
	 WebElement Nextbtn;
	@FindBy(xpath="//input[@placeholder='test@mailbox.com']")
     WebElement Email;
	@FindBy(xpath="//input[@placeholder='Confirm email']")
    WebElement ConfirmEmail;
	@FindBy(xpath="//input[@placeholder='Password']")
    WebElement Password;
	@FindBy(xpath="//input[@placeholder='Confirm Password']")
    WebElement ConfirmPassword;	
	@FindBy(xpath="//input[@type='checkbox']")
    WebElement AcceptCheckbox;	
	
	public void fillup() throws InterruptedException, AWTException
	{
		FirstName.sendKeys("Mohan");
		LastName.sendKeys("Krishna");
		Nextbtn.click();
		wd.until(ExpectedConditions.visibilityOfAllElements(Nextbtn));
		Email.sendKeys("vncqsmohan@gmail.com");
		ConfirmEmail.sendKeys("vncqsmohan@gmail.com");
		Nextbtn.click();
		wd.until(ExpectedConditions.visibilityOfAllElements(Nextbtn));
		Password.sendKeys("abc1234$*");
		ConfirmPassword.sendKeys("abc1234$*");
		Nextbtn.click();
		wd.until(ExpectedConditions.visibilityOfAllElements(AcceptCheckbox));
		AcceptCheckbox.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Assert.assertTrue(Nextbtn.isDisplayed());
	}
}

