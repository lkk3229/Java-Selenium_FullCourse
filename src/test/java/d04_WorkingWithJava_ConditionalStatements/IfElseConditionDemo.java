package d04_WorkingWithJava_ConditionalStatements;

public class IfElseConditionDemo {

	//Example 1: personAge>=18 elogible for vote
	//personAge>18 Not eligible for vote
	
	public static void main(String[] args) {
		
		int person_age=15;
		
		if(person_age>=18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Not Eligible for vote");
		}
		
		/*if(person_age>=18)
			System.out.println("Eligible for vote");
		else
			System.out.println("Not Eligible for vote");
		*/
	}

}


/*

==> if else
Syntax:

if(condition)
{
  statements
}

else
{
  statements
}

*/