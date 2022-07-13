package net.benelog.util;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

import java.util.Set;

public class DateTimes {
	private static final Set<MonthDay> LEGAL_HOLIDAYS = Set.of(
		MonthDay.of(Month.JANUARY, 1),
		MonthDay.of(Month.DECEMBER, 25),
		MonthDay.of(Month.MAY, 5),
		MonthDay.of(Month.JUNE, 6),
		MonthDay.of(Month.AUGUST, 15),
		MonthDay.of(Month.OCTOBER, 9)
	);

	public static boolean isHoliday(LocalDate day)
	{
		DayOfWeek dayOfWeek = day.getDayOfWeek();
		if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
			return true;
		}

		MonthDay monthDay = MonthDay.of(day.getMonth(), day.getDayOfMonth());
		if (LEGAL_HOLIDAYS.contains(monthDay)) {
			return true;
		}
		return false;
	}
}
