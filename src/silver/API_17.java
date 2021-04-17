package silver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class API_17 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(
				Arrays.asList(new String[] {"A", "B", "C"})
		);
		// trueだったら削除
		list.removeIf(
				(String s) -> {
					return s.equals("B");
				}
		);
		System.out.println(list);
	}
}
