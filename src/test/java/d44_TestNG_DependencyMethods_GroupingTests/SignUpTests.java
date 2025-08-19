package d44_TestNG_DependencyMethods_GroupingTests;

import org.testng.annotations.Test;

public class SignUpTests {

	@Test(priority=1, groups= {"regression"})
	void SignupByEmail()
	{
		System.out.println("This is signup by email...");
	}
	
	@Test(priority=2, groups= {"regression"})
	void SignupByFacebook()
	{
		System.out.println("This is signup by facebook...");
	}
	
	@Test(priority=3, groups= {"regression"})
	void SignupByTwitter()
	{
		System.out.println("This is signup by twitter...");
	}
}
