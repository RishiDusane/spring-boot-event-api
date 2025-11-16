package com.exam.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.exam.DTO.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	
	ResponseEntity<?> getResourceNotFoundException (ResourceNotFoundException r){
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(new ApiResponse("Failed", "Resource Not found" + r.getMessage()));
	}
	
@ExceptionHandler(RuntimeException.class)
	
	ResponseEntity<?> getRuntimeException (RuntimeException r){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(new ApiResponse("Failed", "Runtime Error" + r.getMessage()));
	}
}
