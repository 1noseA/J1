package silver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InputFile {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		try {
			File file = new File("data.txt");
			bw = new BufferedWriter(new FileWriter(file));
			bw.write("hello");
			bw.newLine();
			bw.write("bye");
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			System.out.println("例外が発生");
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					System.out.println("close失敗");
				}
			}
		}
	}
}
