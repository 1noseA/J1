package ans_typing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 出題するクラス
public class Examination implements Iterable<Question> {
	private List<Question> questions = new ArrayList<>();
	// ここ例外をスローするのはうっとおしいのでコンストラクタの中でnewする
	// private Dictionary dic = new Dictionary();
	private Dictionary dic;

	public Examination() {
		this(20);
	}

	public Examination(int size) {
		try {
			if (dic == null) {
				dic = new Dictionary();
			}
			dic.shuffle();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		for (int i = 0; i < size - 1; i++) {
			String word = dic.get(i);
			if (word == null) {
				break;
			}
			this.questions.add(new Question(word));
		}
	}

	// これで拡張for文で扱えるようになった
	@Override
	public Iterator<Question> iterator() {
		return this.questions.iterator();
	}
}
