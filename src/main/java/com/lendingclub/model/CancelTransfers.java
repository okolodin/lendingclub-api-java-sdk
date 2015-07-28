package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by tmichels on 2/18/15.
 */
public class CancelTransfers {

    @JsonProperty("cancelTransfers")
    private List<CancelTransfer> cancelTransferList;

    @JsonProperty("investorId")
    private String investorId;

    public List<CancelTransfer> getCancelTransferList() {
        return cancelTransferList;
    }

    public void setCancelTransferList(List<CancelTransfer> cancelTransferList) {
        this.cancelTransferList = cancelTransferList;
    }

    public String getInvestorId() {
        return investorId;
    }

    public void setInvestorId(String investorId) {
        this.investorId = investorId;
    }
}
