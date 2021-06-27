package j20210602;

public class B {
	public void hello() throws SampleException {
		C c = new C();
//		try {
//			c.hello();
//		} catch (SampleException e) {
//			// Aクラスに報告を投げるにはcatch内でthrowする
//			throw e;
//		}
		// しかしcatchブロックの意味がないので上記はやめる
		// 無理やりキャッチしなくていい。これで呼び出し元にスローする
		c.hello();
	}
}
