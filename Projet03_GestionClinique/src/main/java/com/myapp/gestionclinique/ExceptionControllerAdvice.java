package com.myapp.gestionclinique;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.myapp.gestionclinique.exception.ObjetNullException;

@ControllerAdvice
public class ExceptionControllerAdvice {
	
	@ExceptionHandler(ObjetNullException.class)
	public  ResponseEntity<ErrorResponse> ObjetNullExceptionHandler(HttpServletRequest req, ObjetNullException e) 
	{
	    ErrorResponse error = new ErrorResponse(); 
	    error.message = e.getMessage();
	    return new ResponseEntity<ErrorResponse>(error, HttpStatus.BAD_REQUEST);
	    
	}

	class ErrorResponse {
	   public String message;
	}

}
