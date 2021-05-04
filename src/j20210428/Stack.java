package j20210428;

public class Stack {
	private String[] array = new String[10];
	private int index = 0;

	public void push(String val) {
		array[index] = val;
		index++;
	}

	public String pop() {
		// popメソッドを完成させる。入れた順と逆に出す
		// return "";

		// return array[--index];
		index--;
		return array[index];
	}
}
