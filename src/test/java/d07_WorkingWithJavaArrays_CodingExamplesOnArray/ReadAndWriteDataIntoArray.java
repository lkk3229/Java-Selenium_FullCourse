package d07_WorkingWithJavaArrays_CodingExamplesOnArray;

import java.util.Arrays;
import java.util.Scanner;

public class ReadAndWriteDataIntoArray {

	public static void main(String[] args) {

		int a[]=new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Enter a value:");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Printing array element");
		
		System.out.println(Arrays.toString(a));

	}

}

/*
Assignment
========================
1. find 2nd largest number in array
2. find smallest number in array
*/
