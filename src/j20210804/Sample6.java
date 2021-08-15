package j20210804;

import java.util.List;

public class Sample6 {
	public static void main(String[] args) {
		// factoryクラスと同じように使える
//		Supplier<Hello> factory = () -> {
//			return new HelloImpl();
//		};
//		test(factory);

		List<Item> list = List.of(
				new Item("apple", 100),
				new Item("orange", 120),
				new Item("banana", 200)
				);

		// 引数を受け取って条件に一致するかどうか判定する
//		Predicate<Item> p = (item) -> {
//			return item.getPrice() > 100;
//		};

		// 出力するときにフィルタリングできる
		// list.stream…一覧に並べて1つずつ送り出してくれる
		// 100より上だったらtrue下だったらfalse
		// trueのものだけがforEach内のprintlnメソッド実行される
//		list.stream()
//			.filter(p)
//			.forEach(System.out::println);

		// 以下を簡単に書いたもの
//		for (Item item : list) {
//			if (item.getPrice() > 100) {
//				System.out.println(item);
//			}
//		}

		// こんな書き方もできる
		list.stream()
		.filter((item) -> {
			return item.getPrice() > 100;
		})
		.forEach(System.out::println);
	}

//	private static void test(Supplier<Hello> factory) {
//		Hello h = factory.get();
//		h.hoge();
//	}
}
