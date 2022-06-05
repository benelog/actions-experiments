package net.benelog.util;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateTimes {
	public static boolean isHoliday(LocalDate day) {
		DayOfWeek dayOfWeek = day.getDayOfWeek();
		if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
			return true;
		}
		return false;
	}
}
