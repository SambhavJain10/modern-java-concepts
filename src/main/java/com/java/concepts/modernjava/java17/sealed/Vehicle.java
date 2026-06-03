package com.java.concepts.modernjava.java17.sealed;

public sealed abstract class Vehicle permits Car, Truck {

    public abstract String drive();
}
