package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateGlobalToLocal {
	public static void main(String[] Args) {
		
		LocalDate d04 = LocalDate.parse("2024-11-22");
		LocalDateTime d05 = LocalDateTime.parse("2024-11-22T01:37:00");
		Instant d06 = Instant.parse("2024-11-22T01:37:00Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Poland"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Poland"));
				
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		
	}
}
