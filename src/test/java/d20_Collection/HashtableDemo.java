package d20_Collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {
		
		Hashtable t = new Hashtable(); // default initial capacity is 11, load factor is 0.75
		
		Hashtable t1 = new Hashtable(20); // initial capacity is 20, load factor is 0.75

		Hashtable t2 = new Hashtable(30, 0.9f); // initial capacity is 30, load factor is 0.9	
		
		Hashtable<String, Integer> HT = new Hashtable<String, Integer>();
		HT.put("A", 1);
		HT.put("B", 2);
		HT.put("C", 3);
		HT.put("D", 4);
		HT.put("E", 5);
		System.out.println("Hashtable: " + HT);
		
		
		
		t.put(101, "John");
		t.put(102, "David");
		t.put(103, "Smith");
		t.put(104, "Scott");
		t.put(105, "Mary");
		// t.put(null, "Hello"); // null key not allowed
		
		System.out.println(t); // {104=Scott, 103=Smith, 102=David, 101=John, 105=Mary}	
		
		System.out.println(t.get(104)); // Scott
		
		t.remove(105); // removes the key 105 and its value Mary		
		System.out.println(t);
		
		System.out.println(t.containsKey(102)); // true
		System.out.println(t.containsKey(999)); // false
		
		System.out.println(t.containsValue("David")); // true
		System.out.println(t.containsValue("Hello")); // false
		
		System.out.println(t.isEmpty()); // false
		
		System.out.println(t.entrySet()); // returns all the key-value pairs
		System.out.println(t.keySet()); // returns all the keys
		System.out.println(t.values()); // returns all the values
		
		for (Object key : t.keySet()) {
			System.out.println("Key: " + key + ", Value: " + t.get(key));
		}
		
		//Entry specific methods....
		
		for (Object e : HT.entrySet()) {
			System.out.println("Entry: " + e);
		}
		
		for (Map.Entry entry:HT.entrySet()) //Key-Value pair
		{
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
		//iterate through all the values by for-each loop
		for (Object value : t.values()) {
			System.out.println("Value: " + value);
		}
		
		//Iterator()
		Set s = t.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
		
		

	}

}
