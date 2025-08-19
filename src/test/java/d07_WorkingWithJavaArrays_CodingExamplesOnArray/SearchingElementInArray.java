package d07_WorkingWithJavaArrays_CodingExamplesOnArray;

public class SearchingElementInArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int search_element=10;
		boolean status=false;
		
		/*
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element Found");
				status=true;
				break;
			}
		}
		*/
		
		for(int x:a)
		{
			if(x==search_element)
			{
			System.out.println("Element Found");
			status=true;
			break;
			}
		}
		
		if(status==false)
		{
			System.out.println("Element not Found");
		}

	}

}
