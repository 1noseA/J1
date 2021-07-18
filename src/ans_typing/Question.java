package ans_typing;

// 出題を管理するクラス
public class Question {
	private String word;
	private int failCount = 0;

	public Question(String word) {
		this.word = word;
	}

	public boolean test(String answer) {
		boolean result = word.equals(answer);
		if (result == false) {
			failCount++;
		}
		return result;
	}

	public String getWord() {
		return word;
	}

	public int getFailCount() {
		return failCount;
	}
}
