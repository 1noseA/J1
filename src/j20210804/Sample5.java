package j20210804;

import java.util.function.Function;

public class Sample5 {
	public static void main(String[] args) {
		Function<String, String> f = String::toUpperCase;
		// test(f);
		// 上記のように書いてもいいし、メソッド参照で書いてもよい
		// ポリモーフィズムのようにどんな処理をするかわからないメソッドの定義を受け取ってそれを実行できる
		test(String::toUpperCase);
	}

	private static void test(Function<String, String> f) {
		String result = f.apply("hello");
		System.out.println(result);
	}
}
