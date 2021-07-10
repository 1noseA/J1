package com.test;

final class ProcessC extends AbstractChain {
	public ProcessC() {
		super(Type.C);
	}
	@Override
	protected void peform(Task task) {
		System.out.println(("C:" + task.getValue()));
	}
}
