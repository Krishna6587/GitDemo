package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ex2 {
	@Test(groups= {"Smoke"})
	public void plan()
	{
		System.out.println("Good");
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}
	
}
