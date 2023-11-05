package com.unifesp.testCasePrioritization.Controller;

import com.unifesp.testCasePrioritization.Entities.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ExceptionHandlerController {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorMessage exceptionHandler(MethodArgumentNotValidException ex, WebRequest request){

        ErrorMessage er = new ErrorMessage(
          HttpStatus.BAD_REQUEST.value(),
          new Date(),
          errorList(ex.getBindingResult().getFieldErrors()),
          request.getDescription(false)
        );
        return er;
    }
    private List<String> errorList(List<FieldError> error){
        List<String> mensagens = new ArrayList<>();
        for (FieldError f : error){
            mensagens.add(f.getDefaultMessage());
        }
        //remove mensagens de erro duplicadas da lista de erros e retorna a lista
        return mensagens.stream().distinct().collect(Collectors.toList());
    }
}