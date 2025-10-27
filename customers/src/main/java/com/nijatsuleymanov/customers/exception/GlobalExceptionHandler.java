package com.nijatsuleymanov.customers.exception;

import com.nijatsuleymanov.customers.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(CustomersAlreadyExistsException.class)
    public ResponseEntity<ErrorResponseDto> handleCustomersAlreadyExistsException(
            CustomersAlreadyExistsException ex, WebRequest request) {

        ErrorResponseDto errorResponseDto = new ErrorResponseDto(
             request.getDescription(false),
             HttpStatus.BAD_REQUEST,
             ex.getMessage(),
             LocalDateTime.now()
        );
        return new ResponseEntity<>(errorResponseDto, HttpStatus.BAD_REQUEST);

    }
}
