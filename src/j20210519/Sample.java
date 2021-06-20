package j20210519;

public class Sample {
	public static void main(String[] args) {
		// インスタンスを生成しない限りhoge()は使えない
		// もしくはhoge()がstaticメソッドだったら使える
//		Sample sample = new Sample();
//		sample.hoge();
//
//		// A.num = 10;
//		A.test();

		// リフレクション
		// Class clazz = A.class;
		// 宣言されているメソッドの定義情報の配列が取れる
//		Method[] methods = clazz.getDeclaredMethods();
//		for (Method m : methods) {
//			System.out.println(m.getName());
//		}

		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		a.setVal("Hello");
		System.out.println(b.getVal());
	}

//	public void hoge() {
//		System.out.println("hoge");
//	}
}
