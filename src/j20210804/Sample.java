package j20210804;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample {
//	private String name;
//
//	public static void main(String[] args) {
//		// アウタークラスのインスタンスを生成しないとインナークラスを使えない(staticがない場合)
//		// new Sample().new Inner();
//		new Inner().value = "hoge";
//	}
//
//	// インナークラス
//	private static class Inner {
//		private String value;
//	}

	public static void main(String[] args) {
		// ofメソッド…変更不可能なlist
		// 3つの参照を持ったリストが作られる
//		List<Item> list = List.of(
//					new Item("apple", 80),
//					new Item("orange", 120),
//					new Item("banana", 100)
//				);

		List<Item> list = new ArrayList<>();
		list.add(new Item("apple", 200));
		list.add(new Item("orange", 120));
		list.add(new Item("banana", 100));

		// Collections.sort(list);
		Collections.sort(list, new ItemPriceComparator());

		for (Item item : list) {
			System.out.println(item);
		}
	}
}
