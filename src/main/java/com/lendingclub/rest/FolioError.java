package com.lendingclub.rest;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Oleg Kolodin on 8/5/18.
 */
public class FolioError {
    @JsonProperty(value = "code")
    String code;
    @JsonProperty(value = "field")
    String field;
    @JsonProperty(value = "message")
    String message;
    /**
     * recoverability has been spotted in Folio Order Reprice error responses
     */
    @JsonProperty(value = "recoverability")
    String recoverability;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecoverability() {
        return recoverability;
    }

    public void setRecoverability(String recoverability) {
        this.recoverability = recoverability;
    }

    @Override
    public String toString() {
        return "FolioError{" +
                "code='" + code + '\'' +
                ", field='" + field + '\'' +
                ", message='" + message + '\'' +
                ", recoverability='" + recoverability + '\'' +
                '}';
    }
}
