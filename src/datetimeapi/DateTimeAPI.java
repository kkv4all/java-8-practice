package datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeAPI {
	public static void main(String[] args) {
		DateTimeAPI api = new DateTimeAPI();
		
		api.testLocalDateTime();
		api.testZonedDateTime();
	}

	private void testZonedDateTime() {
		ZonedDateTime zonedDateTime = ZonedDateTime.parse("2007-12-03T10:15:30+05:30");
		System.out.println("Zoned DateTime: "+ zonedDateTime);
		
		ZoneId zoneId = zonedDateTime.getZone();
		System.out.println("Zone Id: "+zoneId);
	}

	private void testLocalDateTime() {
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current DateTime: " + currentTime);
		
		LocalDate localDate = currentTime.toLocalDate();
		System.out.println("Cuurent Date(Local): "+ localDate);
		
		Month month = currentTime.getMonth();
		DayOfWeek dayOfWeek = currentTime.getDayOfWeek();
		int day = currentTime.getDayOfMonth();
		System.out.println("Month: "+month + ", Day of Week: "+dayOfWeek + ", Day of Month: "+day);
		
		LocalDateTime dateWithChangedYearAndMonth = currentTime.withMonth(1).withYear(2012);
		System.out.println("Current Date with Modified year as 2012 and month as January: "+ dateWithChangedYearAndMonth);
		
		LocalDate dateWithValueSet = LocalDate.of(2014, Month.JANUARY, 1);
		System.out.println("Set Date : " + dateWithValueSet);
	}
}
