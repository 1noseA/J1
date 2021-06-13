package work_20210512;

public class List {
	private String value;
	private int index;
	// 自分が自分に対するフィールドを持つ
	private List next;

	public List() {
		this.value = null;
		this.index = 0;
		this.next = null;
	}

	private List(int index) {
		// 引数なしの別のコンストラクタを呼べる
		this();
		this.index = index;
	}

	public void add(String value) {
		if (this.value == null) {
			this.value = value;
			return;
		}
		if (this.next == null) {
			this.next = new List(this.index + 1);
		}
		this.next.add(value);
	}

	public String get(int index) {
		if (this.index == index) {
			return this.value;
		}
		if (this.next == null) {
			return null;
		}
		return this.next.get(index);
	}

	// 何件入っているか
	public int size() {
		if (this.next == null) {
			return this.index + 1;
		}
		return this.next.size();
	}
}
