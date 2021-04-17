package silver;

import java.util.List;

public class API_18 {
	public static void main(String[] args) {
		List<String> list = List.of("A", "B", "C");
//		Consumer<String> logic = new Consumer<String>() {
//			@Override
//			public void accept(String str) {
//				System.out.println(str);
//			}
//		};

		// ラムダ式で置き換え
//		Consumer<String> logic = (str) -> System.out.println(str);
//		list.forEach(logic);

		// さらに簡略化
		list.forEach((str) -> System.out.println(str));
	}
}
