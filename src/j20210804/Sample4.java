package j20210804;

import java.util.List;

public class Sample4 {
	public static void main(String[] args) {

		List<String> list = List.of(
				"A", "B", "C"
				);
		// <>内にデータ型が書いてあるので、()内のデータ型は省略できる
		// 定義しているのであって実行していない
//		Consumer<String> c = (str) -> {
//			System.out.println(str);
//		};

		// メソッド参照
		// Consumer<String> c = Sample4::test;

		// さらに
		// Consumer<String> c = System.out::println;

		// 実行(遅延実行という)
		// c.accept("hoge");

		// ラムダ式と同時に導入された便利なメソッド(繰り返し文)
		// list.forEach(c);

		// 直接メソッドを渡せる
		list.forEach(System.out::println);
	}

	private static void test(String str) {
		System.out.println(str);
	}
}
