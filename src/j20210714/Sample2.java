package j20210714;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Sample2 {
	public static void main(String[] args) throws Exception {
//		FileReader in = new FileReader("sample.txt");
//		BufferedReader br = new BufferedReader(in);

//		int i = 0;
//		// FileReaderはファイルの末端までいくと-1を返すため
//		// readメソッドは一文字ずつ返す(文字番号に相当するintで返る)
//		while((i = in.read()) != -1) {
//			// char型にキャストすることで文字として扱える
//			char c = (char) i;
//			System.out.print(c);
//		}

//		String line = null;
//		// BufferedReaderは一行ずつ読み込むので末端までくるとnullが返る
//		while((line = br.readLine()) != null) {
//			System.out.println(line);
//		}
//		// 使い終わったらcloseを忘れない
//		in.close();

//		// バイトデータを扱う
//		InputStream is = System.in;
//		// キーボード入力をテキスト情報に変換する
//		InputStreamReader isr = new InputStreamReader(is);
//		// 上の情報を効率的に読み込む
//		BufferedReader br = new BufferedReader(isr);

		// 上記を1行にしたもの（よく使われる）
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// FileWriter fw = new FileWriter("sample.txt");
		// 下記のようにすると上書きではなく追記になる
		FileWriter fw = new FileWriter("sample.txt", true);
		BufferedWriter out = new BufferedWriter(fw);

		// try-with-resources(自動でクローズしてくれる)
		try (br; out) {
			String line = null;
			while((line = br.readLine()).contentEquals("exit") == false) {
				// System.out.println(line);
				// 書き出し
				out.write(line);
				// 改行が入る
				out.newLine();
			}
			// バッファーに溜まったものを流す
			out.flush();
		}
		// br.close();
	}
}
