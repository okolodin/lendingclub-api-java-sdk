package com.lendingclub.rest;

/**
 * Created by tmichels on 12/8/14.
 */
public class ApiError {
    String[] fields;
    String message;
    String apiErrorCode;

    public String[] getFields() {
        return fields;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getApiErrorCode() {
        return apiErrorCode;
    }

    public void setApiErrorCode(String apiErrorCode) {
        this.apiErrorCode = apiErrorCode;
    }
}
