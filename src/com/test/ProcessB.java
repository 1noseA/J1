package com.test;

final class ProcessB extends AbstractChain {
	public ProcessB() {
		super(Type.B);
	}

	@Override
	protected void peform(Task task) {
		System.out.println("B:" + task.getValue());
	}
}
