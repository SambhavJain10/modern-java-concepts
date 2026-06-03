package concepts.java8.iterations;

import java.util.ArrayList;
import java.util.List;

public class IterationExample {

    public static void main(String[] args){

        List<String> gamesList = new ArrayList<>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Tennis");
        gamesList.add("Chess");

        System.out.println("Iteration using Lambda Expresssion -- - - --");

        gamesList.forEach(games -> System.out.println(games)); //Example1- without method reference
        //gamesList.forEach();
    }
}
