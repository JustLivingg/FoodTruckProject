package com.skilldistillery.FoodTruckProject;

public class FoodTruck {
//Define a FoodTruck class with fields for a unique numeric ID
//Foodtruck {Name, Food Type, Rating.}

	private String name;
	private String food;
	private double rating;

	public FoodTruck(String tN) {
		this.name = tN;
		this.food = null;
		this.rating = 0.0;
	}

	public FoodTruck(String tN, String food, double r) {
		this.name = tN;
		this.food = food;
		this.rating = r;
	}

	public String getTruckName() {
		return name;
	}

	public void setTruckName(String truckName) {
		this.name = truckName;
	}

	public String getFoodType() {
		return food;
	}

	public void setFoodType(String foodType) {
		this.food = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String toString() {
		String output = "Truck Name: " + name + ", Food Type: " + food + ", Rating: " + rating;
		return output;
	}

	public void displayTruckInfo() {
		String truckData = this.toString();
		System.out.println(truckData);
	}

}
