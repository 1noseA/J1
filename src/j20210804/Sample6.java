package j20210804;

import java.util.function.Supplier;

public class Sample6 {
	public static void main(String[] args) {
		Supplier<Hello> factory = () -> {
			return new HelloImpl();
		};
		test(factory);
	}

	private static void test(Supplier<Hello> factory) {
		Hello h = factory.get();
		h.hoge();
	}
}
