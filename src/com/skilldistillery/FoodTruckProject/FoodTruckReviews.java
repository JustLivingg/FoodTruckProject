package com.skilldistillery.FoodTruckProject;

import java.util.Scanner;

public class FoodTruckReviews {
private int reviews = 0;
private FoodTruck[] foodTruck;
private int MAX_REVIEWS = 5;
//Code to let us know how many spots we have in our array for reviews.
//Using code from ParkingLot to reference. 
static Scanner kb = new Scanner(System.in);

public void HowManyReviews() {
	foodTruck = new FoodTruck[MAX_REVIEWS];
	reviews = 0;
}

public static void main(String[] args) {
	
}
}
