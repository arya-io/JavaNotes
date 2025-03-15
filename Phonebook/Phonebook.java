package com.dbda;

import java.util.ArrayList;

public class Phonebook {
	
	private ArrayList<Contact> contacts= new ArrayList<>();
	
	public Phonebook() {
		contacts=new ArrayList<>();
	}

	public void addContact(String name, String phoneNumber) throws ResourceNotFoundException{
		
		if (name == null) {
			throw new ResourceNotFoundException("Name cannot be empty.");
		}
		
		if (searchContact(name) !=null) {
			throw new ResourceNotFoundException("Name already exist in PhoneBook.");
		}
		
		if (phoneNumber == null || phoneNumber.length()!=10) {
			throw new ResourceNotFoundException("Enter valid phone number.");
		}
		
		Contact newContact = new Contact(name, phoneNumber);
		contacts.add(newContact);
		System.out.println("Contact added successfully.");
		
	}
	
	public void displayContacts() {
		if (contacts.isEmpty()) {
			System.out.println("Phonebook is empty.");
		}
		else {
			System.out.println("Contacts in the phonebook: ");
			for (Contact contacts : contacts) {
				System.out.println(contacts);
			}
		}
	}

	
	public Contact searchContact(String name) throws ResourceNotFoundException {
		for (Contact contact : contacts) {
			if (contact.getName().equalsIgnoreCase(name)) {
				return contact;
			}
		}
		
			return null;
	}
	
	
	public void deleteContact(String name) throws ResourceNotFoundException {
		Contact contactToRemove = searchContact(name);
		
		if (contactToRemove != null) {
			contacts.remove(contactToRemove);
			System.out.println("Contact deleted successfully.");
		}
	}

}
