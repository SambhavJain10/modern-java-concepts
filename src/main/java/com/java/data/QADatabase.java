package com.java.data;

import java.util.List;

public class QADatabase {

    public static List<QAEngineer> getQAEngineers() {
        return List.of (
                new QAEngineer("John Doe", 1, 1.4, List.of("Selenium", "Java", "TestNG"), "New York"),
                new QAEngineer("Jane Smith", 2, 3.5, List.of("Playwright", "TypeScript", "javaScript", "java"), "San Francisco"),
                new QAEngineer("Alice Johnson", 3, 4.5, List.of("Appium", "Python", "PyTest", "java"), "Chicago"),
                new QAEngineer("Bob Brown", 4, 7.0, List.of("jMeter", "Locust"), "Seattle")
        );
    }
}