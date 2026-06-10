package com.java.concepts.modernjava.java8.streams.terminaloperations;

public class StreamsPartitioningByExample {
    static void main(String[] args) {
            /*
            The partitioningBy() method is a special case of groupingBy() that partitions the input elements into two groups based on a given predicate. It returns a Map<Boolean, List<T>>, where the key is true for elements that satisfy the predicate and false for those that do not.

            Example usage:
            Map<Boolean, List<QAEngineer>> partitionedByExperience = qaEngineers.stream()
                    .collect(Collectors.partitioningBy(qaEngineer -> qaEngineer.experience() > 3));
            */
    }
}
