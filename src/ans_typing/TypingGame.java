package ans_typing;

public class TypingGame {
	public static void main(String[] args) {
		Examination ex = new Examination();
		for (Question q : ex) {
			System.out.println(q.getWord());
		}
	}
}
