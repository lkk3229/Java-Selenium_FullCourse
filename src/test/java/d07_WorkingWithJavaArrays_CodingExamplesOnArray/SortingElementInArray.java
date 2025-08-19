package d07_WorkingWithJavaArrays_CodingExamplesOnArray;

import java.util.Arrays;

public class SortingElementInArray {

	public static void main(String[] args) {
		
		int a[]= {10,40,90,70,50};
		
		System.out.println("Before Sorting...........");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);   //sort element in Array
		
		System.out.println("After Sorting...........");
		System.out.println(Arrays.toString(a));

	}

}
