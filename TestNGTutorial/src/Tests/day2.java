package Tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups = { "Smoke" })
	public void pLoan() {
		System.out.println("@Test");
	}

	@BeforeTest
	public void preRequisite() {
		System.out.println("@BeforeTest");
	}

	@AfterTest
	public void lastExecution() {
		System.out.println("@AfterTest");
	}

	@AfterSuite
	public void LastSuite() {
		System.out.println("@AfterSuite");
	}

	@BeforeSuite
	public void FirstSuite() {
		System.out.println("@BeforeSuite");
	}

}
