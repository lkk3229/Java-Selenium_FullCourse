package d06_WorkingWithJavaArrays_SingleAndTwoDimensional;
/*
Single dimensional Array
============================
1. declare an array
2. Add value into array
3. Find size of an array
4. read single value from an array
5. read multiple values from an array
*/
public class SingleDimensionalArray {

	public static void main(String[] args) {
		// declaring array
		
		//Approach 1
	/*	int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
	*/
		
		//Approach 2
		int a[]= {100,200,300,400,500};
		//int a[]= {};
		
		
		//Find length of an array
		System.out.println("Length of an array : "+a.length);
		
		//Read single value from an array
		System.out.println(a[4]); //here 4 is index
		
		//reading all the values from an array
		
		//Normal for loop
		for(int i=0; i<a.length;i++)   //i<=a.length-1
		{
			System.out.println(a[i]);
		}
		
		//enhance for loop / for each..loop
		for(int x:a)
		{
			System.out.println(x);
		}
		
	}

}

/*
Arrays ==> Array is collection of elements of same data type (Homogenious data).
           We can store multiple values into a single variable.

Types of Arrays
====================
1. Single dimensional
2. Two dimensional/multi dimensionals

*/