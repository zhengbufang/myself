package com.zy.sboot.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.coyote.http11.Http11AprProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
	  @Value("${zy}")
      String message;
	  @ExceptionHandler(value=GlobalException.class)
	  @ResponseBody
	  public Map defaultExceptionHandler(HttpServletRequest request,Exception ex){
		  Map<Object,String> errorMap = new HashMap<Object,String>();
		  errorMap.put("code",ex.getMessage());
		  errorMap.put("message", message);
		  return errorMap;
	  }
}
