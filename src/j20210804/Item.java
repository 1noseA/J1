package j20210804;

import java.util.Comparator;

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

	// クラスが乱立しないようにまとめる（結局Itemしか使わない）
	// compareは比較しか使わないので他のクラスでは使わない
	public static class ItemPriceComparator implements Comparator<Item> {

		// priceで比較したい場合
		@Override
		public int compare(Item a, Item b) {
			if (a.getPrice() < b.getPrice()) {
				return -1;
			}
			if (b.getPrice() < a.getPrice()) {
				return 1;
			}
			return 0;
		}
	}

	public static class ItemNameComparator implements Comparator<Item> {
		// nameで比較したい場合
		@Override
		public int compare(Item a, Item b) {
			return a.name.compareTo(b.name);
		}
	}
}
