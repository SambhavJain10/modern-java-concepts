package com.java.concepts.modernjava.java25.compactmain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Demonstrates Java 25 Compact Main Functionality
 *
 * This class shows:
 * 1. Simplified main method without public static modifiers
 * 2. Direct access to instance fields and methods
 * 3. Clean and readable code structure
 */
class CompactMainDemo {

    // Instance fields
    private String appName = "Compact Main Demo Application";
    private String version = "1.0";
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    void main() {
        printHeader();
        demonstrateFeatures();
        printFooter();
    }

    private void printHeader() {
        System.out.println("=" .repeat(60));
        System.out.println("Application: " + appName);
        System.out.println("Version: " + version);
        System.out.println("Started at: " + getCurrentDateTime());
        System.out.println("=" .repeat(60));
        System.out.println();
    }

    private void demonstrateFeatures() {
        System.out.println("✓ Feature 1: Direct access to instance fields");
        System.out.println("  App Name: " + appName);
        System.out.println("  Version: " + version);
        System.out.println();

        System.out.println("✓ Feature 2: Calling instance methods");
        greetUser("Java Developer");
        System.out.println();

        System.out.println("✓ Feature 3: Using utility methods");
        processData();
        System.out.println();

        System.out.println("✓ Feature 4: Working with dates and utilities");
        System.out.println("  Current DateTime: " + getCurrentDateTime());
        System.out.println();
    }

    private void greetUser(String userName) {
        System.out.println("  Welcome, " + userName + "!");
        System.out.println("  This is a compact main method demo.");
    }

    private void processData() {
        String[] items = {"Item 1", "Item 2", "Item 3"};
        for (String item : items) {
            System.out.println("  Processing: " + item);
        }
    }

    private String getCurrentDateTime() {
        return LocalDateTime.now().format(formatter);
    }

    private void printFooter() {
        System.out.println("=" .repeat(60));
        System.out.println("Application completed successfully!");
        System.out.println("Ended at: " + getCurrentDateTime());
        System.out.println("=" .repeat(60));
    }
}

