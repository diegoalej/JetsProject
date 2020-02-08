package com.skilldistillery.jets;

public class PassengerJet extends Jet implements CommercialJet {

	public PassengerJet(String model, double speed, double range, double price) {
		super(model, speed, range, price);
	}
	
	public void fly() {
		System.out.println(this.toString() + " Max Flight Time: " + this.getMaxFlightTime());
	}
	
	public void loadPeople() {
		System.out.println("All passengers have boarded and are ready for takeoff for the " + this.getModel());
	}
	
	public void setFlightPlan() {
		System.out.println("Course set, buckle up and we're off!");
	}
}
