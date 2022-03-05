package com.superhan.dvdrentalspringbootbackend.common.exception;

public class BaseException extends Exception {

    public BaseException() {
        super();
    }

    public BaseException(String message) { super(message); }

    public BaseException(String message, Exception e) { super(message, e); }
}
