package com.dbda;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Phonebook phonebook = new Phonebook();
		
		while (true)
		{
			System.out.println("\nPhonebook Menu: ");
			System.out.println("1. Add a new contact ");
			System.out.println("2. Display all contacts ");
			System.out.println("3. Search Contact ");
			System.out.println("4. Delete a contact ");
			System.out.println("5. Exit ");
			System.out.println("Enter your choice: ");
			
			int choice = scanner.nextInt();
			scanner.nextLine(); //Consume newline
			{
				switch (choice)
				{
				case 1:
					System.out.println("Enter name: ");
					String name = scanner.next();
					System.out.println("Enter phone number: ");
					String phoneNumber = scanner.next();
					try {
						phonebook.addContact(name, phoneNumber);
					} catch (ResourceNotFoundException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					break;
					
				case 2:
					System.out.println("Details");
					phonebook.displayContacts();
					break;
					
				case 3:
					System.out.println("Enter the name to search: ");
					name = scanner.next();
					Contact searchContact = null;
					try {
						searchContact = phonebook.searchContact(name);
					} catch (ResourceNotFoundException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					System.out.println(searchContact);
					break;
					
				case 4:
					System.out.println("Enter name to delete: ");
					name = scanner.next();
					try {
						phonebook.deleteContact(name);
					} catch (ResourceNotFoundException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					break;
					
				case 5:
					//System.exit(0);
					return;
				}
			
			
			}

		}
	}
}
