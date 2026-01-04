package d20_Collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		System.out.println("Elements of LinkedList l: " + l); // Elements of LinkedList l: [X, Y, Z, A, B, C]

		LinkedList l1 = new LinkedList();
		l1.addAll(l);
		System.out.println("Elements of LinkedList l1: " + l1); // Elements of LinkedList l1: [X, Y, Z, A, B, C]

		l1.removeAll(l);
		System.out.println("Elements of LinkedList l1 after removing all elements of l: " + l1); // Elements of
																									// LinkedList l1

		// sort() Collections.sort(collection);
		System.out.println("Before sorting l: " + l); // Before sorting l: [X, Y, Z, A, B, C]
		Collections.sort(l);
		System.out.println("After sorting l: " + l); // After sorting l: [A, B, C, X, Y, Z]

		// reverse() Collections.reverse(collection);
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("After reversing l: " + l); // After reversing l: [Z, Y, X, C, B, A]

		// Shuffle() Collections.shuffle(collection);
		Collections.shuffle(l);
		System.out.println("After shuffling l: " + l); // After shuffling l: [B, Z, A, Y, C, X]

	}

}
