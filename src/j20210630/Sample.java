package j20210630;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
//		Integer a = Integer.valueOf(10);
//		Integer b = Integer.valueOf(10);
//
//		System.out.println(a == b);

//		Integer a = 10;
//		int b = a;

		List<Integer> list = new ArrayList();
		// <Integer>を入れると異なる型はコンパイルエラーになる
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		list.add("D");
//		list.add("E");
		list.add(10);
		list.add(20);

//		list.remove(2);

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		printAll(list);

		Test<String> a = new Test<String>("hello");
		Test<Integer> b = new Test<Integer>(10);

		String str = a.getValue();
		int i = b.getValue();
	}

	private static void printAll(List<Integer> list) {
		// 拡張for文
//		for (Object obj : list) {
//			Integer i = (Integer) obj;
//			System.out.println(i);
//		}

		// 汎用リモコン取り出せる
		Iterator<Integer> ite = list.iterator();
		// 取り出すべき要素があるかどうか確認
		while(ite.hasNext()) {
			// あったら取り出す
			int i = ite.next();
			System.out.println(i);
		}
	}
}
