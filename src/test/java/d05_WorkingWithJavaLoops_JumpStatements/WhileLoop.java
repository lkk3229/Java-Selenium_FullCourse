package d05_WorkingWithJavaLoops_JumpStatements;

public class WhileLoop {

	public static void main(String[] args) {
		
	/*	// Ex 1 : print 1 ...10 numbers
		
		int i=1;  //initialisation
		
		while(i<=10)   //conditions
		{
			System.out.println(i); 
			i++;    //inc
		}
		
		*/
		
		/*
		// Ex 2 : print Hello message 10 times
		
				int i=1;  //initialisation
				
				while(i<=10)   //conditions
				{
					System.out.println("Hello"); 
					i++;    //inc
				}
		*/
		
		// Ex 3 : print even numbers between 1 ...10 
		/*     //Approch 1
				int i=2;  //initialisation
				
				while(i<=10)   //conditions
				{
					System.out.println(i); 
					i+=2;    //inc
				}
				*/
		
				//Approch 2
			/*	int i=1;  //initialisation
				
				while(i<=10)   //conditions
				{
					if(i%2==0)
					{
					System.out.println(i); 
					}
					i++;    //inc
				}
				
				*/
	//	Ex 4 : 1 ...10 
		/* 1 odd
		 * 2 even
		 * .
		 * .
		 * .
		 * 10 even
		 
		     
				int i=1;  //initialisation
				
				while(i<=10)   //conditions
				{
					if(i%2==0)
					{
						System.out.println(i + " Even");
					}
					else
					{
						System.out.println(i + " Odd");
					}
					; 
					i++;    //inc
				}
		
		*/
		
		// Ex 5 : print 10 ...1 numbers
		
				int i=10;  //initialisation
				
				while(i>0)   //conditions
				{
					System.out.println(i); 
					i--;    //inc
				}
		
		

	}

}


/*
Looping/Iterative statements
==============================
while Loop
do while Loop
for Loop
enahanced for Loop/for each Loop   ==> mostly for collection


==> while Loop
syntax:
	
initialisation;
while(condition)
{
	inc/dec
}

*/