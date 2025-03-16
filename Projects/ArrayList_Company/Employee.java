package profiles;

//Abstract class representing an Employee
public abstract class Employee {
	protected String name, address, gender; // Employee attributes
	protected int age;
	protected float basicSalary;

	// Constructor to initialize employee details
	public Employee(String name, String address, int age, String gender, float basicSalary) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.basicSalary = basicSalary;
	}

	// Method to display employee details - can be overridden in subclasses
	public void displayDetails() {
		System.out.println("Employee Name: " + this.getName());
		System.out.println("Employee Address: " + this.getAddress());
		System.out.println("Employee Age: " + this.getAge());
		System.out.println("Employee Gender: " + this.getGender());
		System.out.println("Employee Basic Salary: " + this.getBasicSalary());
	}

	// Getters for employee attributes
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public float getBasicSalary() {
		return basicSalary;
	}
}
