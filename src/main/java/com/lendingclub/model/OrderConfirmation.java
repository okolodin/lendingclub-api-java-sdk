package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by tmichels on 12/8/14.
 */
public class OrderConfirmation {

    @JsonProperty("loanId")
    private Integer loanId;

    @JsonProperty("requestedAmount")
    private Integer requestedAmount;

    @JsonProperty("investedAmount")
    private Integer investedAmount;

    @JsonProperty("executionStatus")
    private List<ExecutionStatus> executionStatusList;

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public Integer getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(Integer requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public Integer getInvestedAmount() {
        return investedAmount;
    }

    public void setInvestedAmount(Integer investedAmount) {
        this.investedAmount = investedAmount;
    }

    public List<ExecutionStatus> getExecutionStatusList() {
        return executionStatusList;
    }

    public void setExecutionStatusList(List<ExecutionStatus> executionStatusList) {
        this.executionStatusList = executionStatusList;
    }
}
