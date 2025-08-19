package d44_TestNG_DependencyMethods_GroupingTests;

import org.testng.annotations.Test;

public class PaymentTests {

	@Test(priority=1, groups= {"sanity","regression","functional"})
	void PaymentinRupees()
	{
		//for combination of groups try to a common name like for sanity and regression both the common name is functional
		System.out.println("payment in rupees...");
	}
	
	@Test(priority=2, groups= {"sanity","regression","functional"})
	void PaymentinDollars()
	{
		System.out.println("payment in dollars...");
	}
}
