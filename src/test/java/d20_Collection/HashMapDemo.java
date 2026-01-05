package d20_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> HM = new HashMap<String, Integer>();
		
		HM.put("A", 1);
		HM.put("B", 2);
		HM.put("C", 3);
		HM.put("D", 4);
		HM.put("E", 5);
		
		System.out.println("HashMap: " + HM);
		
		HashMap m = new HashMap();

		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Smith");
		m.put(104, "Scott");
		m.put(105, "Mary");
		m.put(103, "XYZ"); // duplicate key not allowed, It will overwrite the latest one
		m.put(106, "Mary"); // duplicate value allowed

		System.out.println(m); // {101=John, 102=David, 103=Smith, 104=Scott, 105=Mary}

		System.out.println(m.get(104)); // Scott

		m.remove(105); // removes the key 105 and its value Mary
		System.out.println(m);

		System.out.println(m.containsKey(102)); // true
		System.out.println(m.containsKey(999)); // false
		System.out.println(m.containsValue("David")); // true
		System.out.println(m.containsValue("Hello")); // false

		System.out.println(m.isEmpty()); // false

		System.out.println(m.entrySet()); // returns all the key-value pairs

		// iterate through all the key-value pairs by for-each loop
		for (Object e : m.entrySet()) {
			System.out.println("Entry: " + e);
		}

		System.out.println(m.keySet()); // returns all the keys

		for (Object key : m.keySet()) {
			System.out.println("Key: " + key + ", Value: " + m.get(key));
		}

		// iterate through all the keys by for-each loop
		for (Object key : m.keySet()) {
			System.out.println("Key: " + key);
		}

		System.out.println(m.values()); // returns all the values

		// iterate through all the values by for-each loop
		for (Object value : m.values()) {
			System.out.println("Value: " + value);
		}

		System.out.println(m.replace(102, "Daniel")); // replaces the value of key 102 from David to Daniel

		System.out.println("Size of the HashMap: " + m.size()); // 5

		//Entry methods
		System.out.println();
		System.out.println("Using Entry methods:");
		
		for (Object e : m.entrySet()) {
			HashMap.Entry entry = (HashMap.Entry) e;
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		
		for (Map.Entry entry: HM.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());	
		}
		
		//Iterator
		Set s= m.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		
		
		
		
	}

}
