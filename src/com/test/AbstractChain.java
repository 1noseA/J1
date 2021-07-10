package com.test;

import java.awt.IllegalComponentStateException;

abstract class AbstractChain implements Process {
	private Type type;
	private Process next;

	public AbstractChain(Type type) {
		super();
		this.type = type;
	}

	@Override
	public void execute(Task task) {
		// 自分が処理すべき対象であるのかどうか
		// 処理すべきだったら自分のpeformメソッドを呼び出す
		if (task.getType() == this.type) {
			peform(task);
			return;
		}
		if (this.next == null) {
			// return;でもOK
			throw new IllegalComponentStateException();
		}
		// 対象がなく次があるのであれば呼び出す
		this.next.execute(task);
	}

	protected abstract void peform(Task task);

	public void setNext(AbstractChain next) {
		this.next = next;
	}
}
