package com.skilldistillery.jets;

public class JetsApplication {
		
	public static void main(String[] args) {
		
		JetsApplication newApp = new JetsApplication();
		newApp.launch();
		newApp.displayMenu();
	}
	private void launch() {
		AirField newField = new AirField();
		newField.populateList();
	}
	
	private void displayMenu() {
		System.out.println("Welcome to the Jets App\nEnter an integer for the menu below: ");
		System.out.println("1: List fleet");
		System.out.println("2: Fly all jets");
		System.out.println("3: View fastest jet");
		System.out.println("4: View jet with longest range");
		System.out.println("5: Pop Bubbly in business jets");
		System.out.println("6: Load passengers for commercial flights");
		System.out.println("7: Load cargo for carrier jets");
		System.out.println("8: Ready ordinance for fighter jets");
		System.out.println("9: Add a jet to AirField");
		System.out.println("10: Remove a jet from Airfield");
		System.out.println("11: Quit");
		
		
	}
}
