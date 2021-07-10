package com.test;

// 新しいクラスを追加しても同じ作りになる
public class ProcessD extends AbstractChain {

	public ProcessD() {
		super(Type.D);
	}

	@Override
	protected void peform(Task task) {
		System.out.println("D:" + task.getValue());
	}
}
