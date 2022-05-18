package com.xworkz.powerconsumption.exception;

public class CustomerAlreadyExistException extends RuntimeException {

	public CustomerAlreadyExistException() {

	}

	public CustomerAlreadyExistException(String msg) {
		super(msg);
	}
}

