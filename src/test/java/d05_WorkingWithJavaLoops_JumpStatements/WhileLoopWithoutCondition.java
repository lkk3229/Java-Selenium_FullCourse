package d05_WorkingWithJavaLoops_JumpStatements;

public class WhileLoopWithoutCondition {

	public static void main(String[] args) {
		int i=1;
		
		while(true)
		{
			System.out.println("Hello");
			i++;
			
			if(i==10)
			{
				break;
			}
		}

	}

}

/*
bike --- source, destination,fuel   - for loop
bus --- do while
flight --- while

*/
