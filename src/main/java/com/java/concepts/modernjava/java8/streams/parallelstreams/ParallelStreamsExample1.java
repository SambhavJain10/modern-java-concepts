package com.java.concepts.modernjava.java8.streams.parallelstreams;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class ParallelStreamsExample1 {

    static long startTime, endTime;

    public static List<String> getQASkillSetSequentially(){
        startTime = System.currentTimeMillis();
        List<String> skillsSet = QADatabase.getQAEngineers()
                .stream()
                .map(QAEngineer::skillSet) //Stream<List<String> //stateless intermediate operation
                .flatMap(List::stream)
                .distinct()
                .sorted()//Stream<String> //stateless intermediate operation
                .collect(toList()); //stateless terminal operation
        endTime = System.currentTimeMillis();
        System.out.println("Sequential processing time: " + (endTime - startTime) + " ms");
        return skillsSet;
    }

    public static List<String> getQASkillSetParallelly(){
        startTime = System.currentTimeMillis();
        List<String> skillsSet = QADatabase.getQAEngineers()
                .stream()
                .parallel()
                .map(QAEngineer::skillSet) //Stream<List<String> //stateless intermediate operation
                .flatMap(List::stream) //Stream<String> //stateless intermediate operation
                .distinct()
                .sorted() //stateless intermediate operation
                .collect(toList()); //stateless terminal operation
        endTime = System.currentTimeMillis();
        System.out.println("Parallel processing time: " + (endTime - startTime) + " ms");
        return skillsSet;
    }

    static void main(String[] args) {

        System.out.println("Getting QA skill set sequentially:");
        System.out.println(getQASkillSetSequentially());
        System.out.println("\nGetting QA skill set parallelly:");
        System.out.println(getQASkillSetParallelly());
    }
}
