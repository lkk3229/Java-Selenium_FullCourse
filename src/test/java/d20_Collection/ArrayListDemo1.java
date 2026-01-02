package d20_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// Declare an ArrayList to hold String elements
		ArrayList al1 = new ArrayList();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		ArrayList<String> al3 = new ArrayList<String>();
		List al4 = new ArrayList();

		ArrayList al = new ArrayList();

		// Add new elements to the ArrayList
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);

		System.out.println("Elements in ArrayList: " + al); // Elements in ArrayList: [100, Welcome, 15.5, A, true]

		// Get the size of the ArrayList
		System.out.println("Size of ArrayList: " + al.size()); // Size of ArrayList: 5

		// Remove an element from the ArrayList
		al.remove(2);
		al.remove("Welcome");
		System.out.println("Elements in ArrayList after removal: " + al); // Elements in ArrayList after removal: [100,
																			// A, true]

		// Insert element at specific index
		al.add(1, "Java");
		System.out.println("Elements in ArrayList after insertion: " + al); // Elements in ArrayList after insertion:
																			// [100, Java, A, true]

		// Retrieve element at specific index
		Object element = al.get(2);
		System.out.println("Element at index 2: " + element); // Element at index 2: A

		// Update element at specific index
		al.set(2, 'B');
		System.out.println("Elements in ArrayList after update: " + al); // Elements in ArrayList after update: [100,
																			// Java, B, true]
		// search for element index - contains() - returns boolean
		System.out.println(al.contains(100));// true
		System.out.println(al.contains("Python"));// false

		// isEmpty()
		System.out.println(al.isEmpty());// false

		// Iterate through the ArrayList using for each Loop
		System.out.println("Iterating through ArrayList by for each Loop:");
		for (Object obj : al) {
			System.out.println(obj);
		}

		// Iterate using for loop
		System.out.println("Iterating through ArrayList by for loop:");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		//Iterator
		System.out.println("Iterating through ArrayList by Iterator:");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Check if an element exists in the ArrayList
		boolean containsJava = al.contains("Java");
		System.out.println("ArrayList contains 'Java': " + containsJava); // ArrayList contains 'Java': true

		// Clear all elements from the ArrayList
		al.clear();
		System.out.println("Size of ArrayList after clearing: " + al.size()); // Size of ArrayList after clearing: 0

	}

}
