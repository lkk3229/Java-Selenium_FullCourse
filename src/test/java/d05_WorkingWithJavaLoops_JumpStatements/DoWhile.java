package d05_WorkingWithJavaLoops_JumpStatements;

public class DoWhile {

	public static void main(String[] args) {
		
		// Ex 1 : print 1 ...10 numbers
		
				int i=1;  //initialisation
				
				do
				{
					System.out.println(i); 
					i++; 
				}
				while(i<=10) ;  //conditions
				
			//	Ex 2 : print 10 ...1 numbers
				
				int j=10;  //initialisation
				
				do
				{
					System.out.println(j); 
					j--; 
				}
				while(j>=1) ;  //conditions
				

	}

}

/*
do while
====================
Syntax:
	do
	{
		statements;
		inc/dec;
	}while(condition);
*/	
