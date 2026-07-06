package com.authx.exception;

public class OtpExpiredException extends RuntimeException{

    public OtpExpiredException(String message) {
        super(message);
    }
}
