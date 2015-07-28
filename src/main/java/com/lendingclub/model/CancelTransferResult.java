package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by tmichels on 3/2/15.
 */
public class CancelTransferResult {

    @JsonProperty("investorId")
    private String investorId;
    @JsonProperty("cancellationResults")
    private List<CancelTransfer> cancellationResults;

    public String getInvestorId() {
        return investorId;
    }

    public void setInvestorId(String investorId) {
        this.investorId = investorId;
    }

    public List<CancelTransfer> getCancellationResults() {
        return cancellationResults;
    }

    public void setCancellationResults(List<CancelTransfer> cancellationResults) {
        this.cancellationResults = cancellationResults;
    }
}
