package sscOnlineDraftTestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNG 
{

	@BeforeMethod()
	public void BeforeMethod()
	{
		System.out.println("@BeforeMethod");
	}
	
	@Test(enabled = false)
	public void Schecdule()
	{
		System.out.println("Schecdule");
	}
	
	@Test
	public void MakeABooking()
	{
		System.out.println("MakeABooking");
		int i = 100/0;
	}
		
	@Test(dependsOnMethods = "MakeABooking" )
	public void BLSubmit()
	{
		System.out.println("BLSubmit");
	}
	
	@Test
	public void Track()
	{
		System.out.println("Track");
	}
	/*
	@AfterMethod()
	public void AfterMethod()
	{
		System.out.println("@AfterMethod");
	}*/
}
