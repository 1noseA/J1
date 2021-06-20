package j20210519;

public class Singleton {
	// このクラスの中でしかアクセスできない
	private static Singleton instance;
	private String val;

	// コンストラクタをprivateにしてしまう。外部からnewできない
	private Singleton() {}
	// staticであるのがポイント
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
}
