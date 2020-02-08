package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatJet{

	public FighterJet(String model, double speed, double range, double price) {
		super(model, speed, range, price);
	}
	
	public void fly() {
		System.out.println(this.toString() + " Max Flight Time: " + this.getMaxFlightTime());
	}
	
	public void readyOrdinance() {
		System.out.println("Guns and missles loaded and ready for the " + this.getModel());
	}
	
	public void fight() {
		System.out.println("Locking in the enemy! Fire!");
	}

}
