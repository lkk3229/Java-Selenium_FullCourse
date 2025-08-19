package d43_TestNGAnnotations_TypesOfAssertions;

import org.testng.annotations.*;

public class AllAnnotations {

	@BeforeSuite
	void bs()
	{
		System.out.println("This is BeforeSuite....");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is AfterSuite....");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is BeforeTest....");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("This is AfterTest....");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("This is BeforeClass....");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("This is AfterClass....");
	}
	
	@BeforeMethod
	void bm()
	{
		System.out.println("This is BeforeMethod....");
	}
	
	@AfterMethod
	void am()
	{
		System.out.println("This is AfterMethod....");
	}
	
	@Test(priority=1)
	void t1()
	{
		System.out.println("This is Test Method1....");
	}
	
	@Test(priority=2)
	void t2()
	{
		System.out.println("This is Test Method2....");
	}
}
