package d05_WorkingWithJavaLoops_JumpStatements;

public class forLoop {

	public static void main(String[] args) {
		//Ex1 : 1......10 numbers
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		//Ex 2 : 1.....10 even numbers
		for(int j=2;j<=10;j+=2)
		{
			System.out.println(j);
		}
		
		//Ex 3 : 1 ...10 
		/* 1 odd
		 * 2 even
		 * .
		 * .
		 * .
		 * 10 even
		 */
		     
		for(int k=1;k<=10;k++)
		{
			if(k%2==0)
			{
				System.out.println(k+ " Even");
			}
			else
			{
				System.out.println(k + " Odd");
			}
		
		}
		
		
		// Ex 4 : 10.........1 
		
		for(int z=10;z>0;z--)
		{
			System.out.println(z);
		}

	}

}

/*
==> for Loop
syntax:
	
for(initialization;condition;inc/dec)
{
	statements;
}




==> which loop is prefered to use
===========================================
* if you know the number of iterations in advance, the for loop is often the most suitable
* if you want to execute the loop at least once, the do-while loop is appropriate
* if you are uncertain about the number of iterations and loop termination is based on a 
   condition, the while loop is a good choice
   
  */ 
