package d04_WorkingWithJava_ConditionalStatements;

public class PositiveOrNegativeNumber {

	//Example 3: Check number is positive, negative or Zero
		//personAge>18 Not eligible for vote
		
		public static void main(String[] args) {
			
			int num=15;
			
			if(num>0)
			{
				System.out.println("Positive Number");
			}
			else if (num<0)
			{
				System.out.println("Negative Number");
			}
			else
			{
				System.out.println("zero");
			}
}
}

/*

==> if... else ladder
Syntax:

if(condition1)
{
  statements
}
else if(condition2)
{
  statements
}
else if(condition3)
{
  statements
}
else if(condition4)
{
  statements
}
else
{
  statements
}

*/
