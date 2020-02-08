package com.skilldistillery.jets;

public class JetImp extends Jet{
		
		public JetImp(String model, double speed, double range, double price) {
		super(model, speed, range, price);
	}

		public void fly() {
			System.out.println(this.toString() + " Max Flight Time: " + this.getMaxFlightTime() + "hours");
		}
}
