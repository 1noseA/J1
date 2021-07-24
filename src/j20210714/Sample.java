package j20210714;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Sample {
	public static void main(String[] args) throws IOException {
		// カレントディレクトリにあるsample.txtというファイル
		// eclipseの場合、カレントディレクトリはプロジェクト
//		File file = new File("sample.txt");
//		// ファイルが存在しているか（ファイルのインスタンスを生成しても実物のファイルがあるわけではない）
//		System.out.println(file.exists());
//		// 絶対パスを取得できる
//		System.out.println(file.getAbsolutePath());

//		// ファイルが存在していなければファイルを生成する
//		if (file.exists() == false) {
//			file.createNewFile();
//			System.out.println("ファイルを生成しました");
//		} else {
//			file.delete();
//			System.out.println("ファイルを削除しました");
//		}
//
//		// ディレクトリを生成
//		File dir = new File("dir");
//		if (dir.exists()) {
//			dir.delete();
//		} else {
//			dir.mkdir();
//		}

		// "."はカレントディレクトリ
		File dir = new File(".");
		// System.out.println(dir.getAbsolutePath());
		// ディレクトリの中のファイル一覧を調べたい
		// listFiles()はファイルの配列を返す
//		File[] files = dir.listFiles();
//		for (File file : files) {
//			System.out.println(file.getName());
//		}
		// ディレクトリだったらさらに中身を見たい
//		// 以下だとパッケージまでしか出ないけどいいのかな(私の回答)
//		for (File file : files) {
//			// ディレクトリであるかを判定
//			if (file.isDirectory() == true) {
//				File[] files2 = file.listFiles();
//				for (File f : files2) {
//					System.out.println(f.getName());
//				}
//			} else {
//				System.out.println(file.getName());
//			}
//		}

		// 回答例
		printAll(dir, "");
	}

	private static void printAll(File dir, String indent) {
		File[] files = dir.listFiles(new JavaFileFilter());
		for (File file : files) {
			System.out.println(indent + file.getName());
			if (file.isDirectory()) {
				printAll(file, indent + " ");
			}
		}
	}

	// インナークラス
	private static class JavaFileFilter implements FileFilter {
		@Override
		public boolean accept(File file) {
			if (file.isDirectory()) {
				return true;
			}
			// 拡張子が".java"のものだけ絞られる
			if (file.getName().endsWith(".java")) {
				return true;
			}
			return false;
		}
	}
}
