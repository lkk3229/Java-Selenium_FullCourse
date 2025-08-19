package d07_WorkingWithJavaArrays_CodingExamplesOnArray;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		
	//	int num=20; //hard coded
		
		Scanner sc=new Scanner(System.in);
		
		/*
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("The number is : "+num);
		*/
		
		/*
		System.out.println("Enter decimal Number");
		double num=sc.nextDouble();
		System.out.println("Given decimal value is : "+num);
		*/
		
		System.out.println("Enter city name");
		String city=sc.next();
		System.out.println("Your city is : "+city);
		
		
	}

}
