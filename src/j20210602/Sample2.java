package j20210602;

public class Sample2 {
	public static void main(String[] args) {
		try {
//			int[] array = {1, 2, 3};
			int[] array = null;
			// 配列の要素外アクセス
			array[3] = 10;
			// 例外の後のコードは実行されない
			System.out.println("hoge");
			// 複数書けるし、パイプでつなげることもできる（マルチキャッチ）
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
		} catch (NullPointerException e) {
			System.out.println("error");
		} finally {
			// 最後に実行してほしい
			System.out.println("finally");
		}
		System.out.println("finish");
	}
}
