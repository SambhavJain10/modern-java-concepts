package com.java.concepts.modernjava.java8.functionalinterfaces;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void listQASkillsAndExp(){
        BiConsumer<String, List<String>> qaEngineerBiConsumer =
                (name, skills) -> System.out.println(name + ": " +skills);
        List<QAEngineer> qaList = QADatabase.getQAEngineers();
        qaList.forEach(qaEngineer -> qaEngineerBiConsumer.accept(qaEngineer.name(), qaEngineer.skillSet()));
    }

    static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + " " + b);
        biConsumer.accept("Hello", "World");

        BiConsumer<Integer, Integer> multiply = (a,b) -> System.out.println(a * b);
        multiply.accept(5, 10);

        BiConsumer<Integer, Integer> division = (a,b) -> System.out.println(a / b);
        division.accept(10, 5);

        multiply.andThen(division).accept(20, 4); //chaining BiConsumer

        listQASkillsAndExp();
    }
}