package com.test;

public class Task {
	private Type type;
	private String value;

	public Task(Type type, String value) {
		super();
		this.type = type;
		this.value = value;
	}

	public Type getType() {
		return type;
	}

	public String getValue() {
		return value;
	}
}
