package com.dbda;
// This is custom exception , exception comes under throwable
public class ResourceNotFoundException extends Exception{ //Custom unchecked exception

	public ResourceNotFoundException(String message) {
		super(message);
	}

}
