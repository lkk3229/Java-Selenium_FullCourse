package d03_WorkingWithJavaOperatorsAndExpressions;

public class OperatorsDemo {

	public static void main(String[] args) {
		// 1. Arithmetic operators + -  % * / 
		
		int a=20, b=10;
		
		int result=a+b;
		System.out.println("Sum of a and b is :"+result);
		
		System.out.println("Sum of a and b is :"+(a+b));
		System.out.println("Diff of a and b is :"+(a-b));
		System.out.println("Multiplication of a and b is :"+(a*b));
		System.out.println("Division of a and b is :"+(a/b));
		System.out.println("Modulo division of a and b is :"+(a%b));
		
		//2. Relational/comparison operators < >= > <= != ==
		// these can be used only between two variables (for any type of data)
		//returns boolean value - true/false
		// for String it will compare ASCII value
		
		System.out.println(a>b);  //true
		System.out.println(a<b);  //false
		System.out.println(a>=b);  //true
		System.out.println(a<=b);  //false
		System.out.println(a==b);  //false
		System.out.println(a!=b);  //true
		
		b=20;
		System.out.println(a>=b);  //true
		System.out.println(a<=b);  //true
		System.out.println(a==b);  //true
		System.out.println(a!=b);  //false
		
		boolean res=a<b;
		System.out.println(res);  //false
		
		// 3. Logical Operators && || !
		// these can be only used with boolean data type
		//works between 2 boolean values
		//returns boolean value - true/false
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y); //false
		System.out.println(x || y); //true
		System.out.println(!x); //false
		System.out.println(!y); //true
		
		boolean b1=10>20;
		System.out.println(b1); //false
		
		boolean b2=10<20;
		System.out.println(b2);  //true
		
		System.out.println(b1 && b2); //false
		System.out.println(b1 || b2); //true
		System.out.println(!b1); //false
		System.out.println(!b2); //true
		
		System.out.println((10<20) && (20>10)); //true
		
		
		
	}

}

/*
Operators
=====================
Operator is a symbol which will perform operation.
e.g. +,=

The variables which participated inside this expression along with opeartors are called operands
int a=10;
int b=20;
int res=a+b;
So, +,+ operators
a,b operands


=============================
Types of Operators
----------------------------
1. Arithmetic operators + -  % * / 
2. Relational/comparison operators < >= > <= != ==
3. Logical Operators && || !
4. Increment & Decrement operators ++ --
5. Assignment = += -= *= /= %=
6. conditional/ternary operator ?:

*/