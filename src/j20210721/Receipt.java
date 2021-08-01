package j20210721;

import java.util.Date;

public class Receipt {
	// いつ何を使ったか
	private Date date;
	private String name;
	private Money price;
	// 引数3つから4つに変わるとコンストラクタを使っていたクラスが全部影響受ける
	private String category;

	private Receipt() {}

	// コンストラクタ使わない（3つだからコンストラクタでもいいけどBuilderパターンを使う）
//	public Receipt(Date date, String name, Money price) {
//		super();
//		this.date = date;
//		this.name = name;
//		this.price = price;
//	}

	// インナークラス
	public static class ReceiptBuilder {
		private Date date;
		private String name;
		private Money price;
		private String category;

		// setterの戻り値型をvoidじゃなくてReciptBuilder（自分への参照）にする
		public ReceiptBuilder setDate(Date date) {
			this.date = date;
			return this;
		}
		public ReceiptBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public ReceiptBuilder setPrice(Money price) {
			this.price = price;
			return this;
		}

		public ReceiptBuilder setCategory(String category) {
			this.category = category;
			return this;
		}

		// インナークラスはprivateなものにアクセスできる(Receiptクラスのフィールド)
		// こうするとReceiptのコンストラクタはprivateにできる
		public Receipt build() {
			// builderパターンだったらこういう処理を入れることもできる
			if (date == null) {
				throw new IllegalStateException();
			}
			Receipt instance = new Receipt();
			instance.date = this.date;
			instance.name = this.name;
			instance.price = this.price;
			instance.category = this.category;
			return instance;
		}
	}
}
