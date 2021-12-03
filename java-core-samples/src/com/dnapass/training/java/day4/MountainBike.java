package com.dnapass.training.java.day4;




public class MountainBike extends Bicycle {
	
    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight, int startCadence, int startSpeed, String string) {
        super(startCadence, startSpeed, string);
        seatHeight = startHeight;
    }	
	
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }	
    
}