package SeleniumTrainingSession;

import java.util.Hashtable;
import java.util.Map;

public class HashTableHashMap {

	public static void main(String[] args) {

		// ----------hashtable -------------------------
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "Heli");
		ht.put(102, "Himanshu");
		ht.put(103, "Astha");
		ht.put(104, "Avinash");
		System.out.println("-------------Hash table--------------");
		for (Map.Entry m : ht.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}

//			Hashmap<Integer, String> ht = new Hashmap<Integer, String>();
//			ht.put(101, "Heli");
//			ht.put(102, "Himanshu");
//			ht.put(103, "Astha");
//			ht.put(104, "Avinash");
//			System.out.println("-------------Hash table--------------");
//			for (Map.Entry m : ht.entrySet()) {
//				System.out.println(m.getKey() + " " + m.getValue());
//			}
//	
