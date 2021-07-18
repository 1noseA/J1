package typing;

import java.util.ArrayList;
import java.util.List;

public class Game {
	String str;
	String word;

	public String randomWord() {
		List<String> list = new ArrayList();
		list.add("java");
		list.add("hoge");
		list.add("foo");
		int num = (int)(Math.random() * list.size());
		this.word = list.get(num);
		return this.word;
	}

	public boolean judge(String str, String word) {
		if (str.equals(word)) {
			return true;
		} else {
			return false;
		}
	}
}
