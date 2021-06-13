package j20210512;

public class Sample {
	public static void main(String[] args) {
//		Item apple = new Item();
//		apple.setName("apple");
//		apple.setPrice(100);
//
//		Order order = new Order();
//		order.setItem(apple);
//		order.setQty(3);

		Item apple = new Item("apple", 100);
		Item banana = new Item("banana", 80);
		Item orange = new Item("orange", 120);

//		Order order = new Order(apple, 3);

		ShoppingCart cart = new ShoppingCart();
		// 以下はこのコードの省略形。変数orderは後で使っていないから
//		Order order = new Order(apple, 3);
//		cart.add(order);
		cart.add(new Order(apple, 3));
		cart.add(new Order(banana, 5));
		cart.add(new Order(orange, 2));

//		int result = order.getTotal();
		int result = cart.getTotal();
		System.out.println(result);
	}
}
