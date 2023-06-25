package Tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups={"Smoke"})
	public void pLoan()
	{
		System.out.println("good");
	}
	
	@BeforeTest
	public void preRequisite()
	{
		System.out.println("This is first test");
	}
	
	@AfterTest
	public void lastExecution()
	{
		System.out.println("This is last test");
	}
	
	@AfterSuite
	public void FirstSuite()
	{
		System.out.println("This is last suite");
	}
	
	@BeforeSuite
	public void LastSuite()
	{
		System.out.println("This is first suite");
	}

}
