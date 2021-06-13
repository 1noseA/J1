package j20210512;

public class Item {
	private String name;
	private int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	// コンストラクタで値を設定するとそのあと設定できない（読み取り専用）
//	public void setName(String name) {
//		this.name = name;
//	}
	public int getPrice() {
		return price;
	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
}
