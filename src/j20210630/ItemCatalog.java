package j20210630;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItemCatalog implements Iterable<Item> {
	private List<Item> list = new ArrayList<>();

	public void add(Item item) {
		this.list.add(item);
	}

	@Override
	public Iterator<Item> iterator() {
		return this.list.iterator();
	}
}
