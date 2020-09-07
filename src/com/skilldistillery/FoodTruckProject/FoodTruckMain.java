package com.skilldistillery.FoodTruckProject;

import java.util.Scanner;

public class FoodTruckMain {

	static Scanner kb = new Scanner(System.in);
	FoodTruck[] truckArray = new FoodTruck[5];

	public static void main(String[] args) {

		FoodTruckMain app = new FoodTruckMain();

		app.run(kb);

	}

	public void run(Scanner kb) {

		boolean keepGoing = true;
		int choice;
		int uniqueId = 0;
		// User Story #1

		// For Loop to add Food Trucks.
		for (int i = 0; i < truckArray.length; i++) {

			uniqueId = i + 1;
			System.out.println("Please enter Food Truck name with no spaces. ");
			System.out.print("Or to exit enter 'Quit': ");
			String name = kb.next();
			// User Story #2
			if (name.equals("quit") || name.equals("Quit")) {
				break;
			}
			// Asking user input for food type and truck rating.
			System.out.print("Please enter food type: ");
			String food = kb.next();
			System.out.print("Please enter the food truck rating from (1-5): ");
			double rating = kb.nextDouble();
			System.out.println();

			FoodTruck truck = new FoodTruck(name, food, rating, uniqueId);
			// Variable to create unique ids for foodtrucks.
			truckArray[i] = truck;
		}
		// Referenced final objective in PRESD for the loop and menu.
		while (keepGoing) {
			printMenu();
			System.out.print("Pick a choice from the menu: ");
			choice = kb.nextInt();
			System.out.println();
			// Switch was used with while loop to keep repeating menu after picking menu
			// item.
			switch (choice) {
			case 1:
				truckNames(truckArray);
				break;
			case 2:
				averageRating(truckArray);
				break;
			case 3:
				highestRated(truckArray);
				break;
			case 4:
				System.out.println("You have chosen to quit. Goodbye.");
				keepGoing = false;
				break;
			default:
				System.out.println("Invalid entry, please try again.");
				break;
			}

		}
	}

//User Story #3	& 4

	public void printMenu() {
		System.out.println();
		System.out.println("================== MENU =================");
		System.out.println("|  1. List all trucks. 			|");
		System.out.println("|  2. Display avg rating of food trucks.|");
		System.out.println("|  3. Display highest rated food truck. |");
		System.out.println("|  4. Exit        			|");
		System.out.println("=========================================");
		System.out.println();
	}

//This method calls to FoodTruck class to pull the Tostring.
	public void truckNames(FoodTruck[] name) {
		for (int i = 0; i < name.length; i++) {
			if (name[i] == null) {
				break;
			}
			System.out.println(name[i].toString());
		}
	}

// similar to highest rated,
	public double averageRating(FoodTruck[] reviews) {
		double sum = 0;
		double average = 0;
		int counter = 0;

		for (int i = 0; i < reviews.length; i++) {
			if (reviews[i] != null) {
				double avgRating = reviews[i].getRating();
				sum += avgRating;
				counter = i + 1;
			}
		}
		average = sum / counter;
		System.out.println("The average rating of all food trucks combined is: " + String.format("%.2g%n", average));
		return average;
	}

//Referenced min max to get highest rating. Needed t omake truck array != null) if not all 5 inputs were entered.
	public void highestRated(FoodTruck[] truckArray) {

		double max = 0;
		String truckname = "";

		for (int i = 0; i < truckArray.length; i++) {

			if (truckArray[i] != null) {
				double currentRating = truckArray[i].getRating();
				if (max < currentRating) {
					max = currentRating;
					truckname = truckArray[i].getTruckName();
				}

			}

		}
		System.out.println("The truck with the highest review is: " + truckname);
	}
}
