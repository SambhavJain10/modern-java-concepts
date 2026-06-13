package com.java.data;

import java.util.List;
import java.util.function.Supplier;

public class QADatabase {

    public static Supplier<QAEngineer> qaEngineerSupplier = () -> new QAEngineer("Rahul Devarkonda", 6, 3.4, List.of("Selenium", "Java", "TestNG", "Cypress"), "Bangalore", 70);
    public static Supplier<QAEngineer> nullSupplier = () -> null;

    public static List<QAEngineer> getQAEngineers() {
        return List.of (
                new QAEngineer("John Doe", 1, 1.4, List.of("Selenium", "Java", "TestNG"), "New York", 14),
                new QAEngineer("Kishor Kumar", 2, 3.5, List.of("Playwright", "TypeScript", "javaScript", "java"), "Pune", 30 ),
                new QAEngineer("Alice Johnson", 3, 4.5, List.of("Appium", "Python", "PyTest", "java"), "Chicago", 50),
                new QAEngineer("Bob Brown", 4, 7.0, List.of("jMeter", "Locust"), "Seattle", 100),
                new QAEngineer("Sachin Davis", 5, 2.0, List.of("Cypress", "JavaScript", "java"), "Pune", 20)
        );
    }
}