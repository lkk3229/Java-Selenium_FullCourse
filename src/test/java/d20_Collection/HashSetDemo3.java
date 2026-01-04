package d20_Collection;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		
		//Union, Intersection, Difference of two HashSet
		
		HashSet <Integer> set1=new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		System.out.println("Set 1: " + set1); //Set 1: [1, 2, 3, 4, 5]
		
		HashSet <Integer> set2=new HashSet<Integer>();
		set2.add(4);
		set2.add(5);
		set2.add(3);
		
		System.out.println("Set 2: " + set2); //Set 2: [3, 4, 5]
		
		//Union
		set1.addAll(set2);
		System.out.println("Union of Set1 and Set2: " + set1); //Union of Set1 and Set2: [1, 2, 3, 4, 5]

		//Intersection
		set1.retainAll(set2);
		System.out.println("Intersection of Set1 and Set2: " + set1); //Intersection of Set1 and Set2: [3, 4, 5]
	
		//Difference
		set1.removeAll(set2);
		System.out.println("Difference of Set1 and Set2: " + set1); //Difference of Set1 and Set2: []
	
		//subset
		set1.containsAll(set2);
		System.out.println("Is Set2 subset of Set1: " + set1.containsAll(set2)); //Is Set2 subset of Set1: false
		System.out.println("subset : " + set1); //subset : []
	
	}

}
