package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateCalculations {
	public static void main(String[] Args) {
		
		LocalDate d04 = LocalDate.parse("2024-11-22");
		LocalDateTime d05 = LocalDateTime.parse("2024-11-22T01:37:00");
		Instant d06 = Instant.parse("2024-11-22T01:37:00Z");
		
		LocalDate lastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("lastWeekLocalDate: " + lastWeekLocalDate);
		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
		
		LocalDateTime lastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("lastWeekLocalDateTime: " + lastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		
		Instant lastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("lastWeekInstant: " + lastWeekInstant);
		System.out.println("nextWeekInstant: " + nextWeekInstant);
		
		// Duration t0 = Duration.between(lastWeekLocalDate, nextWeekLocalDate); LocalDate doesn't support seconds, need to change to LocalDateTime
		Duration t1 = Duration.between(lastWeekLocalDate.atStartOfDay(), nextWeekLocalDate.atTime(0, 0)); // atStartOfDay == atTime(0,0)
		Duration t2 = Duration.between(lastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(d06, nextWeekInstant);
		Duration t4 = Duration.between(nextWeekInstant, d06); //what if first date is AFTER the second date?
		
		System.out.println("t1 days: " + t1.toDays());
		System.out.println("t2 days: " + t2.toDays());
		System.out.println("t3 days: " + t3.toDays());
		System.out.println("t4 days: " + t4.toDays()); //here is the answer
	}
}
