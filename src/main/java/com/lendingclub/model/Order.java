package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

/**
 * Created by tmichels on 12/8/14.
 */
public class Order {

    @JsonProperty("aid")
    private Integer aid;
    @JsonProperty("loanId")
    private Integer loanId;
    @JsonProperty("requestedAmount")
    private BigDecimal requestAmount;
    @JsonProperty("portfolioId")
    private Integer portfolioId;

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public BigDecimal getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(BigDecimal requestAmount) {
        this.requestAmount = requestAmount;
    }

    public Integer getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Integer portfolioId) {
        this.portfolioId = portfolioId;
    }
}
