package com.lendingclub.rest;

/**
 * Created by tmichels on 12/8/14.
 */
public class ApiException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    int code;
    String message;
    public ApiException(int code, String message) {
        super();
        this.code = code;
        this.message = message;
    }
    public int getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
}
