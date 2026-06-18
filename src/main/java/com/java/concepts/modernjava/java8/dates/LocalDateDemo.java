package com.java.concepts.modernjava.java8.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateDemo {

    static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date: " +localDate);

        LocalDate localDate1 = LocalDate.of(2020, 1, 1);
        System.out.println("localDate1: " +localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2020, 365);
        System.out.println("localDate2: " +localDate2);
        System.out.println("Is localDate1 before localDate2? " +localDate1.isBefore(localDate2));

       // Get values from LocalDate
        System.out.println("getMonth: " +localDate.getMonth()); //enum- Month
        System.out.println("getMonthOfValue: " +localDate.getMonthValue()); //int
        System.out.println("getDayOfWeek: " + localDate.getDayOfWeek()); //enum- DayOfWeek
        System.out.println("getDayOfYear: " + localDate.getDayOfYear()); //int
        System.out.println("getDayOfMonth: " + localDate.getDayOfMonth()); //eumm
        System.out.println("Day of the Month using get: " +localDate.get(ChronoField.DAY_OF_MONTH));

        //Modifying the local date
        System.out.println("plus days: " +localDate.plusDays(2)); //return new LocalDate instance
        System.out.println("Minus days: " + localDate.minusDays(2));
        System.out.println("withYear: " + localDate.withYear(2019));
        System.out.println("with ChronoField: " + localDate.with(ChronoField.YEAR, 2020));

        //additional functions
        System.out.println("is the current Year Leap Year: " +localDate.isLeapYear());
        System.out.println("is Equal: " +localDate.isEqual(localDate1));
        System.out.println("is Before: " +localDate.isBefore(localDate2));


    }
}