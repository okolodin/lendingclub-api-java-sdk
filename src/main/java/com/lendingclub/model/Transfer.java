package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by tmichels on 2/18/15.
 */
public class Transfer {

    @JsonProperty("transferId")
    private Integer transferId;
    @JsonProperty("transferDate")
    private Date transferDate;
    @JsonProperty("amount")
    private BigDecimal amount;
    @JsonProperty("sourceAccount")
    private String sourceAccount;
    @JsonProperty("status")
    private String status;
    @JsonProperty("frequency")
    private String frequency;
    @JsonProperty("endDate")
    private Date endDate;
    @JsonProperty("operation")
    private String operation;
    @JsonProperty("cancellable")
    private Boolean cancellable;

    public Integer getTransferId() {
        return transferId;
    }

    public void setTransferId(Integer transferId) {
        this.transferId = transferId;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Boolean getCancellable() {
        return cancellable;
    }

    public void setCancellable(Boolean cancellable) {
        this.cancellable = cancellable;
    }

}
