package com.java.concepts.oldjava.oops.polymorphism.overriding;

public class Example2 {

    public static void main(String[] args){

        Bank b;

        b= new SBI();
        System.out.println(b.getRateOfInterest());

        b= new Axis();
        System.out.println(b.getRateOfInterest());

        b= new HDFC();
        System.out.println(b.getRateOfInterest());

    }
}

class Bank {

    public float getRateOfInterest(){
            return 0;
    }
}

class SBI extends Bank {

    @Override
    public float getRateOfInterest() {
        return 7.5f;
    }
}

class Axis extends Bank{

    @Override
    public float getRateOfInterest() {
        return 8.1f;
    }
}

class HDFC extends Bank {
    @Override
    public float getRateOfInterest() {
        return 8.4f;
    }
}
