package d20_Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo2 {

	public static void main(String[] args) {
	
		PriorityQueue q = new PriorityQueue();
		
		// Adding elements to the Queue  add() or offer()
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C"); //duplicates are allowed 
		q.offer(100); //heterogeneous elements are not allowed in PriorityQueue
		
		System.out.println("Elements in Queue: " + q); // Elements in Queue: [A, B, C, C]
		//insertion order is preserved & duplicates are allowed
		
		//get head element without removing it element() or peek()
		//System.out.println("Head element: " + q.element()); // Head element: A  Returns Head Element, if empty return NoSuchElementException
	//	System.out.println("Head element: " + q.peek());    // Head element: A  Returns Head Element, if empty return null
		
		//Return and Remove elements from the Queue  remove() or poll()
	//	System.out.println("Removed element: " + q.remove()); // Removed element: A  Throws NoSuchElementException if empty
	//	System.out.println("Elements in Queue after remove(): " + q); // Elements in Queue after remove(): [B, C, C]

		//System.out.println("Removed element: " + q.poll()); // Removed element: B  Returns null if empty
		//System.out.println("Elements in Queue after poll(): " + q); // Elements in Queue after poll(): [C, C]
	
		Iterator itr = q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		for(Object obj : q) {
			System.out.println(obj);
		}
		
	
	
	}

}
