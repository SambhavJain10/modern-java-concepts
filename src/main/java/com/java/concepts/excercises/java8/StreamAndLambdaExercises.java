package com.java.concepts.excercises.java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAndLambdaExercises {

    public static void main(String[] args){

        //Write a program to print 5 random numbers using forEach in Java 8
        Random random = new Random();
        random.ints(5, 1, 11).forEach(i -> System.out.println(i)); //using lambda reference
        random.ints(5, 1, 11).forEach(System.out::println); // using method reference

        //Write a program to print 5 random numbers in sorted order using forEach in Java 8
        System.out.println("printing 5 random numbers in sorted order using forEach------");
        random.ints(5,1,11).sorted().forEach(System.out::println);

        //Write a Java 8 program to get the sum of all numbers present in a list
        List<Integer> numbers = Arrays.asList(1,4,8,7,5);

        int sum = numbers.stream().mapToInt(i -> i).sum();
        System.out.println("Getting the sum of all numbers present in a list-----" + numbers);
        System.out.println(sum);

        //Write a Java 8 program to Square the list of numbers and then filter out the numbers greater than 10 and then find the average of filtered numbers
        double averageNumber= numbers.stream().mapToInt(i -> i*i).filter(i -> i>10).average().getAsDouble();
        System.out.println("Getting the average post squaring and filtering out which is greater than 10-----" + numbers);
        System.out.println(averageNumber);

        //Write a Java 8 program to find the smallest and biggest number of a list using Java8
        //1st Way generic
        List<Integer> sortedNumbers = numbers.stream().sorted().toList();
        System.out.println(sortedNumbers.getFirst() + " | " + sortedNumbers.getLast());

        //2nd Way - straight forward
        int maxNumber = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
        int minNumber = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(minNumber + " | " + maxNumber);

        //Write a Java 8 program to find the number of Strings in a list whose length is greater than 4

        //Generic way
        List<String> words = Arrays.asList("Rohit", "Virat", "Sachin", "Ronaldo", "Pele");
        Predicate<String> size4Plus = word -> word.length() >4 ;
        List<String> wordsSize4Plus = words.stream().filter(size4Plus).toList();
        System.out.println("Strings in a list whose length is greater than 4: " +wordsSize4Plus);
        System.out.println("total number of strings- " +wordsSize4Plus.size());

        // 2nd Way straight forward
        long num = words.stream().filter(size4Plus).count();
        System.out.println("total number of strings- " +num);
    }
}