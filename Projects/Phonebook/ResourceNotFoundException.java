package com.dbda;

// This class defines a custom exception named ResourceNotFoundException
// It extends the Exception class, meaning it is a checked exception (must be handled or declared)
public class ResourceNotFoundException extends Exception {

	// Constructor that accepts a custom error message when the exception is thrown
	public ResourceNotFoundException(String message) {
		// Calls the parent constructor (Exception class) and passes the message to it
		super(message);
	}

}
