package j20210512;

public class Order {
	private Item item;
	private int qty;

	public Order(Item item, int qty) {
		this.item = item;
		this.qty = qty;
	}

//	public void setItem(Item item) {
//		this.item = item;
//	}
//	public void setQty(int qty) {
//		this.qty = qty;
//	}

	public Item getItem() {
		return new Item(this.item.getName(), this.item.getPrice());
	}

	public int getTotal() {
		// このthisはなくてもいい。
		// 他人が見て誤解しにくいようにフィールドにアクセスしたいと明示
		return this.item.getPrice() * qty;
	}

	public Order setItem(Item item) {
		return new Order(item, this.qty);
	}
	public Order setQty(int qty) {
		return new Order(this.item, qty);
	}
}
