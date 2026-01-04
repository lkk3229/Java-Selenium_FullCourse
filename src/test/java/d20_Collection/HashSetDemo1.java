package d20_Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		HashSet hs1=new HashSet(100); //initial capacity 100
		HashSet hs2=new HashSet(50, (float) 0.90); //initial capacity 50, load factor 0.90
		HashSet <Integer> hs3=new HashSet<Integer>();
		
		HashSet hs = new HashSet(); //default capacity 16, load factor 0.75

		//Add objects/elements to HashSet
		hs.add(100);
		hs.add("Welcome");
		hs.add(15.5);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		System.out.println("HashSet elements: " + hs); // HashSet elements: [null, A, 100, Welcome, 15.5, true]
		
		//Remove object/element from HashSet
		hs.remove(15.5); //value
		System.out.println("After removing 15.5: " + hs); // After removing 15.5: [null, A, 100, Welcome, true]
		
		//contains()
		System.out.println("Contains 'Welcome': " + hs.contains("Welcome")); // Contains 'Welcome': true
		System.out.println("Contains 50: " + hs.contains(50)); // Contains 50: false
		
		System.out.println(hs.isEmpty()); //false
		
		//Reading elements from HashSet using for-each loop
		System.out.println("Reading elements from HashSet:");
		for(Object obj : hs) {
			System.out.println(obj);
		}
		
		Iterator it = hs.iterator();
		System.out.println("Reading elements using Iterator:");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}

}
