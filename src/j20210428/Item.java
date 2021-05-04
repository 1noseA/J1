package j20210428;

public class Item {
	private String name;
	private int price;

	// アクセサメソッド（フィールドをアクセスするためのメソッド）
	public String getName() {
		// nameフィールドのコピーを返す
		return name;
	}
	public void setName(String name) {
		// nameの値を受け取って自分のフィールドにセットする
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
