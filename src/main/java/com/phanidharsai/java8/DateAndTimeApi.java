package com.phanidharsai.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeApi {
    public static void main(String[] args){
// Create a date representing the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

// Create a specific date
        LocalDate specificDate = LocalDate.of(2023, 7, 12);

// Parsing a date from a string
        LocalDate parsedDate = LocalDate.parse("2023-07-12");
        System.out.println(parsedDate);

// Add 1 day to the current date
        LocalDate nextDay = currentDate.plusDays(1);
        System.out.println(nextDay);

// Subtract 1 month from the current date
        LocalDate previousMonth = currentDate.minusMonths(1); // many more methods like years,weeks etc

// Format a date as a string
        String formattedDate = currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

// Parse a date from a string
        LocalDate parsedDate2 = LocalDate.parse("12/07/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"));


        LocalDate date1 = LocalDate.of(2023, 7, 12);
        LocalDate date2 = LocalDate.of(2023, 7, 15);

// Compare two dates
        int comparisonResult = date1.compareTo(date2);
// Returns -1 if date1 is before date2, 1 if date1 is after date2, or 0 if they are equal

// Create a date and time in a specific time zone
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);

    }
}
