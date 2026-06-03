package com.java.concepts.oldjava.oops.abstraction;

public class Example1 {

    public static void main(String[] args){

        Bank b;
        b= new Axis();
        System.out.println(b.getRateOfInterest());

        b= new SBI();
        System.out.println(b.getRateOfInterest());
    }
}

abstract class Bank {

    Bank(){ //Abstract class can have constructor however it can not be instantiated- as it is IS-A relationship super constructor will always be called
        System.out.println("Abstract calling");
    }
    abstract float getRateOfInterest();
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