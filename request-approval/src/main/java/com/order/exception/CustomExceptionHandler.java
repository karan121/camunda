package com.order.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CustomExceptionHandler {
	
	 @ExceptionHandler(Exception.class)
	   public ResponseEntity<Object> exception(RuntimeException ex, WebRequest request) {
		 System.out.println(ex);
		 System.out.println(request);
	      return new ResponseEntity<>(ex, HttpStatus.NOT_FOUND);
	   }

}
