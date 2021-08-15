package j20210804;

import java.util.List;
import java.util.function.Consumer;

public class Sample4 {
	public static void main(String[] args) {

		List<String> list = List.of(
				"A", "B", "C"
				);
		// <>内にデータ型が書いてあるので、()内のデータ型は省略できる
		// 定義しているのであって実行していない
		Consumer<String> c = (str) -> {
			System.out.println(str);
		};

		// 実行(遅延実行という)
		// c.accept("hoge");

		// ラムダ式と同時に導入された便利なメソッド(繰り返し文)
		list.forEach(c);
	}
}
