package j20210428;

public class Order {
	private Item item;
	private int qty;
	public void setItem(Item item) {
		this.item = item;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	// 小計
	public int getTotal() {
		return item.getPrice() * qty;
	}
}
