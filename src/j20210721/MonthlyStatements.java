package j20210721;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

// 月次表
public class MonthlyStatements {
	private Date start;
	private Date end;
	private List<Receipt> list = new ArrayList<>();

	private MonthlyStatements next;

	public MonthlyStatements(Date start) {
		Calendar cal = Calendar.getInstance();
		// これでstartの日付のカレンダーが取れる
		cal.setTime(start);
		// 不正な値がセットされる可能性があるので強制的に1をセット
		cal.set(Calendar.DATE, 1);
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		this.start = cal.getTime();

		// このフィールド（月）の最大値が取れる
		int max = cal.getActualMaximum(Calendar.DATE);
		// maxを代入して月末の日付になった
		cal.set(Calendar.DATE, max);
		this.end = cal.getTime();
	}

	public MonthlyStatements setNext(MonthlyStatements next) {
		this.next = next;
		return this;
	}

	// 自分自身が担当すべきかどうか
	public void add(Receipt receipt) {
		// 日付を取り出してその結果がどうか
		Date target = receipt.getDate();
		if ((target.before(start) || target.after(end)) == false) {
			// 再帰関連でChain of Responsibilityではなくなった
			this.list.add(receipt);
			return;
		}
		if (this.next == null) {
			// 今回は何もしないが、例外を投げるか、オプショナルクラス
			return;
		}
		this.next.add(receipt);
	}

	public int getTotal() {
		int total = 0;
		for (Receipt r : list) {
			total += r.getPrice().getAmount();
		}
		return total;
	}

	// Chain of Responsibilityではこれは抽象クラスになっていてサブクラスで実現する
	// 今回はサブクラスを使わないでここだけで終わらす
//	private void perform(Receipt receipt) {
//		// これだけだったらperformメソッドを作らなくてもいいかも
//
//		this.list.add(receipt);
//	}
}
