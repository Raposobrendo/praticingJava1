package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date2 {
	public static void main(String[] Args) {
		
		LocalDate d04 = LocalDate.parse("2024-11-22");
		LocalDateTime d05 = LocalDateTime.parse("2024-11-22T01:37:00");
		Instant d06 = Instant.parse("2024-11-22T01:37:00Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;		
		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04(2) = " + fmt1.format(d04));
		System.out.println("d04(3) = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println();
		
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));
		System.out.println();
		
		System.out.println("d06 = " + fmt3.format(d06)); //d06.format(fmt3) won't work, because Instant is a Global DateTime, only works fmt3.format(d06).
		System.out.println("d06 = " + fmt5.format(d06));
		System.out.println("d06 = " + d06.toString());
		
	}
}
