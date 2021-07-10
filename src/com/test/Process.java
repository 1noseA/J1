package com.test;

public interface Process {
	void execute(Task task);

	// if文を作らず実行するクラスをどんどんつなげていきながら
	// 自分が処理するものだったら処理する
	static Process getInstance() {
		AbstractChain a = new ProcessA();
		AbstractChain b = new ProcessB();
		AbstractChain c = new ProcessC();
		AbstractChain d = new ProcessD();

		// ここでa, b, cの3つのインスタンスが連結されている
		// かつ条件分岐（勝手にしてくれる）
		c.setNext(d);
		b.setNext(c);
		a.setNext(b);
		return a;
	}
}