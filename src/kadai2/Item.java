package kadai2;

public class Item {
	int price;
	String name;

	public void setPrice(int price) {
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void printItemInfo() {
		System.out.println(name + "の価格は、" + price + "円です");
	}
}
