package org.amunawar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by sheik on 7/29/2018.
 */
@ControllerAdvice
public class GlobalExceptionHandlerMethods {
    @ExceptionHandler(value = NullPointerException.class)
    public String handleNullPointerException(Exception e){
        System.out.println("NullPointer Exception Occured"+e);
        return "NullPointerException";
    }

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception e){
        System.out.println("Generic Exception Occured"+e);
        return "NullPointerException";
    }
}
