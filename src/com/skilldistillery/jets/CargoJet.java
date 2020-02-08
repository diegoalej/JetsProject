package com.skilldistillery.jets;

public class CargoJet extends Jet implements CargoCarrier {

	public CargoJet(String model, double speed, double range, double price) {
		super(model, speed, range, price);
	}
	
	public void fly() {
		System.out.println(this.toString() + " Max Flight Time: " + this.getMaxFlightTime());
	}
	
	public void loadCargo() {
		System.out.println(this.getModel() + " loaded and ready to carry cargo through the sky!");
	}

}
