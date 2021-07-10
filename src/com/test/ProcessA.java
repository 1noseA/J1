package com.test;

final class ProcessA extends AbstractChain {

	public ProcessA() {
		super(Type.A);
	}

	@Override
	protected void peform(Task task) {
		System.out.println("A:" + task.getValue());
	}
}
