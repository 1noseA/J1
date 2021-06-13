package copy_20210512;

public class Sample {
	public static void main(String[] args) {
		Item item1 = new Item("apple", 100);
		Item item2 = new Item("banana", 80);
		Item item3 = new Item("orange", 120);

		// 以下見た
		ShoppingCart cart = new ShoppingCart();
		cart.add(new Order(item1, 3));
		cart.add(new Order(item2, 5));
		cart.add(new Order(item3, 2));

		int result = cart.getTotal();
		System.out.println(result);
	}
}
