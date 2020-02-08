package com.skilldistillery.jets;

public class ExecutiveJet extends Jet implements LeisureJet {
	
	public ExecutiveJet(String model, double speed, double range, double price) {
		super(model, speed, range, price);
	}

	public void fly() {
		System.out.println(this.toString() + " Max Flight Time: " + this.getMaxFlightTime());
	}
	
	public void popBubbly() {
		System.out.println("Drinks all around aboard the " + this.getModel());
		this.kickBack();
	}
	
	public void kickBack() {
		System.out.println("Lean back and we will be there in no time!");
	}
		
}
