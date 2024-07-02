package com.codingdojo.FruityLoops.models;

public class Fruits {
	private String name;
	private double price;
	
//	constructor
	public Fruits(String name, double price) {
		this.name = name;
		this.price = price;
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	
}
