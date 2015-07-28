package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by tmichels on 3/2/15.
 */
public class CancelTransferRequest {

    @JsonProperty("transferIds")
    private List<Long> transferIds;

    public List<Long> getTransferIds() {
        return transferIds;
    }

    public void setTransferIds(List<Long> transferIds) {
        this.transferIds = transferIds;
    }
}
