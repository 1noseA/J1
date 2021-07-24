package j20210714;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// シリアライズ
public class Sample3 {
	public static void main(String[] args) throws Exception {
		Item item = new Item("apple", 100);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("item.ser"));

		try (out) {
			out.writeObject(item);
			out.flush();
		}
	}
}
