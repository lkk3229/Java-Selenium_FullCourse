package d07_WorkingWithJavaArrays_CodingExamplesOnArray;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		
		//char a[]= {'D','A','Z','B','M'};
		
		String a[]= {"scott","david","Rekha","Anuj","ram"};
		
		System.out.println("Before Sorting...........");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);   //sort element in Array
		
		System.out.println("After Sorting...........");
		System.out.println(Arrays.toString(a));

	}

}
