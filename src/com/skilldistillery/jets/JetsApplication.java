package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	private AirField newField = new AirField();

	public static void main(String[] args) {

		JetsApplication newApp = new JetsApplication();
		newApp.launch();
		newApp.displayMenu();
	}

	private void launch() {
		newField.populateList();
	}

	private void displayMenu() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the Jets App");
		int userChoice = 0;
		while (userChoice != 11) {
			System.out.println("Enter an integer to choose from the menu below: ");
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
			System.out.print("11: Quit\n> ");
			try {
				userChoice = kb.nextInt();
				switch (userChoice) {
				case 1 : {
					newField.listFleet();
					break;
				}
				case 2 : {
					newField.flyAllJets();
					break;
				}
//				case 3 : {
//					newField.listFleet();
//					break;
//				}
//				case 4 : {
//					newField.listFleet();
//					break;
//				}
//				case 5 : {
//					newField.listFleet();
//					break;
//				}
//				case 6 : {
//					newField.listFleet();
//					break;
//				}
//				case 7 : {
//					newField.listFleet();
//					break;
//				}
//				case 8 : {
//					newField.listFleet();
//					break;
//				}
//				case 9 : {
//					newField.listFleet();
//					break;
//				}
//				case 10 : {
//					newField.listFleet();
//					break;
//				}
				case 11 : {
					break;
				}
				default:
					System.out.println("Integer out of menu bounds, please try again");
//					throw new IllegalArgumentException("Unexpected value: " + userChoice);
				}	
			} catch (Exception e) {
				kb.nextLine();
				System.out.println("Not an integer, please try again");
			}
		}
		kb.close();

	}
}
