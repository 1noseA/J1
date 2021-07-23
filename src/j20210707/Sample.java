package j20210707;

import java.util.HashSet;
import java.util.Set;

public class Sample {
	public static void main(String[] args) {
//		Set<String> set = new HashSet<>();
//		set.add("A");
//		set.add("B");
//		set.add("C");
//		set.add("A");
//		for (String  str : set) {
//			System.out.println(str);
//		}

		Set<Item> set = new HashSet<>();
		set.add(new Item("apple", 100));
		set.add(new Item("banana", 80));
		set.add(new Item("orange", 120));

		System.out.println(set.size());
	}
}
