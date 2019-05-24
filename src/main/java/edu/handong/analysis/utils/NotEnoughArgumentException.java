package edu.handong.analysis.utils;

public class NotEnoughArgumentException extends Exception {
	
	public NotEnoughArgumentException() {
		super("Not Enough ArgumentException");
	}
	
	public NotEnoughArgumentException(String message) {
		super(message);
	}
}
