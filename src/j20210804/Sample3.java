package j20210804;

public class Sample3 {
	public static void main(String[] args) {
//		Test t = new Test() {
//			@Override
//			public void execute() {
//				System.out.println("hello");
//			}
//		};
		// 上記をもっと簡単に書いたらいいのではないか
		// Testインタフェースにはexecuteメソッド1つしかないため
//		Test t = () -> {
//			System.out.println("hello");
//		};

		// やることひとつしかないなら{}も省略できる
		Test t = () -> System.out.println("hello");

		t.execute();
	}
}
