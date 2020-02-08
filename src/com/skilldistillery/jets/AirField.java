package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	// F I E L D S
	private List<Jet> allJets = new ArrayList<>();

	// M E T H O D S
	public void removeJet(Scanner kb) {
		System.out.println("Enter the integer that matches the jet below to remove");
		for (int i = 0; i < allJets.size(); i++) {
			System.out.println((i + 1) + " " + allJets.get(i).getModel());
		}
		System.out.print("> ");
		try {
			int userChoice = kb.nextInt();
			if(userChoice > allJets.size() || userChoice < 1) {
				System.out.println("Input integer out of bounds, back to main menu");
			}
			else {
				System.out.println("Removing " + allJets.get(userChoice - 1).getModel());
				allJets.remove(userChoice - 1);
				System.out.println("Done!");
			}
			
		} catch (Exception e) {
			System.out.println("Not an integer, back to main menu");
		}
	}
	
	public void addNewJet(Scanner kb) {
		while (true) {
		System.out.println();
		System.out.println("Enter a character to choose what kind of jet to add below: ");
		System.out.println("'G' for a generic jet");
		System.out.println("'P' for a passenger jet");
		System.out.println("'C' for a cargo jet");
		System.out.println("'F' for a fighter jet");
		System.out.println("'B' for a Business jet");
		System.out.print("'Q' to go back to main menu\n> ");
			try {
				char userChoice = 'Z';
				try {
					userChoice = kb.next().charAt(0);
					kb.nextLine();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				String type = Character.toString(userChoice).toUpperCase();
				if(type.equals("Q")) {
					break;
				}
				if( !type.equals("G") && !type.equals("P") && !type.equals("C") && !type.equals("F") && !type.equals("B") ) {
					System.out.print("Incorrect jet type, try again");
					continue;
				}

				System.out.print("Enter a string for the jet model: ");
				String model = "";
				try {
					model = kb.nextLine();
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.print("Please enter a double for the speed: ");
				double speed = 0;
				try {
					speed = kb.nextDouble();
				} catch (Exception e) {
					System.out.println("Incorrect speed entry, let's start over");
					kb.nextLine();
					continue;
				}

				System.out.print("Please enter a double for the range: ");
				double range = 0;
				try {
					range = kb.nextDouble();
				} catch (Exception e) {
					System.out.println("Incorrect range entry, let's start over");
					kb.nextLine();
					continue;
				}

				System.out.print("Please enter a double for the price: ");
				double price = 0;
				try {
					price = kb.nextDouble();
				} catch (Exception e) {
					System.out.println("Incorrect price entry, let's start over");
					kb.nextLine();
					continue;
				}
				if(!model.equals("")) {
					System.out.println("Adding new jet " + model);
					addJet(type, model, speed, range, price);
					System.out.println("Done!");
					break;
				}
				else {
					System.out.println("Jets must have model names, let's try again");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void callFighterJets() {
		for (Jet jet : allJets) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).readyOrdinance();
				((FighterJet) jet).fight();
			}
		}
	}

	public void callCargoJets() {
		for (Jet jet : allJets) {
			if (jet instanceof CargoJet) {
				((CargoJet) jet).loadCargo();
			}
		}
	}

	public void callCommercialJets() {
		for (Jet jet : allJets) {
			if (jet instanceof PassengerJet) {
				((PassengerJet) jet).loadPeople();
				((PassengerJet) jet).setFlightPlan();
			}
		}
	}

	public void callExecJets() {
		for (Jet jet : allJets) {
			if (jet instanceof ExecutiveJet) {
				((ExecutiveJet) jet).popBubbly();
			}
		}
	}

	public void longestRange() {
		System.out.println("The jet with the longest range is: ");
		Jet longestRange = allJets.get(0);
		for (int i = 1; i < allJets.size(); i++) {
			if (allJets.get(i).getRange() > longestRange.getRange()) {
				longestRange = allJets.get(i);
			}
		}
		System.out.println(longestRange);
	}

	public void viewFastest() {
		System.out.println("The fastest jet is: ");
		Jet fastestJet = allJets.get(0);
		for (int i = 1; i < allJets.size(); i++) {
			if (allJets.get(i).getSpeed() > fastestJet.getSpeed()) {
				fastestJet = allJets.get(i);
			}
		}
		System.out.println(fastestJet);
	}

	public void flyAllJets() {
		System.out.println("All jets ready to take flight");
		for (Jet jet : allJets) {
			jet.fly();
		}
	}

	public void listFleet() {
		System.out.println("Here is a list of all jets on the AirField");
		for (Jet jet : allJets) {
			System.out.println(jet);
		}
	}

	public void populateList() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetBits = line.split(", ");
				String type = jetBits[0];
				String model = jetBits[1];
				double speed = Double.parseDouble(jetBits[2]);
				double range = Double.parseDouble(jetBits[3]);
				double price = Double.parseDouble(jetBits[4]);
				addJet(type, model, speed, range, price);
			}
			bufIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addJet(String type, String model, double speed, double range, double price) {
		switch (type) {
		case "P": {
			allJets.add(new PassengerJet(model, speed, range, price));
			break;
		}
		case "C": {
			allJets.add(new CargoJet(model, speed, range, price));
			break;
		}
		case "F": {
			allJets.add(new FighterJet(model, speed, range, price));
			break;
		}
		case "B": {
			allJets.add(new ExecutiveJet(model, speed, range, price));
			break;
		}
		case "G": {
			allJets.add(new JetImp(model, speed, range, price));
			break;
		}
		default:
			System.out.println(model + "is an incorrect type of jet, use menu try to add again");
		}
	}

}
