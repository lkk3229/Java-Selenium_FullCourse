package d04_WorkingWithJava_ConditionalStatements;
/*
Example 4: Largest of 3 Numbers
a>b and a>c   -- a is largest
b>a and b>c   -- b is largest
c>a and c>b   -- c is largest
*/
public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		int a=10, b=20, c=30;
		
		if (a>b && a>c)
		{
			System.out.println("a is the largest number "+a);
		}
		else if (b>a && b>c)
		{
			System.out.println("b is the largest number "+b);
		}
		else
		{
			System.out.println("c is the largest number "+c);
		}

	}

}
