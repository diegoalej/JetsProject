package com.skilldistillery.jets;

public class PassengerJet extends Jet implements CommercialJet {

	public PassengerJet(String model, double speed, double range, double price) {
		super(model, speed, range, price);
	}
	
	public void fly() {
		System.out.println(this.toString());
	}
	
	public void loadPeople() {
		System.out.println("All passengers are boarded and ready for takeoff");
	}
	
	public void setFlightPlan() {
		System.out.println("Course set, buckle up and we're off!");
	}
}
