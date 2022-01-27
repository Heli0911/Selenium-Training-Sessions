package SeleniumTrainingSession;
//import java.util.Hashtable;

import java.util.Hashtable;

public class HashMap {

	public static void main(String[] args) {

//		// create and populate hash map
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(1, "Java");
		map.put(2, "Python");
		map.put(3, "PHP");
		map.put(4, "SQL");
		map.put(5, "C++");
		System.out.println("Tutorial in Guru99: " + map);
		
		// Remove value of key 5
		map.remove(5);
		System.out.println("Tutorial in Guru99 After Remove: " + map);

	}
	
//	// create and populate hash map
//			Hashmap<Integer, String> map = new Hashmap<>();
//			map.put(1, "Java");
//			map.put(2, "Python");
//			map.put(3, "PHP");
//			map.put(4, "SQL");
//			map.put(5, "C++");
//			System.out.println("Tutorial in Guru99: " + map);
//			
//			// Remove value of key 5
//			map.remove(5);
//			System.out.println("Tutorial in Guru99 After Remove: " + map);
//	}
}


