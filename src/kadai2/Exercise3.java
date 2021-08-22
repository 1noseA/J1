package kadai2;

public class Exercise3 {
	public static void main(String[] args) {
		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();

		item1.setName("消しゴム");
		item1.setPrice(100);
		item2.setName("鉛筆");
		item2.setPrice(50);
		item3.setName("ラインマーカー");
		item3.setPrice(80);

		item1.printItemInfo();
		item2.printItemInfo();
		item3.printItemInfo();

		int result = item1.getPrice() + item2.getPrice() + item3.getPrice();
		System.out.println("合計価格は、" + result + "円です");
	}
}
