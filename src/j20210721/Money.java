package j20210721;

public final class Money {
	private final int amount;

	public Money(int amount) {
		super();
		if (amount < 0) {
			throw new IllegalArgumentException();
		}
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}
}
