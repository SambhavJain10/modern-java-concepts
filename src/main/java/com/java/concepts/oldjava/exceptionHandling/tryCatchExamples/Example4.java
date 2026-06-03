package com.java.concepts.oldjava.exceptionHandling.tryCatchExamples;

public class Example4 {

    public static void badMethod(){

        throw new Error();
    }
    public static void main(String[] args){

        try {
            badMethod();
            System.out.println("A");
        }
        catch (Error e){ //Error can also be caught //if we comment this then it will give throw java.lang.error
            System.out.println("B");
        }
        catch (Exception e){
            System.out.println("C");
        }
        finally {
            System.out.println("D");
        }

        System.out.println("E");
    }
}
