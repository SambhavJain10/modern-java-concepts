package com.java.concepts.modernjava.java8.streams;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;

public class StreamsMappingExample {

    static List<String> usingMap(List<QAEngineer> engineerList) {
        return engineerList.stream()
                .map(QAEngineer::name)
                .collect(Collectors.toList());
    } //effective way to transform a stream of QAEngineer objects into a stream of their names, and then collect those names into a List<String>.

    static List<String> usingMappingCollector(List<QAEngineer> engineerList) {
        return engineerList.stream()
                .collect(mapping(QAEngineer::name, Collectors.toList()));
    }
    //another way using mapping()

    static void main(String[] args) {

        System.out.println("Using map(): " + usingMap(QADatabase.getQAEngineers()));
        System.out.println("Using mapping(): " + usingMappingCollector(QADatabase.getQAEngineers()));
    }
}
