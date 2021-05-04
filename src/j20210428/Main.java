package j20210428;

public class Main {
	public static void main(String[] args) {
//		Stack stack = new Stack();
//		stack.push("A");
//		stack.push("B");
//		stack.push("C");
//
//		for (int i = 0; i < 3; i++) {
//			System.out.println(stack.pop());
//		}

		Item item = new Item();
		item.setName("apple");
		item.setPrice(100);

		Order order = new Order();
		order.setItem(item);
		order.setQty(3);

		int result = order.getTotal();
		System.out.println(result);
	}
}
