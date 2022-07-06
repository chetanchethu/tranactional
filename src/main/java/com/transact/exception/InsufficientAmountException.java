package com.transact.exception;

public class InsufficientAmountException extends RuntimeException {
	public InsufficientAmountException(String msg) {
		super(msg);
	}
}
