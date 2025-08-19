package d03_WorkingWithJavaOperatorsAndExpressions;

public class decrementOperator {

	public static void main(String[] args) {
		//4. Increment & Decrement operators ++ --
		
		// -- is called decrement operator
		//case 1
		
		int x=10;
		System.out.println(x);  //10
		
		x--;     //x=x-1;
		System.out.println(x); //9
		
		
		//case 2   ==> post decrement

		int y=10;
		int resy=y--;    
		System.out.println(resy);  // 10
		System.out.println(y);     //9
		
		//case 3  ==> pre decrement

		int z=10;
		int resz=--z;    
		System.out.println(resz);  // 9
		System.out.println(z);     //9
		
	}

}
