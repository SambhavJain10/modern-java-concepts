package com.java.concepts.modernjava.java8.functionalinterfaces;

import com.java.data.QADatabase;
import com.java.data.QAEngineer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<QAEngineer> qaConsumer = (qaEngineer) -> System.out.println(qaEngineer);
    static Consumer<QAEngineer> qaConsumer1 = (qaEngineer) ->
            System.out.println(qaEngineer.name() + "," + qaEngineer.skillSet() + "," + qaEngineer.location());
    static Consumer<QAEngineer> qaConsumer2 = (qaEngineer) -> System.out.print(qaEngineer.skillSet() + ": ");
    static Consumer<QAEngineer> qaConsumer3 = (qaEngineer) -> System.out.println(qaEngineer.experience());

    static List<QAEngineer> qaEngineerList = QADatabase.getQAEngineers();

    public static void listQAEngineers(){

        qaEngineerList.forEach(qaConsumer);
        System.out.println("-----------------------------");
    }

    public static void listQASkillsAndLocation(){

        QADatabase.getQAEngineers().forEach(qaConsumer1);
        System.out.println("-----------------------------");

    }

    //using consumer chaining
    public static void listQASkillsAndExp() {

        qaEngineerList.forEach(qaConsumer2.andThen(qaConsumer3)); //consumer chaining
        System.out.println("-----------------------------");
    }

    // using consumer chaining with condition
    public static void listQASkillsAndExpWithCondition() {
        qaEngineerList.forEach((qaEngineer -> {
            if(qaEngineer.experience() >= 2){
                qaConsumer2.andThen(qaConsumer3).accept(qaEngineer);
            }

        }));
        System.out.println("-----------------------------");
    }

    static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println("Hello " +s);
        consumer.accept("World"); //Hello World

        listQAEngineers();
        listQASkillsAndLocation();
        listQASkillsAndExp();
        listQASkillsAndExpWithCondition();
    }
}
