package j20210804;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import j20210804.Item.ItemPriceComparator;

public class Sample {
	public static void main(String[] args) {
		List<Item> list = new ArrayList<>();
		list.add(new Item("apple", 200));
		list.add(new Item("orange", 120));
		list.add(new Item("banana", 100));

		Collections.sort(list, new ItemPriceComparator());

		for (Item item : list) {
			System.out.println(item);
		}
	}
}
