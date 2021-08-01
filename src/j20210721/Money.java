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

	// コピーコンストラクタ
	public Money(Money old) {
		// これで中身だけコピーされた新しいインスタンスを作れる(amountがプリミティブで(final))
		this.amount = old.amount;
	}

	public int getAmount() {
		return amount;
	}
}
