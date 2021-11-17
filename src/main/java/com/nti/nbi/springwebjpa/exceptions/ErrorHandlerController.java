package com.nti.nbi.springwebjpa.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlerController {

    @ExceptionHandler(value = {NullPointerException.class})
    public ResponseEntity<?> npeHandler(NullPointerException exception){
        exception.printStackTrace();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("null pointer exception");
    }

    @ExceptionHandler(value = {ResourceNotFoundException.class})
    public ResponseEntity<?> notFoundHandler(ResourceNotFoundException exception){
        exception.printStackTrace();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }
}
