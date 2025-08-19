package d07_WorkingWithJavaArrays_CodingExamplesOnArray;

import java.util.Scanner;

public class TakingMultipleInputFromKeyboard {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		/*
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		
		System.out.println("Addition of two numbers :"+(num1+num2));
		*/
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		System.out.println("Enter decimal Number");
		double dec=sc.nextDouble();
		
		System.out.println("Enter Your name");
		String name=sc.next();
		
		System.out.println("Enter city name");
		String city=sc.next();
		
		
		
		System.out.println("Enter unknown value");
		Object value=sc.next();
		
		System.out.println("The number is : "+num);
		System.out.println("Given decimal value is : "+dec);
        System.out.println("Your name is : "+name);
		System.out.println("Your city is : "+city);
		System.out.println("The unknown value is : "+value);
		
		
	}

}
