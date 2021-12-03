
package com.dnapass.training.java.day4;
public class Bicycle {
	
    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;
	
    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, String string) {
        gear = string;
        cadence = startCadence;
        speed = startSpeed;
    }
	
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
	
    public void setGear(int newValue) {
        gear = newValue;
    }
	
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
	
    public void speedUp(int increment) {
        speed += increment;
    }
	
}

