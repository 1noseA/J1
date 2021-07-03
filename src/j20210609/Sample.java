package j20210609;

public class Sample {
//	public static void main(String[] args) {
//		A a = new B();
//		a.hello();
//		// Aにできないことはできない（以下はコンパイルエラー）
//		// a.test();
//	}
	public static void main(String[] args) {
		// Bと出るがこのmainメソッド内では一切Bが出てこない
		A a = Factory.create();
		a.hello();
	}
}
