package com.dbda;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// Creating a Scanner object to take input from the user via the keyboard
		Scanner scanner = new Scanner(System.in);

		// Creating a Phonebook object to store contacts and perform operations on them
		Phonebook phonebook = new Phonebook();

		// Infinite loop to keep the program running until the user chooses to exit
		while (true) {
			// Displaying the menu options to the user
			System.out.println("\nPhonebook Menu: ");
			System.out.println("1. Add a new contact ");
			System.out.println("2. Display all contacts ");
			System.out.println("3. Search Contact ");
			System.out.println("4. Delete a contact ");
			System.out.println("5. Exit ");
			System.out.println("Enter your choice: ");

			// Taking the user's choice as input
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consuming the newline left after nextInt()

			// Switch case to perform actions based on user's input
			switch (choice) {
			case 1:
				// Add a new contact
				System.out.println("Enter name: ");
				String name = scanner.next(); // Taking the contact's name
				System.out.println("Enter phone number: ");
				String phoneNumber = scanner.next(); // Taking the contact's phone number

				try {
					// Trying to add the contact to the phonebook
					phonebook.addContact(name, phoneNumber);
				} catch (ResourceNotFoundException e) {
					// Catching exceptions like invalid phone number or duplicate contact
					System.out.println(e.getMessage());
				}
				break;

			case 2:
				// Display all contacts in the phonebook
				System.out.println("Details");
				phonebook.displayContacts();
				break;

			case 3:
				// Search for a specific contact by name
				System.out.println("Enter the name to search: ");
				name = scanner.next(); // Taking the name to search
				Contact searchContact = null;

				try {
					// Trying to search for the contact by name
					searchContact = phonebook.searchContact(name);
				} catch (ResourceNotFoundException e) {
					// Catching exception if the contact is not found
					System.out.println(e.getMessage());
				}

				// Printing the search result (null if not found)
				System.out.println(searchContact);
				break;

			case 4:
				// Delete a contact from the phonebook
				System.out.println("Enter name to delete: ");
				name = scanner.next(); // Taking the name of the contact to delete

				try {
					// Trying to delete the contact from the phonebook
					phonebook.deleteContact(name);
				} catch (ResourceNotFoundException e) {
					// Catching exception if the contact is not found
					System.out.println(e.getMessage());
				}
				break;

			case 5:
				// Exit the program
				return; // Exiting the while loop and ending the program
			}
		}
	}
}
