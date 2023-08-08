package com.inditex.ws;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.inditex.ws.model.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(InputErrorException.class)
	public ResponseEntity<ErrorResponse> handleErrorException(InputErrorException ex) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
        System.out.println("status:"+HttpStatus.BAD_REQUEST.value());
        System.out.println("exmesage:"+ex.getMessage());

        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
	

}


