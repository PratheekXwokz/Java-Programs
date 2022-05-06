package com.xworkz.furniture.exceptions;

public class FurnitureIsFullException extends RuntimeException {

	public FurnitureIsFullException() {
	}

	public FurnitureIsFullException(String msg) {
		super(msg);
	}
}
