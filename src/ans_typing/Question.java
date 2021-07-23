package ans_typing;

// 出題を管理するクラス
public class Question {
	private String word;
	private int failCount = 0;
	private boolean clear;

	public Question(String word) {
		this.word = word;
	}

	public boolean test(String answer) {
		this.clear = word.equals(answer);
		if (this.clear == false) {
			failCount++;
		}
		return this.clear;
	}

	public String getWord() {
		return word;
	}

	public int getFailCount() {
		return failCount;
	}

	public boolean isClear() {
		return this.clear;
	}
}
