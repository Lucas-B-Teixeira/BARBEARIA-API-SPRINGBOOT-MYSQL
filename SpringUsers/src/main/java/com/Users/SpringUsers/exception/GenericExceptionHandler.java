package com.Users.SpringUsers.exception;

import com.Users.SpringUsers.error.BaseBodyError;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.persistence.EntityNotFoundException;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class GenericExceptionHandler {

    @ExceptionHandler({ExceptionNotFound.class})
    public ResponseEntity<BaseBodyError> handlerEntityNotFoundException(EntityNotFoundException ex){
        BaseBodyError error = BaseBodyError.builder()
                .errorCode("Not Found")
                .message(ex.getMessage())
                .build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
