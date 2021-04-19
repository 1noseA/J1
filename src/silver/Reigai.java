package silver;

public class Reigai {
	public static void main(String[] args) {
		int i = 10;
		try {
			System.out.println("test");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException発生");
			System.out.println(e.toString());
		}
	}
}
