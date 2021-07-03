package j20210609;

public class Factory {
	// staticなのでインスタンス生成をしなくても使える、Aの参照を戻す
	// 戻り値型でポリモーフィズムを使う
	public static A create() {
		// return new B();
		// return new C();
		return new D();
	}
}
