package d20_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		System.out.println("Elements in al_dup ArrayList: " + al_dup); // Elements in al_dup ArrayList: [X, Y, Z, A, B, C]
		
		al_dup.removeAll(al);
		System.out.println("Elements in al_dup ArrayList after removeAll: " + al_dup); // Elements in al_dup ArrayList after removeAll: []
		
		//sort -- Collections.sort()
		System.out.println("Elements in al ArrayList before sorting: " + al); // Elements in al ArrayList before sorting: [X, Y, Z, A, B, C]
		Collections.sort(al);
		System.out.println("Elements in al ArrayList after sorting: " + al); // Elements in al ArrayList after sorting: [A, B, C, X, Y, Z]
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Elements in al ArrayList after reverse sorting: " + al); // Elements in al ArrayList after reverse sorting: [Z, Y, X, C, B, A]

		//shuffling -- Collections.shuffle()
		Collections.shuffle(al);
		System.out.println("Elements in al ArrayList after shuffling: " + al); // Elements in al ArrayList after shuffling: [B, Z, A, Y, C, X]
		
	}

}
