package d20_Collection;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		HashSet<Integer> evenNumber=new HashSet<Integer>();
		
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		
		System.out.println("Even Numbers: " + evenNumber); //Even Numbers: [2, 4, 6]
		
		HashSet <Integer> number=new HashSet<Integer>();
		number.addAll(evenNumber); //addAll()
		number.add(1);
		
		System.out.println("Numbers: " + number); //Numbers: [1, 2, 4, 6]

		//removeAll()
		number.removeAll(evenNumber);
		System.out.println("After removing even numbers: " + number); //After removing even numbers: [1]
		
		
		
		
		
	}

}
