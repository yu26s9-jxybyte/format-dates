package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
    // first time doing Format dates
        // the current local date and time
        LocalDate today = LocalDate.now();
        LocalDateTime now = LocalDateTime.now();

        // the current time in GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

        // the formatters
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("EEEE dd, yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");

        System.out.println(today.format(fmt1));
        System.out.println(today.format(fmt2));
        System.out.println(today.format(fmt3));
        System.out.println(gmtTime.format(fmt4));
    }
}
