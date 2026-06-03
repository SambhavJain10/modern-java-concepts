package com.java.concepts.modernjava.java17.sealed;

public sealed class Truck extends Vehicle permits PickupTruck {
    @Override
    public String drive() {
        return "truck";
    }
}
