package com.in28minutes.jpa.hibernate.AdvancedJPA.exception.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.in28minutes.jpa.hibernate.AdvancedJPA.exception.ExceptionResponse;
import com.in28minutes.jpa.hibernate.AdvancedJPA.excption.CourseNotFoundException;

@RestControllerAdvice
public class GlobalControllerResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		ExceptionResponse exResponse = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		
		return new ResponseEntity<>(exResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(CourseNotFoundException.class)
	public final ResponseEntity<Object> handleResourseNotFoundException(CourseNotFoundException ex, WebRequest request) {
		ExceptionResponse errorResponse = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}
	
}
