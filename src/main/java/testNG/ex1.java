package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ex1 {
	@AfterTest
	public void lastexecution() 
	{
		System.out.println("I Will execute last");
	}
	@Test(enabled=false)
	public void firstTest() 
	{
		System.out.println("Hello");
	}
	@AfterSuite
	public void afsuite() 
	{
		System.out.println("I am the no.1 from last");
	}
	@Test
	public void secondTest() 
	{
		System.out.println("Bye");
	}

}
