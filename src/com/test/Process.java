package com.test;

public interface Process {
	void execute(Task task);

	static Process getInstance() {
		AbstractChain a = new ProcessA();
		AbstractChain b = new ProcessB();
		AbstractChain c = new ProcessC();

		// ここでa, b, cの3つのインスタンスが連結されている
		// かつ条件分岐（勝手にしてくれる）
		b.setNext(c);
		a.setNext(b);
		return a;
	}
}