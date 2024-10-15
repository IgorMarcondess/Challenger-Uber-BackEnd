package com.marcondez.email_service.core.exceptions;

public class EmailServiceException extends RuntimeException{

    public EmailServiceException(String message) {
        super(message);
    }

    public EmailServiceException(String message, Throwable cause){
        //Buscando message e a causa do construtor do RuntimeExeception
        super(message, cause);
    }
}
