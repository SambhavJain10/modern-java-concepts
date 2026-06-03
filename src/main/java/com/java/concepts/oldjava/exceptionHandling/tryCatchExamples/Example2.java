package com.java.concepts.oldjava.exceptionHandling.tryCatchExamples;

public class Example2 {

    public static void main (String[] args){

        try {
            int a[] =new int[5];
            a[5]=30/0;
            System.out.println(a[10]);
        }

        catch (Exception e){

            System.out.println("Exception occurs");
        }

        // gives compile time error as Exception 'java.lang.ArithmeticException' has already been caught

        //commenting below to avoid compile time error
      /*  catch (ArithmeticException e){

            System.out.println("Arithmatic Exception occurs");
        }
        catch (ArrayIndexOutOfBoundsException e){

            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }*/
    }
}
