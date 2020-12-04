package com.initialwebtech.billing.system.desktop.exception;


import com.initialwebtech.billing.system.desktop.dto.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    protected final Logger log = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> exception(Exception ex) {
        this.log.error("Exception: ", ex);
        ex.printStackTrace();
        return buildResponseEntity(new Response(ex), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NullPointerException.class)
    protected ResponseEntity<Object> handleNullPointerException(NullPointerException ex) {
        String debugMessage = "Exception: ";
        this.log.error(debugMessage, ex);
        ex.printStackTrace();
        return buildResponseEntity(new Response(ex), HttpStatus.OK);
    }


    private ResponseEntity<Object> buildResponseEntity(Response response, HttpStatus status) {
        return new ResponseEntity<>(response, status);
    }

}
