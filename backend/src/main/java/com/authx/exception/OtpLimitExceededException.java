package com.authx.exception;

public class OtpLimitExceededException extends RuntimeException{

    public OtpLimitExceededException(String message) {
        super(message);
    }
}
