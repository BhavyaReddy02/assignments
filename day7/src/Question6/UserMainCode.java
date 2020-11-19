package Question6;

import java.time.Month;
import java.time.YearMonth;

public class UserMainCode {

	static int getNumberOfDays(int year, int month) {

		Month month1 = Month.of(month + 1);
		YearMonth yearMonth = YearMonth.of(year, month1);
		int days = yearMonth.lengthOfMonth();
		return days;
	}
}
