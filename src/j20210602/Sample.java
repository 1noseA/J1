package j20210602;

public class Sample {
	public static void main(String[] args) {
		// インスタンスは異なるが同じもの（同値）
		Item a = new Item("apple", 100);
		// Item b = new Item("apple", 100); -> true
		// Item b = new Item("banana", 100); -> false
		Item b = new Item("apple", 120);

		System.out.println(a == b);
		System.out.println(a.equals(b));

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

		// 引数をいくつでも渡せる（配列に置き換わる）
//		test(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		// ->
		test(new int[] {1, 2, 3, 4, 5});
		// 上記は無名配列。この省略系
		// int[] array = {1, 2, 3, 4, 5};
		// test(array[]);
	}

	// 可変長引数
//	public static void test(int[] array) {
//		for (int n : array) {
//			System.out.println(n);
//		}
//	}
	public static void test(int... array) {
		for (int n : array) {
			System.out.println(n);
		}
	}
}
