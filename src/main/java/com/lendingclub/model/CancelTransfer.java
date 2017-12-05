package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by tmichels on 2/18/15.
 */
public class CancelTransfer {

    @JsonProperty("transferId")
    private Integer transferId;
    @JsonProperty("status")
    private String status;
    @JsonProperty("message")
    private String message;

    public Integer getTransferId() {
        return transferId;
    }

    public void setTransferId(Integer transferId) {
        this.transferId = transferId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
