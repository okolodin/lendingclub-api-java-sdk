package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by tmichels on 2/18/15.
 */
public class Funds {

    @JsonProperty("investorId")
    private Integer investorId;
    @JsonProperty("transferId")
    private Integer transferId;
    @JsonProperty("amount")
    private BigDecimal amount;
    @JsonProperty("transferFrequency")
    private TransferFrequency transferFrequency;
    @JsonProperty("startDate")
    private Date startDate;
    @JsonProperty("endDate")
    private Date endDate;
    @JsonProperty("estimatedFundsTransferDate")
    private Date estimatedFundsTransferDate;

    public Integer getInvestorId() {
        return investorId;
    }

    public void setInvestorId(Integer investorId) {
        this.investorId = investorId;
    }

    public Integer getTransferId() { return transferId; }

    public void setTransferId(Integer transferId) { this.transferId = transferId;}

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public TransferFrequency getTransferFrequency() {
        return transferFrequency;
    }

    public void setTransferFrequency(TransferFrequency transferFrequency) {
        this.transferFrequency = transferFrequency;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEstimatedFundsTransferDate() {
        return estimatedFundsTransferDate;
    }

    public void setEstimatedFundsTransferDate(Date estimatedFundsTransferDate) {
        this.estimatedFundsTransferDate = estimatedFundsTransferDate;
    }
}
