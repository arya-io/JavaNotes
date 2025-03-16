package com.dbda;

public class Contact {

	// Private variables to store the contact's name and phone number
	private String name;
	private String phoneNumber;

	// Getter method for the name
	public String getName() {
		return name;
	}

	// Setter method for the name
	public void setName(String name) {
		this.name = name;
	}

	// Getter method for the phone number
	public String getPhoneNumber() {
		return phoneNumber;
	}

	// Setter method for the phone number
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// Default constructor (no arguments)
	// This creates an empty contact without initializing the name or phone number
	public Contact() {
		super(); // Calls the parent class constructor (in this case, it's Object class)
	}

	// Constructor with arguments to initialize a contact with name and phone number
	public Contact(String name, String phoneNumber) {
		super(); // Calls the parent class constructor
		this.name = name; // Initializes the contact's name
		this.phoneNumber = phoneNumber; // Initializes the contact's phone number
	}

	// toString() method to return a string representation of the contact
	// When this method is called, it returns a readable format of the contact's
	// details
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

}
