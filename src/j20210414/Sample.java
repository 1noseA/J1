package j20210414;

public class Sample {
	public static int test(int num) {
		num = num * 2;
		return num;
	}

	public static void main(String[] args) {
//		int num = 100;
//		int result = test(num);
//		System.out.println(num);
//		System.out.println(result);

		String str = "100";
		int result = Integer.parseInt(str);
		System.out.println(result);
		System.out.println(result * 2);
	}

//	public static void main(String[] args) {
//		System.out.println("main");
//		test();
//		System.out.println("main");
//	}
//
//	public static void test() {
//		System.out.println("test");
//		hoge();
//		System.out.println("test");
//	}
//
//	public static void hoge() {
//		System.out.println("hoge");
//	}

//	public static void main(String[] args) {
//		int i = 1;
//		switch(i) {
//			case 1: System.out.println("one");
//					break;
//			case 2: System.out.println("two");
//					break;
//			case 3: System.out.println("three");
//					break;
//			default : System.out.println("other");
//		}

//		for (int i = 1; i < 10; i += 2) {
//			System.out.println(i);
//		}

//		for (int i = 0; i < 3; i++) {
//			// 以下3行はSystem.out.print("***");と同じ
//			for (int j = 0; j < 3; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		while (true) {
//			System.out.println("hello.");
//		}

//		int i = 5;
//		do {
//			System.out.println("hello.");
//		} while(i < 5);

		// 3で無限ループになる
//		int i = 0;
//		while (true) {
//			if (i == 3) {
//				continue;
//			}
//			System.out.println(i);
//			i++;
//			if (i > 5) {
//				break;
//			}
//		}

//		int i = 0;
//		while (true) {
//			i++;
//			if (i == 3) {
//				continue;
//			}
//			System.out.println(i);
//			if (i > 5) {
//				break;
//			}
//		}

//		int[] array = new int[3];
//		array[0] = 10;
//		array[1] = 20;
//		array[2] = 30;

//		int[] array = {10, 20, 30, 40};
//		array[0] = 20;

//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}

//		for (int num : array) {
//			System.out.println(num);
//		}
//	}
}
