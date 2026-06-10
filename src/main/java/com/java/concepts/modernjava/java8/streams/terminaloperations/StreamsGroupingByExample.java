package com.java.concepts.modernjava.java8.streams.terminaloperations;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

    public static Map<String, List<QAEngineer>> groupByLocation(List<QAEngineer> qaEngineers) {
        return qaEngineers.stream()
                .collect(groupingBy(QAEngineer::location));// returns the list of QAEngineer based on location
    }

    public static Map<String, List<QAEngineer>> customizedGroupingBy(List<QAEngineer> qaEngineers){
        return qaEngineers.stream()
                .collect(groupingBy(qaEngineer -> qaEngineer.experience()>3 ? "senior" : "juniors"));
    }

    public static Map<String, Map<String, List<QAEngineer>>> twoLevelGroupingBy_1(List<QAEngineer> qaEngineers){

        return qaEngineers.stream()
                .collect(groupingBy(QAEngineer::location,
                        groupingBy(qaEngineer -> qaEngineer.location().equalsIgnoreCase("Pune") ? "Offsite" : "Onsite")));
    }

    public static Map<String, Integer> twoLevelGroupingBy_2(List<QAEngineer> qaEngineers){

        return qaEngineers.stream()
                .collect(groupingBy(QAEngineer::name,
                        summingInt(QAEngineer::shares)));
    }

    public static Map<String, Set<QAEngineer>> threeArgumentGroupingBy(List<QAEngineer> qaEngineers){

        return qaEngineers.stream()
                .collect(groupingBy(
                        QAEngineer::location,    // classifier   — group BY this
                        HashMap::new,        // map factory  — use this Map type
                        toSet()              // downstream   — collect values into Set
                ));
    }

    public static Map<Double, Optional<QAEngineer>> groupingByWithMaxBy(List<QAEngineer> qaEngineers) {
        return qaEngineers.stream()
                .collect(groupingBy(QAEngineer::experience,
                        maxBy(Comparator.comparingInt(QAEngineer::shares))));
    }

    public static Map<Double, Optional<QAEngineer>> groupingByWithMinBy(List<QAEngineer> qaEngineers) {
        return qaEngineers.stream()
                .collect(groupingBy(QAEngineer::experience,
                        minBy(Comparator.comparingInt(QAEngineer::shares))));
    }

    static void main(String[] args) {

        System.out.println(groupByLocation(QADatabase.getQAEngineers()));
        System.out.println("QA Engineers based out of Pune:");
        System.out.println(groupByLocation(QADatabase.getQAEngineers()).get("Pune"));// returns the list of QAEngineer based on Pune Location
        System.out.println("Customized Grouping based on experience:");
        System.out.println(customizedGroupingBy(QADatabase.getQAEngineers()));
        System.out.println("---------------------------");

        System.out.println("Two level grouping based on experience and customized grouping:");
        System.out.println(twoLevelGroupingBy_1(QADatabase.getQAEngineers()));
        System.out.println("Two level grouping based on shares and summing the shares:");
        System.out.println(twoLevelGroupingBy_2(QADatabase.getQAEngineers()));
        System.out.println("---------------------------");

        System.out.println("Three argument grouping based on location and returning the set of QA Engineers:");
        System.out.println(threeArgumentGroupingBy(QADatabase.getQAEngineers()));
        System.out.println("---------------------------");

        System.out.println("Grouping by with maxBy:");
        System.out.println(groupingByWithMaxBy(QADatabase.getQAEngineers()));
        System.out.println("Grouping by with minBy:");
        System.out.println(groupingByWithMinBy(QADatabase.getQAEngineers()));
    }
}
