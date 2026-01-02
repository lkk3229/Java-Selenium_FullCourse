package d20_Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		String str[] = {"Dog", "Cat", "Rat", "Elephant", "Tiger"};
		
		for (String s : str) {
			System.out.println(s);
		}
		
		ArrayList al = new ArrayList(Arrays.asList(str));
		System.out.println("Elements in ArrayList: " + al);

	}

}
