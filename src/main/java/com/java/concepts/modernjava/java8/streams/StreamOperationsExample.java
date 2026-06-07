package com.java.concepts.modernjava.java8.streams;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;

public class StreamOperationsExample {

    public static List<String> getNamesWithStreamOperations(){
        return QADatabase.getQAEngineers()
                .stream()
                .map(qa -> qa.name())
                .map(String::toUpperCase)
                .sorted()
                .toList();
    }

    public static List<String> getUniqueSkillsSet(){
        return QADatabase.getQAEngineers()
                .stream()
                .map(qa -> qa.skillSet())
                .flatMap(List::stream)
                .distinct()
                .toList();
    }

    public static int getCountOfQAEngineers(List<QAEngineer> qaEngineers){
        return qaEngineers.size(); // return long, so we need to cast to int
    }

    public static long getCountOfUniqueSkillsSet(List<QAEngineer> qaEngineers){
        return qaEngineers.stream()
                .map(QAEngineer::skillSet) //stateless intermediate operation
                .flatMap(List::stream)
                .distinct() //stateful intermediate operation
                .count(); //terminal operation
    }

    static void main(String[] args) {

        System.out.println(getNamesWithStreamOperations());
        System.out.println(getUniqueSkillsSet());
        System.out.println("Total QA Engineers: " +getCountOfQAEngineers(QADatabase.getQAEngineers()) );
        System.out.println("Total Unique Skills: " + getCountOfUniqueSkillsSet(QADatabase.getQAEngineers()));
    }
}