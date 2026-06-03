package com.java.concepts.modernjava.java17.sealed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void vehicleTest(){
        var car = new Car();
        var truck = new Truck();
        assertInstanceOf(Vehicle.class, car);
        assertInstanceOf(Vehicle.class, truck);
    }

    @Test
    void testCar() {
        Car car = new Car();
        assertNotNull(car);
    }

    @Test
    void testPickupTruck() {
        PickupTruck pickupTruck = new PickupTruck();
        assertNotNull(pickupTruck);
    }

    @Test
    void driveTest(){
        var car = new Car();
        var truck = new Truck();
        Assertions.assertEquals("car",  car.drive());
        Assertions.assertEquals("truck", truck.drive());
    }
}