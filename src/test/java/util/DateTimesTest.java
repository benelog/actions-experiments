package util;

import static org.assertj.core.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import net.benelog.util.DateTimes;

class DateTimesTest {
	@Test
	void sundayIsHoliday() {
		LocalDate day = LocalDate.of(2022, 6, 5);
		boolean holiday = DateTimes.isHoliday(day);
		assertThat(holiday).isTrue();
	}
}
