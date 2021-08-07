package j20210804;

// public class Item implements Comparable<Item> {
public class Item {
	private String name;
	private int price;

	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}

	// 名前順に並び替えてくれる
//	@Override
//	public int compareTo(Item o) {
//		return this.name.compareTo(o.name);
//	}

	// price順に並び替える
//	@Override
//	public int compareTo(Item o) {
//		if (this.price < o.price) {
//			// 自分の方が前だったら負の値を
//			return -1;
//		}
//		if (o.price < this.price) {
//			// 自分の方が負の値だったら正の値を
//			return 1;
//		}
//		// 一緒だったら0
//		return 0;
//	}
}
