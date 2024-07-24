package com.usp.banking.handler;

import com.usp.banking.exception.ApplicationException;
import com.usp.banking.ui.dto.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
@Slf4j
public class TsExceptionHandler {

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<?> handleApplicationException(ApplicationException ex, WebRequest req){
        ErrorResponse response = new ErrorResponse(ex.getErrorcode(),ex.getMessage());
        response.setErrDateTime(LocalDateTime.now());
        log.info("Getting Exception"+ex.getMessage(),ex);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
