package typing;

import java.util.ArrayList;
import java.util.List;

public class Word {
	String word = "";

//	public String randomWord() {
//		List<String> list = new ArrayList();
//		list.add("java");
//		list.add("hoge");
//		list.add("foo");
//		int num = (int)(Math.random() * list.size());
//		return list.get(num);
//	}

	public void randomWord() {
		List<String> list = new ArrayList();
		list.add("java");
		list.add("hoge");
		list.add("foo");
		int num = (int)(Math.random() * list.size());
		this.word = list.get(num);
	}

//	public String getWord() {
//		return word;
//	}
//
//	public void setWord(String word) {
//		this.word = word;
//	}
}
