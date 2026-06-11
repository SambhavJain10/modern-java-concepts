package com.java.concepts.modernjava.java8.streams.parallelstreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreams {

    public static long performanceResults(Supplier<Integer> supplier, int numberOftimes){

        long startTime = System.currentTimeMillis();
        for (int i =0; i<numberOftimes; i++){
            supplier.get();
        }

        long endtime =System.currentTimeMillis();
        return endtime - startTime;
    }

    static int sumSequentialStream(){
        return IntStream.rangeClosed(1,100000)
                .sum();
    }

    static int sumParallelStream(){
        return IntStream.rangeClosed(1,100000)
                .parallel() //split the data into multiple parts
                .sum();
    }
    static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors() + " cores available");
        System.out.println("Sum using sequential stream: " + sumSequentialStream());
        System.out.println("Sum using parallel stream: " + sumParallelStream());

        System.out.println("\nPerformance comparison:");
        System.out.println("Sequential stream: " + performanceResults(ParallelStreams::sumSequentialStream, 20));
        System.out.println("Parallel stream: " + performanceResults(ParallelStreams::sumParallelStream, 20));

    }
}
