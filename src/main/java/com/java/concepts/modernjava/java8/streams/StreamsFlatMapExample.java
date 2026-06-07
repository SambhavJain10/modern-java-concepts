package com.java.concepts.modernjava.java8.streams;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsFlatMapExample {

    public static Set<String> getQASkillSet(){
        return QADatabase.getQAEngineers()
                .stream()
                .map(QAEngineer::skillSet) //Stream<List<String> //stateless intermediate operation
                //.collect(toList()); //compile Error
                .flatMap(List::stream) //Stream<String> //stateless intermediate operation
                .collect(toSet()); //stateless terminal operation
    }

    static void main(String[] args) {

        System.out.println(getQASkillSet());

    }
}