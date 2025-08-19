package d06_WorkingWithJavaArrays_SingleAndTwoDimensional;

public class ObjectArray {

	public static void main(String[] args) {
		
		Object a[]= {100,10.5,'A',"Welcome", true};
		
		/*for(Object x:a)
		{
			System.out.println(x);
		}*/
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}

/*
 Assignment
================
1. Find the sum of Element in Array
2. Find 2nd largest number from an array
3. Print Even and odd number from an array
*/
