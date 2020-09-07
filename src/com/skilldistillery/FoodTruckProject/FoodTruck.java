package com.skilldistillery.FoodTruckProject;

public class FoodTruck {
//Define a FoodTruck class with fields for a unique numeric ID
//Foodtruck {Name, Food Type, Rating.}
private String truckName;
private String foodType;
private double rating;

public FoodTruck(String tN, double r) {
	this.truckName = tN;
	this.rating = r;
}

public FoodTruck(String tN, String food, double r) {
	this.truckName = tN;
	this.foodType = food;
	this.rating = r;
}

public String getTruckName() {
	return truckName;
}

public void setTruckName(String truckName) {
	this.truckName = truckName;
}

public String getFoodType() {
	return foodType;
}

public void setFoodType(String foodType) {
	this.foodType = foodType;
}

public double getRating() {
	return rating;
}

public void setRating(double rating) {
	this.rating = rating;
}
	
}
