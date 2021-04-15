package silver;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class API_6 {
	public static void main(String[] args) {
		LocalDate a = LocalDate.of(2021, 4, 14);
		LocalDate b = LocalDate.now();
		b.with(DayOfWeek.MONDAY);
		System.out.println(a.equals(b) + ", " + a.isBefore(b));
	}
}
