package j20210707;

import java.util.HashMap;
import java.util.Map;
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

//		Set<Item> set = new HashSet<>();
//		set.add(new Item("apple", 100));
//		set.add(new Item("banana", 80));
//		set.add(new Item("orange", 120));
//
//		System.out.println(set.size());

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		// 上書きされる
		map.put(1, "hello");
		// valueは一意でなくてよい（"one"はコンスタントプールで同じリンクへの参照になる）
		map.put(4, "one");
		// nullも使える
		map.put(null, null);

		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(map.get(key));
		}

		// 補足
		Item apple = new Item("apple", 100);
		Item orange = new Item("orange", 120);
		Item banana = new Item("banana", 80);

		Map<String, Item> itemMap = new HashMap<>();
		itemMap.put(apple.getName(), apple);
		itemMap.put(orange.getName(), orange);
		itemMap.put(banana.getName(), banana);

		Set<String> keys2 = itemMap.keySet();
		// どのクラスが動いているのか調べる
		System.out.println(keys2.getClass().getName());

		Set<Map.Entry<String, Item>> set = itemMap.entrySet();
		for (Map.Entry<String, Item> entry : set) {
			System.out.println(entry.getKey());
			System.out.print(":");
			System.out.println(entry.getValue());
		}
	}
}
