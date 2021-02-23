package testNG;

import org.testng.annotations.Test;

public class ex4 {
	@Test
	public void webloginHomeloan() 
	{
	    System.out.println("webloginhome");	
	}
	@Test(groups= {"Smoke"})
	public void mobileloginHomeloan() 
	{
		System.out.println("mobileloginhome");
	}
	@Test
	public void apiloginHomeloan() 
	{
		System.out.println("apiloginhome");
	}
}
