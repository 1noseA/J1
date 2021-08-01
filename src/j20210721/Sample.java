package j20210721;

import java.util.Date;

import j20210721.Receipt.ReceiptBuilder;

public class Sample {
	public static void main(String[] args) {
		MonthlyStatements stmt = YearStatements.create();

		while(true) {
			ReceiptBuilder  builder = new ReceiptBuilder();
			// メソッドチェイン
			// 何に何を入れたのかコンストラクタの引数だと分かりづらい
			Receipt receipt = builder
								.setDate(new Date())
								.setName("apple")
								.setPrice(new Money(100))
								.setCategory("fruits")
								.build();

			stmt.add(receipt);
			// 抜ける条件を入れる（exitと入力したらなど）
		}
		// System.out.println(stmt.getTotal());
	}
}
