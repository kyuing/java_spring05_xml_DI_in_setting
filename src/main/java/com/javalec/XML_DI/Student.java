package com.javalec.XML_DI;

import java.util.ArrayList;

public class Student {

	private String name;
	private int age;
	private ArrayList<String> hobbies;
	private double height;
	private double weight;

	public Student(String name, int age, ArrayList<String> hobbies) {
		//a specified constructor
		this.name = name;
		this.age = age;
		this.hobbies = hobbies;
	}
	
	//we only need getters for name, age and hobbies since we are using the specified constructor
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public ArrayList<String> getHobbies() {
		return hobbies;
	}

	//but we need setters & getters for height and weight as there is no relevant parameter in the specified constructor
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}
	
}
