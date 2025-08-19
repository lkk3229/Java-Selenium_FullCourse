package d06_WorkingWithJavaArrays_SingleAndTwoDimensional;
/*
Two dimensional Array
=========================
1. declare an array
2. add values into array
3. Find size of an array
3. Read single value from an array
5. Read multiple values from an array
*/
public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//declaring an array
		
		//Approach 1
	/*	int a[][]=new int [3][2];  //int [][]a=new int[3][2];   int []a[]=new int [3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		
		//Approach 2
		
		int a[][]= {  {100,200},
				      {300,400},
				      {500,600}
		};
		
		//Find size of an array
		System.out.println("Length of rows: "+a.length);
		System.out.println("Length of column : "+a[0].length);
		
		//Read single value from an array
		//System.out.println(a[2][1]);
		
		//reading all the values from an array
		// normal for
		/*for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				System.out.print(a[r][c]+"   ");
			}
			System.out.println();
		} */
		
		//enhanced for loop
		
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+"   ");
			}
			System.out.println();
		}
		
		
		
	}
	
}

/*
==> Two dimensional Array
===============================
contains row and column

*/