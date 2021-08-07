package j20210804;

import java.util.ArrayList;
import java.util.List;

public class Sample2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList() {
			@Override
			public boolean add(Object e) {
				System.out.println("hello");
				return super.add(e);
			}
		};
	}
}
