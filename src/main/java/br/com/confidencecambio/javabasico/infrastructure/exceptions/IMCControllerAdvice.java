package br.com.confidencecambio.javabasico.infrastructure.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class IMCControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<FieldErrorResponse>> parameterNotProvidedHandler(MethodArgumentNotValidException ex){
        List<FieldError> errors = ex.getBindingResult().getFieldErrors();
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(
                        errors
                                .stream()
                                .map(f -> new FieldErrorResponse(f.getField(),f.getDefaultMessage()))
                                .collect(Collectors.toList()));
    }
}
