package Question5;

import java.time.Month;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class NumberOfDays {

	public int getDays(int year, int month) {

		Month month1 = Month.of(month + 1);
		YearMonth yearMonth = YearMonth.of(year, month1);
		int daysInMonth = yearMonth.lengthOfMonth();
		return daysInMonth;
	}
}
