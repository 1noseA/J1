package j20210526;

// Aを拡張したBを公開する
public class B extends A {
//	public void bye() {
//		System.out.println("bye, B");
//	}

//	private int num;
//	public int getNum() {
//		return this.num;
//	}

//	public B() {
//		System.out.println("B");
//	}

//	public B(String val) {
//		super(val);
//		System.out.println("B");
//	}

	@Override
	public void hello() {
		System.out.println("Hello, B");
//		super.hello();
//		System.out.println("good bye B");
	}
}
