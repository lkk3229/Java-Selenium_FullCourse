package d20_Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet lhs=new LinkedHashSet();
		HashSet hs=new HashSet();
		
		//Add objects/elements to LinkedHashSet
		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		lhs.add(400);
		lhs.add(500);
		System.out.println("LinkedHashSet elements: " + lhs); // LinkedHashSet elements: [100, 200, 300, 400, 500]
		
		//Add objects/elements to HashSet
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(500);
		System.out.println("HashSet elements: " + hs); // HashSet elements: [400, 100, 500, 200, 300]
		
		

	}

}
