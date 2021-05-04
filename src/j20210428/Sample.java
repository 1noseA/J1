package j20210428;

public class Sample {
	public static void main(String[] args) {
		Item item = new Item();
		// フィールドに直接にアクセスしている
//		item.name = "apple";
//		item.price = 100;

		item.setName("apple");
		item.setPrice(100);

		System.out.println(item.getName());
	}
}
