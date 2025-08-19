package d05_WorkingWithJavaLoops_JumpStatements;

public class ContinueStatement {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
		{
			if(i==3 || i==5 || i==9)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}

/*
Control Statements
=========================
1. Conditional Statement ==> if, if-else, nested ifelse, switchcase
2. looping/iterative statement ==>while, do-while, for loop
3. jumping statement ==> break, continue



Assignments
===========================
1. reverse a numbers
2. polindrome number
3. Count number of digit in a number
4. Count number of even and odd digit in a number
5. find sum of digits in anumber

*/