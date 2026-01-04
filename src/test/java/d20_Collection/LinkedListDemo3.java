package d20_Collection;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		
		LinkedList l= new LinkedList();
		
		l.add("dog");
		l.add("cat");
		l.add("horse");
		l.add("elephant");
		System.out.println("Elements of LinkedList: "+l); //Elements of LinkedList: [dog, cat, horse, elephant]
		
		l.addFirst("lion");
		l.addLast("tiger");
		System.out.println("Elements of LinkedList after adding lion at first and tiger at last: "+l); //Elements of LinkedList after adding lion at first and tiger at last: [lion, dog, cat, horse, elephant, tiger]

		System.out.println("First element: "+l.getFirst()); //First element: lion
		System.out.println("Last element: "+l.getLast()); //Last element: tiger
		
		l.removeFirst();
		l.removeLast();
		System.out.println("Elements of LinkedList after removing first and last elements: "+l); //Elements of LinkedList after removing first and last elements: [dog, cat, horse, elephant]
		
	}

}
