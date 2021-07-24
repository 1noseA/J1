package j20210714;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

// デシリアライズ
public class Sample4 {
	public static void main(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("item.ser"));

		try (in) {
			Item item = (Item)in.readObject();
			System.out.println(item.getName());
		}
	}
}
