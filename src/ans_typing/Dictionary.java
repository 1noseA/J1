package ans_typing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Dictionary {
	private List<String> list = new ArrayList<>();

	public Dictionary() throws Exception {
		this.init();
	}

	// ファイルの内容を読み込む
	public void init() throws Exception {
		try (BufferedReader br = new BufferedReader(new FileReader("src/ans_typing/wordlist.txt"))) {
			String line = null;
			while((line = br.readLine()) != null) {
				list.add(line);
			}
		}
	}

	public void shuffle() {
		// これで乱数発生できる
		int r = Math.abs(new Random().nextInt(100));
		for (int i = 0; i < r; i++) {
			Collections.shuffle(list);
		}
	}

	public String get(int index) {
		if (index < 0 || this.list.size() <= index) {
			// throw new IllegalArgumentException("不正な数字です");
			return null;
		}
		return this.list.get(index);
	}

	public int size() {
		return this.list.size();
	}
}
