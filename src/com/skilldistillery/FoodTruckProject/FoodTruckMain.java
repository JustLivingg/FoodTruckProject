package com.skilldistillery.FoodTruckProject;

import java.util.Scanner;

public class FoodTruckMain {

	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		FoodTruckMain app = new FoodTruckMain();
		
		app.run(kb);
		
	}
	public void run(Scanner kb) {
		
		boolean keepGoing = true;
		int choice;
		// User Story #1

		FoodTruck[] truckArray = new FoodTruck[5];
		//For Loop to add Food Trucks.
		for (int i = 0; i < truckArray.length; i++) {
			System.out.print("Please enter name for Food Truck: ");
			String name = kb.next();
			//User Story #2 
			if (name.equals("quit") || name.equals("Quit")) {
				break;
			}
			//Asking user input for food type and truck rating.
			System.out.print("Please enter food type: ");
			String food = kb.next();
			System.out.print("Please enter the food truck rating: ");
			double rating = kb.nextDouble();

		
			FoodTruck truck = new FoodTruck(name, food, rating);

			truckArray[i] = truck;
		}
		while (keepGoing) {
		printMenu();
		System.out.println("Pick a choice from the menu: ");
		choice = kb.nextInt();

		switch (choice) {
		case 1:
			displayTruckInfo();
			break;
		case 2:
			averageRating();
			break;
		case 3:
			highestRatedTruck();
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

	public static void printMenu() {
		System.out.println();
		System.out.println("================== MENU =================");;
		System.out.println("|  1. List all trucks 					|");
		System.out.println("|  2. Display avg rating of food trucks |");
		System.out.println("|  3. Display highest rated food truck  |");
		System.out.println("|   4. Exit           					|");
		System.out.println("=========================================");
		System.out.println();
	}


//#TODO Come back and find average rating.	
	public void averageRating() {
		double sum = 0;
		double average = 0;
		int counter = 0;
	
//	for(int i = 0;i < foodTruckArray.length;i++){
//	if 
//}
	}

	public double highestRated() {
		double highRated = 0;
		return highRated;
	}

}
