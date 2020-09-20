package com.training.exceptions;

public class MyCustomException extends Exception {
	private String message ;
	private Throwable errorMessage;
	public MyCustomException(String message, Throwable errorMessage) {
		super();
		this.message = message;
		this.errorMessage = errorMessage;
	}
	public String getMessage() {
		// TODO Auto-generated method stub
		return "My custom Exception " + this.message;
	}

	


	
}
