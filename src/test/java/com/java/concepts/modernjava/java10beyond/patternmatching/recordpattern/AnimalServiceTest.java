package com.java.concepts.modernjava.java10beyond.patternmatching.recordpattern;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AnimalServiceTest {

    AnimalService animalService = new AnimalService();

    @ParameterizedTest
    @MethodSource("input")
    void testRetrieveName(Animal animal, String expectedResult) {
        var output = animalService.retrieveName(animal);
        assertEquals(expectedResult, output);
    }

    @ParameterizedTest
    @MethodSource("input")
    void testRecordPatternMatchingUsingSwitch(Animal animal, String expectedResult) {
        var output = animalService.retrieveAnimalDetailsUsingRecordPattern(animal);
        assertEquals(expectedResult, output);
    }

    @Test
    void testGuardedPatternUsingSwitch() {
        var output = animalService.retrieveAnimalDetailsUsingGuardedPattern(new Cat("", "Brown"));
        assertEquals("", output);
    }

    private static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new Dog("Scooby", "white"),"Scooby"),
                Arguments.of(new Cat("Kitty", "brown"),"Kitty"),
                Arguments.of(null, "")
        );
    }
}