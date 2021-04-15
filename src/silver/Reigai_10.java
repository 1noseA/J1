package silver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Reigai_10 {
	public static void main(String[] args) {
		// 従来の書き方
//		FileInputStream is = null;
//		try {
//			is = new FileInputStream("sample.txt");
//			throw new FileNotFoundException();
//		} catch (Exception e) {
//			System.out.println("A");
//		} finally {
//			if (is != null) {
//				try {
//					is.close();
//				} catch (IOException e) {
//					throw new RuntimeException();
//				}
//			}
//			System.out.println("B");
//		}

		try (FileInputStream is = new FileInputStream("sample.txt");) {
			throw new FileNotFoundException();
		} catch (Exception e) {
			System.out.println("A");
		} finally {
			// tryブロックで宣言した変数の有効範囲はtryブロックの中だけ。コンパイルエラー
//			if (is != null) {
//				is.close();
//			}
			System.out.println("B");
		}
	}
}
