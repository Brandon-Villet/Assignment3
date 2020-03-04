package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {
    private Car car;
    private Bike bike;

    @Before
    public void setUp() throws Exception {
        car = new Car("6543C","VW","Sadan",4,"Petrol");
        bike = new Bike("red",2,"6543s","Honda","Super",1);
    }

    @Test
    public void CarIsVechicle() {
        Assert.assertTrue(car instanceof Vehicle);
    }
    @Test
    public void BikeIsVechicle() {
        boolean x =bike instanceof VehicleIdentity;
        Assert.assertEquals(true,x);
    }
}