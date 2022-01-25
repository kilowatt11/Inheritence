package com.pnc.models;

public class Monster {
	
	//Fields
	private String name;
	
	//methods
	public String attack() {
		return "!^_&^$@+%$* I don't know how to attack!";
	}

	//constructors
	public Monster() {} //default
	
	public Monster(String name) {
		this.name = name;
	}
	
	//Getters & Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}//class
