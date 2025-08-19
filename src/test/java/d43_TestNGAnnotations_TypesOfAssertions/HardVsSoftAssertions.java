package d43_TestNGAnnotations_TypesOfAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

	//@Test
	void test_hardassertions()
	{
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		Assert.assertEquals(1, 2); //hard Assertion
		
		
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		//Mostly last line should be assertion
	}
	
	@Test
	void test_softassertions()
	{
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		SoftAssert sa=new SoftAssert(); 
		
		sa.assertEquals(1, 2);  //soft Assertion
		
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		sa.assertAll();  //mandatory only for soft assertion
		
	}
}


/*
Hard Assertion
=================
1. we can access from "Assert" class
2. methods are static
3. if hard assertion failed then rest of the statements will not be executed


Soft Assertion
=====================
1. we can access through "SoftAssert" object
       SoftAssert sa = new SoftAssert();
	   sa.assertTrue();
2. If soft assertion got failed then rest of the statements still execute.

*/

