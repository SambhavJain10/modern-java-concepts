package com.java.concepts.oldjava.exceptionHandling.customExceptions;

public class Example {

    public static void main (String[] args) throws FinallyException {

        try{
            throw new TryException();
        }
        catch (TryException tryException) {
            System.out.println("TryException caught inside catch block");
            throw new CatchException();
            //is suppressed by finally throw FinallyException, as java can only propagate one exception at a time.
        }
        finally {
            throw new FinallyException();
        }
    }
}

