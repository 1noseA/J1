package j20210602;

// トラブルを起こすクラス
//public class A {
//	public void hello(String val) {
//		if (val == null) {
//			// 変数に入れる必要性はない
//			// SampleException e = new SampleException();
//			// throw e;
//			throw new SampleException("val is null");
//		}
//	}
//}
// 検査例外にすると上記だとエラーになってしまう
// throws SampleExceptionを入れる
//public class A {
//	public void hello(String val) throws SampleException {
//		if (val == null) {
//			// 変数に入れる必要性はない
//			// SampleException e = new SampleException();
//			// throw e;
//			throw new SampleException("val is null");
//		}
//	}
//}
// 例外の伝搬
//public class A {
//	public void hello() throws SampleException {
//		B b = new B();
//		b.hello();
//	}
//}
// 例外の変換
public class A {
	public void hello() throws TestException {
		B b = new B();
		try {
			b.hello();
		} catch (SampleException e) {
			throw new TestException();
		}
	}
}
