package com.lendingclub.rest;

public class ResourceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceException(Throwable e) {
		super(e);
	}

	public ResourceException() {
		super();
	}

	
}
