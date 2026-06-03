package com.java.concepts.modernjava.java8.functionalinterfaces;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<QAEngineer> isSeniorQA = qaEngineer -> qaEngineer.experience()>=4;
    Predicate<QAEngineer> isJavaSkilled = qaEngineer -> qaEngineer.skillSet().contains("java");

    BiConsumer<String, List<String>> qaBiConsumer = (name, skills) -> System.out.println(name + ": " + skills);
    Consumer<QAEngineer> qaEngineerConsumer = qaEngineer -> {
        if(isSeniorQA.and(isJavaSkilled).test(qaEngineer)){
            qaBiConsumer.accept(qaEngineer.name(), qaEngineer.skillSet());
        }
    };

    public void printNameAndSkillsSet(List<QAEngineer> qaEngineerList){

        qaEngineerList.forEach(qaEngineerConsumer);
    }

    static void main(String[] args) {
        List<QAEngineer> qaEngineerList = QADatabase.getQAEngineers();

        PredicateAndConsumerExample example = new PredicateAndConsumerExample();
        example.printNameAndSkillsSet(qaEngineerList);
    }
}
