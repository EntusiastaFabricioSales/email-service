package com.sales.emailservice.core.exceptions;

public class EmailServiceExceptions extends RuntimeException{

    public EmailServiceExceptions(String message)
    {
        super(message);
    }
    
    public EmailServiceExceptions(String message, Throwable cause)
    {
        super(message, cause);
    }
}
