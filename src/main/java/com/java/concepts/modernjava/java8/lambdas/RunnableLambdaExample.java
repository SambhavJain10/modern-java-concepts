package com.java.concepts.modernjava.java8.lambdas;

public class RunnableLambdaExample {

    static void main() {

        Runnable runnable = new Runnable() { //
            @Override
            public void run() {
                System.out.println("inside Runnable 1");
            }
        };

        new Thread(runnable).start();
        //Lambda equivalent
        Runnable runnableLambda= () -> System.out.println("inside Runnable 2 using Lambda");
        new Thread(runnableLambda).start();
    }
}
