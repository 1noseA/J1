package ans_typing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 出題するクラス
public class Examination implements Iterator<Question> {
	private List<Question> questions = new ArrayList<>();
	// ここ例外をスローするのはうっとおしいのでコンストラクタの中でnewする
	// private Dictionary dic = new Dictionary();
	private Dictionary dic;
	private Question current;
	private int index = 0;

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

	@Override
	// 次に出題すべき問題を持っているかどうか確認
	public boolean hasNext() {
		if (this.questions.size() <= index) {
			return false;
		}
		if (this.current != null && this.current.isClear()) {
			index++;
			this.current = this.questions.get(index);
		}
		return true;
	}

	@Override
	public Question next() {
		if (this.current == null) {
			this.current = this.questions.get(index);
		}
		return current;
	}
}
