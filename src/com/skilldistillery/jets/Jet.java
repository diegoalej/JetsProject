package com.skilldistillery.jets;

public abstract class Jet {
	//F I E L D S
	private String model;
	private double speed;
	private double range;
	private double price;
	private double maxFlightTime;
	
	
	//M E T H O D S
	public abstract void fly();
	
	public Jet(String model, double speed, double range, double price) {
		this.model = model;
		this.speed = roundTwoDecimals(speed);
		this.range = roundTwoDecimals(range);
		this.price = roundTwoDecimals(price);
		this.maxFlightTime = roundTwoDecimals(range / speed);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName());
		builder.append(" model: ");
		builder.append(model);
		builder.append(", speed: ");
		builder.append(speed);
		builder.append(" MPH, range: ");
		builder.append(range);
		builder.append(" miles, price: $");
		builder.append(price);
		builder.append(" million");
		return builder.toString();
	}

	public double getMaxFlightTime() {
		return maxFlightTime;
	}
		
	public void setMaxFlightTime(double maxFlightTime) {
		this.maxFlightTime = maxFlightTime;
	}

	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}


	public double getRange() {
		return range;
	}


	public void setRange(double range) {
		this.range = range;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	// Method rounds numbers to the nearest tenth
	public double roundTwoDecimals(double roundedNum) {
		roundedNum = Math.round(roundedNum * 10);
		roundedNum /= 10;
		return roundedNum;
	}
	
}
