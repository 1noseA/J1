package copy_20210512;

public class Order {
	private Item item;
	private int qty;


	public Order(Item item, int qty) {
		this.item = item;
		this.qty = qty;
	}

	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getTotal() {
		int result = item.getPrice() * qty;
		return result;
	}
}
