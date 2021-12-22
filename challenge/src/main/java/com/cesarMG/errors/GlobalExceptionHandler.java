package com.cesarMG.errors;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * @author cmunozg
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {


	 @ExceptionHandler(GenericException.class)
	 public ResponseEntity<?> excepGeneric(GenericException ex, WebRequest request) {
         Error error = new Error(new Date(), ex.getMessage(), request.getDescription(false));
         return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	 }
	
	 @ExceptionHandler(Exception.class)
	    public ResponseEntity<?> excpGeneral(Exception ex, WebRequest request) {
	        Error errorDetails = new Error(new Date(), ex.getMessage(), request.getDescription(false));
	        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	
}
