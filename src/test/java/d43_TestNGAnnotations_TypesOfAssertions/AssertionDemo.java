package d43_TestNGAnnotations_TypesOfAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

	@Test
	void testTitle()
	{
		String exp_title="Opencart";
		String act_title="Openshop";
		
		/*if(exp_title.equals(act_title))
		{
			System.out.println("test passes");
		}
		else
		{
			System.out.println("test failed");
		}
		*/
		
		//Assert.assertEquals(exp_title, act_title);
		
		if(exp_title.equals(act_title))
		{
			System.out.println("test passes");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test failed");
			Assert.assertTrue(false);
		}
		
	}
}

/*
==> 2 kinds of assertion
-------------------------------
1. hard assertion
2. soft assertion
*/
