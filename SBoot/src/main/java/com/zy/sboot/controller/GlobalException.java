package com.zy.sboot.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;

public class GlobalException extends Exception {
	private int code;
	private String message;

	public GlobalException(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	public GlobalException(){
	}

}
