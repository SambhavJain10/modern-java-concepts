package com.java.concepts.modernjava.java10beyond.enhancedswitch;

public class EnhancedSwitchExample {

    // Bottom line — Enhanced switch is an expression, not just a statement.
    // Expressions must always produce a value, so the compiler enforces that every possible input has a matching case.
    // This moves bugs from runtime to compile time.

    public static void main(String[] args) {
        String day = "Monday";
        String result = switch (day.toUpperCase()) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Invalid day";
        };

        int statusCode = 404;

        String message = switch (statusCode) {
            case 200 -> "OK";
            case 404 -> "Not Found";
            case 500 -> {
                String error = "Internal Server Error - Code: " + statusCode;
                System.out.println("Alert triggered!");  // extra logic
                yield error;  // return from block
            }
            default -> {
                if (statusCode >= 400) {
                    yield "Client Error: " + statusCode;
                } else {
                    yield "Unknown Status: " + statusCode;
                }
            }
        };

        System.out.println(day + " is a " + result);
        System.out.printf("Status Code: %d, Message: %s%n", statusCode, message);
    }
}