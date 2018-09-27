package com.lendingclub.rest;

import java.util.Arrays;

/**
 * Created by Oleg Kolodin on 8/5/18.
 */
public class FolioResponse<T> {
    int responseCode;
    FolioResponseType responseType;
    T value;
    boolean error;
    FolioError[] errors;


    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public FolioResponseType getResponseType() {
        return responseType;
    }

    public void setResponseType(FolioResponseType responseType) {
        this.responseType = responseType;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public FolioError[] getErrors() {
        return errors;
    }

    public void setErrors(FolioError[] errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        String valueOut = null;
        if (value != null) {
            if (value.getClass().isArray()) {
                valueOut = Arrays.deepToString((Object[])value);
            } else {
                valueOut = value.toString();
            }
        }

        return "FolioResponse{" +
                "responseCode=" + responseCode +
                ", responseType=" + responseType +
                ", value=" + valueOut +
                ", error=" + error +
                ", errors=" + Arrays.toString(errors) +
                '}';
    }
}
