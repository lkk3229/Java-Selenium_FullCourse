package d04_WorkingWithJava_ConditionalStatements;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		
		int weekno=1;
		
		switch(weekno)
		{
		case 1: System.out.println("Sunday");   break;
		case 2: System.out.println("Monday");   break;
		case 3: System.out.println("Tuesday");   break;
		case 4: System.out.println("Wednesday");   break;
		case 5: System.out.println("Thrusday");   break;
		case 6: System.out.println("Friday");   break;
		case 7: System.out.println("Saturday");   break;
		default: System.out.println("Invalid Week Number");  
		}

	}

}

/*

==> Switch case
Syntax:

switch(variable)
{
  case value1:statements;
  case value2:statements;
  case value3:statements;
  default: statements
}

*/
