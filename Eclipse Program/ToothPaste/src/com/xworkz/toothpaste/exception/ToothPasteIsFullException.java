package com.xworkz.toothpaste.exception;

public class ToothPasteIsFullException extends RuntimeException{
	public ToothPasteIsFullException() {
		
	}
	public ToothPasteIsFullException(String msg) {
		super(msg);
	}

}
