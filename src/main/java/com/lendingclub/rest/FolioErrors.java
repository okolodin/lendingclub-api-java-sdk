package com.lendingclub.rest;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Arrays;

/**
 * Created by Oleg Kolodin on 8/5/18.
 */
public class FolioErrors {
    @JsonProperty(value = "errors")
    FolioError[] errors;

    public FolioError[] getErrors() {
        return errors;
    }

    public void setErrors(FolioError[] errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "FolioErrors{" +
                "errors=" + Arrays.toString(errors) +
                '}';
    }
}
