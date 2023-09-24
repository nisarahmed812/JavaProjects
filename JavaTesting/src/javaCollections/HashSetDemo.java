package javaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// HashSet, TreeSet, LinkedHashSet
		// does not accept duplicate values
		// there is no gurantee that elements stored in sequential order..Random Order

		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");
		hs.add("He");
		hs.add("She");

		System.out.println("****************");
		System.out.println("hs");
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());

		System.out.println("****************");
		for (String value : hs) {
			System.out.println(value);
		}

		System.out.println("****************");
		Iterator<String> it = hs.iterator();
		System.out.println(it.next());
		System.out.println(it.next());

		// to print all at once
		System.out.println("****************");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
