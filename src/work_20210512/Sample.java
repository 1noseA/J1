package work_20210512;

public class Sample {
	public static void main(String[] args) {
		List list = new List();
		list.add("A");
		list.add("B");
		list.add("C");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
