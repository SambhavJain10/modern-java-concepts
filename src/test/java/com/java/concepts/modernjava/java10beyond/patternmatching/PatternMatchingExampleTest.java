package com.java.concepts.modernjava.java10beyond.patternmatching;

import com.java.concepts.modernjava.java10beyond.patternmatching.typepattern.PatternMatchingExample;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PatternMatchingExampleTest {

    public PatternMatchingExample patternMatchingExample = new PatternMatchingExample();

    @ParameterizedTest
    @MethodSource("input")
    void testPatternMatching(Object o, String expectedResult) {
        var output = patternMatchingExample.patternMatching(o);
        assertEquals(expectedResult, output);
    }

    @ParameterizedTest
    @MethodSource("input")
    void testPatternMatchingUsingInstanceOf(Object o, String expectedResult) {
        var output = patternMatchingExample.patternUsingInstanceOf(o);
        assertEquals(expectedResult, output);
    }

    @ParameterizedTest
    @MethodSource("input")
    void testPatternMatchingUsingSwitch(Object o, String expectedResult) {
        var output = patternMatchingExample.patternMatchingUsingSwitch(o);
        assertEquals(expectedResult, output);
    }

    private static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of("Hello","It's a string: Hello"),
                Arguments.of(5, "It's an integer: 10"),
                Arguments.of(3.14, "Not a string or Integer")
        );
    }
}