package com.dbda;

import java.util.ArrayList;

public class Phonebook {

	// ArrayList to store multiple Contact objects
	private ArrayList<Contact> contacts = new ArrayList<>();

	// Constructor to initialize the contacts list when a Phonebook object is
	// created
	public Phonebook() {
		contacts = new ArrayList<>();
	}

	// Method to add a contact to the phonebook
	// Throws a ResourceNotFoundException if there are issues like name being null,
	// the name already exists, or the phone number is invalid
	public void addContact(String name, String phoneNumber) throws ResourceNotFoundException {

		// Check if the name is null or empty
		if (name == null) {
			throw new ResourceNotFoundException("Name cannot be empty.");
		}

		// Check if the contact with this name already exists in the phonebook
		if (searchContact(name) != null) {
			throw new ResourceNotFoundException("Name already exists in Phonebook.");
		}

		// Check if the phone number is valid (should be exactly 10 digits)
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new ResourceNotFoundException("Enter a valid phone number.");
		}

		// Create a new Contact object and add it to the contacts list
		Contact newContact = new Contact(name, phoneNumber);
		contacts.add(newContact);
		System.out.println("Contact added successfully.");
	}

	// Method to display all contacts in the phonebook
	public void displayContacts() {
		// Check if the contacts list is empty
		if (contacts.isEmpty()) {
			System.out.println("Phonebook is empty.");
		} else {
			// Loop through the contacts list and print each contact
			System.out.println("Contacts in the phonebook: ");
			for (Contact contact : contacts) {
				System.out.println(contact); // Calls the toString() method from Contact class
			}
		}
	}

	// Method to search for a contact by name
	// Returns the Contact object if found, or null if not found
	// Throws a ResourceNotFoundException if the contact is not found
	public Contact searchContact(String name) throws ResourceNotFoundException {
		// Loop through the contacts list to find a matching contact by name
		for (Contact contact : contacts) {
			if (contact.getName().equalsIgnoreCase(name)) {
				return contact; // Return the found contact
			}
		}
		// Return null if the contact is not found
		return null;
	}

	// Method to delete a contact by name
	// Throws a ResourceNotFoundException if the contact is not found
	public void deleteContact(String name) throws ResourceNotFoundException {
		// Try to find the contact using the searchContact method
		Contact contactToRemove = searchContact(name);

		// If the contact is found, remove it from the contacts list
		if (contactToRemove != null) {
			contacts.remove(contactToRemove);
			System.out.println("Contact deleted successfully.");
		} else {
			// If the contact is not found, throw an exception
			throw new ResourceNotFoundException("Contact not found.");
		}
	}
}
