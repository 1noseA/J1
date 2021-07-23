package j20210707;

import java.text.ParseException;
import java.util.Calendar;

public class MyBirth {
	public static void main(String[] args) throws ParseException {
//		Calendar cal = Calendar.getInstance();
//		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		Date birth = formatter.parse("1991-04-06");
//		Date now = cal.getTime();
//		long birth2 = birth.getTime();
//		long now2 = now.getTime();
		// 1日分のミリ秒
//		int MILLIS_OF_DAY = 1000 * 60 * 60 * 24;
//		int result = (int)(birth2 - now2) / MILLIS_OF_DAY;
//		System.out.println(result + "日");
//		System.out.println(result / 365 + "年");

		// 生まれてから何日経ったか
		Calendar birth = Calendar.getInstance();
		birth.set(1991, 4, 6);
		Calendar now = Calendar.getInstance();

		int count = 0;
		while(birth.before(now)) {
			count++;
			birth.add(Calendar.DATE, 1);
		}
		System.out.println(count);
	}
}
