package d07_WorkingWithJavaArrays_CodingExamplesOnArray;

public class FindHowManyDuplicatesInArray {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50};
		int num=10;
		int count=0;
		
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
		}
		
		System.out.println("the count of "+num+" in the array : "+count);
	}

}
