package d03_WorkingWithJavaOperatorsAndExpressions;

public class IncrementOperator {

	public static void main(String[] args) {
		//4. Increment & Decrement operators ++ --  ==> only work with Numerical
		// ++ is called increment operator
		
		//case 1
		
		int c=10;
		System.out.println(c);  //10
		
		c++;     //c=c+1;
		System.out.println(c); //11
		
		
		//case 2   ==> post increment

		int a=10;
		int res=a++;    
		System.out.println(res);  // 10
		System.out.println(a);     //11
		
		//case 3  ==> pre increment

		int b=10;
		int res1=++b;    
		System.out.println(res1);  // 11
		System.out.println(b);     //11
		
	}

}
