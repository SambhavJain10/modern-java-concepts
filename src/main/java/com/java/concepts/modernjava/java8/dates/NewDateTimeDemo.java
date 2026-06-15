package com.java.concepts.modernjava.java8.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeDemo {

    static void main(String[] args) {

        //LocalDate
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        //LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println("Cuurent time: " +localTime);

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + localDateTime);
    }
}
