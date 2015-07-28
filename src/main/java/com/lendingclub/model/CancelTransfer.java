package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by tmichels on 2/18/15.
 */
public class CancelTransfer {

    @JsonProperty("transferIds")
    private Integer transferIds;
    @JsonProperty("status")
    private String status;
    @JsonProperty("message")
    private String message;

    public Integer getTransferIds() {
        return transferIds;
    }

    public void setTransferIds(Integer transferId) {
        this.transferIds = transferId;
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
