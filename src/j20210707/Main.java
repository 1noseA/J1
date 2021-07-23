package j20210707;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws ParseException {
		// Date date = new Date();
		// System.out.println(date);
		// Long型が返ってくる
		// System.out.println(date.getTime());

		// Calendarクラスは中傷クラスのためnewできない
		// Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		// System.out.println(cal.getClass().getName());
		// System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		// 0月から始まるため
		System.out.println(cal.get(Calendar.MONTH + 1));
		System.out.println(cal.get(Calendar.DATE));

		// DateFormat formatter = DateFormat.getDateInstance();
		// 日付と時刻両方の設定ができる
		// DateFormat formatter = DateFormat.getDateTimeInstance();
		// DateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = cal.getTime();
		String str = formatter.format(date);
		// System.out.println(formatter.format(cal.getTime()));
		System.out.println(str);

		// Date tmp = formatter.parse("2021-01-01");
		// 柔軟に解決するかどうかをfalseにすれば99日という無効な日付を入れたら例外が出る（デフォルトはtrue）
//		formatter.setLenient(false);
//		Date tmp = formatter.parse("2021-01-99");
//		System.out.println(tmp);

		formatter.setLenient(true);
		Date tmp = formatter.parse("2021-01-01");
		cal.setTime(tmp);

		// １月にプラスひと月される
		cal.add(Calendar.MONTH, 1);
		// プラス20日される（+ (-20)日もできる）
		cal.add(Calendar.DATE, 20);
		cal.add(Calendar.DATE, -2000);
		System.out.println(formatter.format(cal.getTime()));

		Calendar now = Calendar.getInstance();
		// nowがcalより後だったらtrue
		System.out.println(now.after(cal));
	}
}
