package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	// F I E L D S
	private List<Jet> allJets = new ArrayList();

	// M E T H O D S
	public void populateList() {
//		allJets = new ArrayList<Jet>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetBits = line.split(", ");
				String type = jetBits[0];
				String model = jetBits[1];
				double speed = Double.parseDouble(jetBits[2]);
				double range = Double.parseDouble(jetBits[3]);
				double price = Double.parseDouble(jetBits[4]);
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
				default:
					System.out.println("no dice");

				}

			}
			System.out.println(allJets);
			System.out.println(allJets.size());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}