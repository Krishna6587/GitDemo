package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ex3 {
	@BeforeClass
	public void bfc()
	{
		System.out.println("Before executing any methods in the class");
	}
	@AfterClass
	public void afc()
	{
		System.out.println("After executing all methods in the class");
	}
	//@Parameters({"URL"})
	@Test(dataProvider="getData")
	public void webloginCarloan(String usrname,String password) 
	{
	   //Selenium
		System.out.println("weblogincar");	
	    System.out.println(usrname);
	    System.out.println(password);
	}
	@BeforeMethod
	public void bfm()
	{
		System.out.println("I will execute before every test method in ex3 class");
	}
	@AfterMethod
	public void afm()
	{
		System.out.println("I will execute after every test method in ex3 class");
	}
	
	@Test(groups= {"Smoke"})
	public void mobileloginCarloan() 
	{
		System.out.println("mobilelogincar");
	}
	@BeforeSuite
	public void bfsuite()
	{
		System.out.println("I am no.1");
	}
	@Test(dependsOnMethods= {"webloginCarloan"})
	public void apiloginCarloan() 
	{
		System.out.println("apilogincar");
	}
	@DataProvider
	public Object[][] getData()
	{
		//multiple datasets
		Object[][] data = new Object[3][2];
		
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		return data;
	}
}
