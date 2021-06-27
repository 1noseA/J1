package j20210602;

// 例外クラスと分かるようにExceptionとつける
//public class SampleException extends RuntimeException {
//// ここまででOK
//
//	// やることがあるとしたらコンストラクタ
//	// Throwableのコンストラクタ、エラーを受け取るというのを持っている
//	// それを使うとエラーメッセージを書ける（報告書の中身を書ける）
//
//	public SampleException(String message) {
//		super(message);
//	}
//	// 引数なしのも作ってもいいかも
//	public SampleException() {}
//}
public class SampleException extends Exception {
	public SampleException(String message) {
		super(message);
	}
	// 引数なしのも作ってもいいかも
	public SampleException() {}
}