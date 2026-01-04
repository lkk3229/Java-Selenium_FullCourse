package d20_Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		//Declare LinkedList
		
		LinkedList <Integer> ll1 = new LinkedList<Integer>();
		LinkedList <String> ll2 = new LinkedList<String>();
		
		LinkedList l= new LinkedList();
		
		//Add elements to LinkedList
		l.add(100);
		l.add("Welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		
		System.out.println("Elements of LinkedList: "+l); //Elements of LinkedList: [100, Welcome, 15.5, A, true, null]
		
		System.out.println("Size of LinkedList: "+l.size());  //Size of LinkedList: 6
		
		//Remove element from LinkedList
		l.remove(3);
		System.out.println("Elements of LinkedList after removing 3rd index: "+l); //Elements of LinkedList after removing 3rd index: [100, Welcome, 15.5, true, null]

		l.remove("Welcome");
		System.out.println("Elements of LinkedList after removing 'Welcome': "+l); //Elements of LinkedList after removing 'Welcome': [100, 15.5, true, null]
	
		//Insert/adding element at specific index
		l.add(3, "Java");
		System.out.println("Elements of LinkedList after adding 'Java' at 3rd index: "+l); //Elements of LinkedList after adding 'Java' at 3rd index: [100, 15.5, true, Java, null]
	
		//Retrieve element from LinkedList
		System.out.println("Element at 4th index: "+l.get(4)); //Element at 4th index: null
		
		//Update element of LinkedList
		l.set(4, "Selenium");
		System.out.println("Elements of LinkedList after updating 4th index: "+l); //Elements of LinkedList after updating 4th index: [100, 15.5, true, Java, Selenium]
		
		//contains() method
		System.out.println("Does LinkedList contains 'Java'? "+l.contains("Java")); //true
		System.out.println("Does LinkedList contains 'Python'? "+l.contains("Python")); //false
		
		//isEmpty() method
		System.out.println("Is LinkedList empty? "+l.isEmpty()); //false
		
		//Reading all elements of LinkedList using for loop
		for(int i=0; i<l.size(); i++) {
			System.out.println("Element at index "+i+": "+l.get(i)); 
		}
		
		//Reading all elements of LinkedList using for-each loop
		for(Object e : l) {
			System.out.println(e);
		}
		
		//Itertor
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
