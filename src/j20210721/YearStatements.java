package j20210721;

import java.util.Calendar;

public class YearStatements {
	public static MonthlyStatements create() {
		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.MONTH, Calendar.JANUARY);
		MonthlyStatements jan = new MonthlyStatements(cal.getTime());

		cal.set(Calendar.MONTH, Calendar.FEBRUARY);
		MonthlyStatements feb = jan.setNext(new MonthlyStatements(cal.getTime()));

		return jan;
	}
}
