package com.java.concepts.modernjava.java8.functionalinterfaces;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;
import java.util.function.Predicate;

public class PredicateQAExample {

    static Predicate<QAEngineer> isSeniorQA = qa -> qa.experience() > 2;
    static Predicate<QAEngineer> isJavaSkilled = qa -> qa.skillSet().contains("java");
    static List<QAEngineer> qaEngineerList = QADatabase.getQAEngineers();

    static void filterQAByExp(){

        qaEngineerList.forEach(qaEngineer -> {
            if(isSeniorQA.test(qaEngineer)){
                System.out.println(qaEngineer);
            }
        });
    }

    static void filterQABySkillsSet(){
        System.out.println("QA Engineers with Java skills:");
        qaEngineerList.forEach(qaEngineer -> {
            if (isJavaSkilled.test(qaEngineer)){
                System.out.println(qaEngineer);
            }
        });
    }

    static void filterQAByExpAndSkillsSet(){
        System.out.println("Senior QA Engineers with Java skills:");
        qaEngineerList.forEach(qaEngineer -> {
            if (isSeniorQA.and(isJavaSkilled).test(qaEngineer)){
                System.out.println(qaEngineer);
            }
        });
    }
    static void main(String[] args) {

        filterQAByExp();
        filterQABySkillsSet();
        filterQAByExpAndSkillsSet();
    }
}
