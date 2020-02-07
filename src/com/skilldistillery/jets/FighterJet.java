package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatJet{

	public FighterJet(String model, double speed, double range, double price) {
		super(model, speed, range, price);
	}
	
	public void fly() {
		System.out.println(this.toString());
	}
	
	public void readyOrdinance() {
		System.out.println("Guns and missles loaded and ready for combat!");
	}
	
	public void fight() {
		System.out.println("I am locking in the enemy! Fire!");
	}

}
