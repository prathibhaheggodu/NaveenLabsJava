package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// inserting values
		hm.put(1, "Prati1");
		hm.put(2, "Prati2");
		hm.put(3, "Prati3");
		hm.put(4, "Prati4");

		// get value of specific key
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		// remove and print
		hm.remove(4);
		System.out.println(hm.get(4));

		// get value using enhanced for loop

		for (Entry<Integer, String> m : hm.entrySet())

		{
			System.out.println(m.getKey() + " " + m.getValue());
		}

		hm.remove(3);
		System.out.println(hm);

		// traversing the user defined values using hashmap

		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

		Employee e1 = new Employee("Heggodu1", 30, "SDET1");
		Employee e2 = new Employee("Heggodu2", 32, "SDET2");
		Employee e3 = new Employee("Heggodu3", 34, "SDET3");

		// insert value Using HashMap

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		// TRAVERISNG VALUES USING HASHMAP
		
		System.out.println("Employee information");
		for (Entry<Integer, Employee> e11 : emp.entrySet()) {
			int key = e11.getKey();
			Employee data = e11.getValue();
			System.out.println(key + " " + data.name + " " + data.age + " " + data.dept);
		}

	}
}