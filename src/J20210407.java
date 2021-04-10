
public class J20210407 {
	public static void main(String[] args) {
//		int a = 10;
//		int b = a++ + ++a;
//		System.out.println(a);
//		System.out.println(b);

//		String str = "Hello";
//		String str2 = "Java";
////		String str3 = str + " " + str2;
//		String str3 = str + 100 + 100;
//		System.out.println(str3);

//		int a = 10;
//		long b = 100000000000000000L;
//		int c = (int)b;
//		System.out.println(c);

//		int num = (int) (100 * 1.1);
//		double num2 = 100 * 1.1;
//		System.out.println(num);
//		System.out.println(num2);

//		int a = 10;
//		int b = 20;
//		System.out.println(a < b);

//		if (a == b) {
//			System.out.println("等しい");
//		} else {
//			System.out.println("等しくない");
//		}

		int score = 80;
		if (score < 0 || score > 100) {
			System.out.println("不正な点数");
		}
		if (score <= 40) {
			System.out.println("落第");
		} else if (score < 60) {
			System.out.println("C");
		} else if (score < 80) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
	}
}
