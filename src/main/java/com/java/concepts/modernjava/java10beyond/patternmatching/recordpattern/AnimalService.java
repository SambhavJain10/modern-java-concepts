package com.java.concepts.modernjava.java10beyond.patternmatching.recordpattern;

public class AnimalService {

    public String retrieveName(Animal animal){

        return switch (animal) {
          case Cat c -> c.name(); //if the animal is a cat, it will return the name of the cat
          case Dog d -> d.name(); //if the animal is a dog, it will return
          case null -> ""; //this handles the null case, if the animal is null, it will return an empty string

        };
    }

    public String retrieveAnimalDetailsUsingRecordPattern(Animal animal) {
        return switch (animal) {
            case null -> "";
            case Cat(var name, var color) -> name;
            case Dog(var name, var _) -> name; // as I am not using color here so we can put the placeholder- _
        };
    }
    public String retrieveAnimalDetailsUsingGuardedPattern(Animal animal){
        // is used to apply checks on binding variable
        return switch (animal){
            case null -> "";
            case Cat (var name, var _) when name == null -> ""; //guarded
            case Cat (var name, var color) -> name;
            case Dog (var name, var _) -> name; // as I am not using color here so we can put the placeholder- _
            };
    }
}