package com.java.concepts.oldjava.exceptionHandling.tryCatchExamples;

public class Example1 {

    public static void main (String[] args){

        try {
            int a[] =new int[5];
            a[5]=30/0;
            System.out.println(a[10]);
        }

        catch (ArithmeticException e){

            System.out.println("Arithmatic Exception occurs");
        }
        catch (ArrayIndexOutOfBoundsException e){

            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch (Exception e){

            System.out.println("Exception occurs");
        }

        System.out.println("Rest of the code executes");
    }
}
