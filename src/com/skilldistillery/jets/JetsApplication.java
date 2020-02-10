package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	private AirField newField = new AirField();

	public static void main(String[] args) {
		JetsApplication newApp = new JetsApplication();
		newApp.launch();
		newApp.displayMenu();
	}
	//Method is the first to run and populates the Airfield with Jets from text input
	private void launch() {
		newField.populateList();
	}
	//Method displays menu and captures user input to perform all different tasks
	private void displayMenu() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the Jets App!");
		int userChoice = 0;
		while (userChoice != 11) {
			System.out.println();
			System.out.println("Enter an integer to choose from the menu below: ");
			System.out.println("1: List fleet");
			System.out.println("2: Fly all jets");
			System.out.println("3: View fastest jet");
			System.out.println("4: View jet with longest range");
			System.out.println("5: Pop Bubbly in business jets");
			System.out.println("6: Load passengers for commercial flights");
			System.out.println("7: Load cargo for carrier jets");
			System.out.println("8: Ready ordinance for fighter jets");
			System.out.println("9: Add a jet to the AirField");
			System.out.println("10: Remove a jet from the Airfield");
			System.out.print("11: Quit\n> ");
			try {
				userChoice = kb.nextInt();
				switch (userChoice) {
				case 1 : { newField.listFleet();
					break;
				}
				case 2 : { newField.flyAllJets();
					break;
				}
				case 3 : { newField.viewFastest();
					break;
				}
				case 4 : { newField.longestRange();
					break;
				}
				case 5 : { newField.callExecJets();
					break;
				}
				case 6 : { newField.callCommercialJets();
					break;
				}
				case 7 : { newField.callCargoJets();
					break;
				}
				case 8 : { newField.callFighterJets();
					break;
				}
				case 9 : { newField.addNewJet(kb);
					break;
				}
				case 10 : { newField.removeJet(kb);
					break;
				}
				case 11 : {
					break;
				}
				default:
					System.out.println("Integer out of menu bounds, please try again");
				}	
			} catch (Exception e) {
				kb.nextLine();
				System.out.println("input is not an integer, please try again");
			}
		}
		kb.close();

	}
}
