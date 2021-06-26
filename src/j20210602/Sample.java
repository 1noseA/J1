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
	}
}
