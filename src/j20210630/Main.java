package j20210630;

public class Main {
	public static void main(String[] args) {
		ItemCatalog catalog = new ItemCatalog();
		catalog.add(new Item("apple", 100));
		catalog.add(new Item("banana", 80));
		catalog.add(new Item("orange", 120));

//		Iterator<Item> ite = catalog.iterator();
//		while(ite.hasNext()) {
//			Item item = ite.next();
//			System.out.println(item.getName());
//		}

		for (Item item : catalog) {
			System.out.println(item.getName());
		}
	}
}
