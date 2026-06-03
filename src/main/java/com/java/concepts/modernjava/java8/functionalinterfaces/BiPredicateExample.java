package com.java.concepts.modernjava.java8.functionalinterfaces;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {

    BiPredicate<Double, List<String>> biPredicate = (exp, skills) -> exp > 2 && skills.contains("java");

    Consumer<QAEngineer> qaEngineerConsumer = qaEngineer -> {
        if (biPredicate.test(qaEngineer.experience(), qaEngineer.skillSet())){
            System.out.println(qaEngineer.name() + " is a senior QA with Java skills");
        }
    };

    public void filterQAWithExpAndSkills(List<QAEngineer> qaEngineerList){
        qaEngineerList.forEach(qaEngineerConsumer);
    }

    static void main(String[] args) {
        List<QAEngineer> qaEngineerList = QADatabase.getQAEngineers();
        new BiPredicateExample().filterQAWithExpAndSkills(qaEngineerList);
    }
}