package com.training.exceptions;

public class RangeCheckException extends Exception {
	private String message;

	public RangeCheckException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return "Range Check Exception "+ this.message;
	}
	

}
