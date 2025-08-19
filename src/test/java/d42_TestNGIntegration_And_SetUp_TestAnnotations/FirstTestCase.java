package d42_TestNGIntegration_And_SetUp_TestAnnotations;

import org.testng.annotations.Test;

//TestNG - test new generation  ==> java based unit testing tool
/*
 1. open app
 2. Login
 3. Logout
 */


public class FirstTestCase {

	@Test(priority=1)
	void Logout()
	{
		System.out.println("Logout from application....");
	}
	
	@Test(priority=0)
	void Login()
	{
		System.out.println("Login to application....");
	}
	
	@Test(priority=-1)
	void openapp()
	{
		System.out.println("Opening application....");
	}
	
}

/*
  Advantages:
  =================
 1. Test cases & Test suites
 2. Grouping of test cases
 3. Prioritize
 4. Parameterization
 5. parallel testing
 6. Reports
 
 TestNG Configuration:
 =======================
 1. Install TestNg in eclipse from eclipse marketplace
 2. Add Testng Library to build path / add testng dependency in pom.xml
 
 ==> TestNG execute test methods based on Alphabetical order
 ==> @Test(priority=num) controls the order of execution
 ==> Once you provide priority to the test methods, then order of methods is not considered.
 ==> Priorities can be random numbers (no need to have consecutive numbers)
 ==> If you don't provide priority then default value is Zero (0).
 ==> If the priorities are same then again execute methods in alphabetical order.
 ==> Negative values are allowed in priority.
 ==> TestNG execute test methods only if they are having @Test annotation.
 
 
 test suite --> test cases --> test steps
 xml file   --> classes    --> test methods
 
 2 things achieved through xml 
 ================================
 1. executed group of test cases as a 1 suite
 2. we can generate testng reports (default)
*/
