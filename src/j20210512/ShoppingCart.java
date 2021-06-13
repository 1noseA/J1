package j20210512;

public class ShoppingCart {
	private Order[] orders;
	private int index;

	public ShoppingCart() {
		this.orders = new Order[10];
		this.index = 0;
	}

	public void add(Order order) {
		this.orders[index] = order;
		index++;
	}

	public int getTotal() {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total += orders[i].getTotal();
		}
		return total;
	}
}
