package j20210602;

public class Sample3 {
	public static void main(String[] args) {
		// RuntimeExceptionクラスを継承しているので、try-catchなくてもエラーにならない
//		try {
//			A a = new A();
//			a.hello(null);
//		} catch (SampleException e) {
//			System.out.println(e.getMessage());
//		}

		// 例外処理の伝搬
//		A a = new A();
//		try {
//			a.hello();
//		} catch (SampleException e) {
//			System.out.println("復帰処理");
//		}
		// 例外の変換
		A a = new A();
		try {
			a.hello();
		} catch (TestException e) {
			System.out.println("復帰処理");
		}
	}
}
