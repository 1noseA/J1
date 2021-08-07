package j20210804;

import java.util.ArrayList;
import java.util.List;

public class Sample2 {
	public static void main(String[] args) {
		// ローカルクラス
//		class Test {
//			private String value;
//		}
//
//		Test t = new Test();
//		t.value = "hoge";

		// 無名クラス
//		List<String> list = new List() {
//
//		};

//		List<String> list = new ArrayList() {
//			@Override
//			public boolean add(Object e) {
//				System.out.println("hello");
//				return super.add(e);
//			}
//		};
//		// addするとコンソールには「hello」と出る
//		list.add("hoge");

		// ちなみにクラス名を調べると
		// System.out.println(list.getClass().getName());

		List<String> list = new ArrayList() {
			// 初期化ブロック
			{
				super.add("A");
				super.add("B");
				super.add("C");
			}
		};

		// メソッドの引数を書ける
		test(new ArrayList() {
			{
				super.add("A");
				super.add("B");
				super.add("C");
			}
		});
	}

	public static void test(List list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
