package typing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		Game game = new Game();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		while(true) {
			System.out.println("> " + game.randomWord());
			System.out.print("> ");
			while(true) {
				try {
					str = br.readLine();
					if (game.judge(str, game.word) == true) {
						break;
					} else {
						System.out.print("> ");
						continue;
					}
				} catch(IOException e) {
					System.out.println("入力値が不正です");
				}
			}
		}
	}
}