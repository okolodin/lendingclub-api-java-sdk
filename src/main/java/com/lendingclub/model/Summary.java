package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

/**
 * Created by tmichels on 12/8/14.
 */
public class Summary {

    @JsonProperty("investorId")
    private Integer investorId;
    @JsonProperty("availableCash")
    private BigDecimal availableCash;
    @JsonProperty("accountTotal")
    private BigDecimal accountTotal;
    @JsonProperty("accruedInterest")
    private BigDecimal accruedInterest;
    @JsonProperty("infundingBalance")
    private BigDecimal infundingBalance;
    @JsonProperty("receivedInterest")
    private BigDecimal receivedInterest;
    @JsonProperty("receivedPrincipal")
    private BigDecimal receivedPrincipal;
    @JsonProperty("receivedLateFees")
    private BigDecimal receivedLateFees;
    @JsonProperty("outstandingPrincipal")
    private BigDecimal outstandingPrincipal;
    @JsonProperty("totalNotes")
    private Integer totalNotes;
    @JsonProperty("totalPortfolios")
    private Integer totalPortfolios;

    public Integer getInvestorId() {
        return investorId;
    }

    public void setInvestorId(Integer investorId) {
        this.investorId = investorId;
    }

    public BigDecimal getAvailableCash() {
        return availableCash;
    }

    public void setAvailableCash(BigDecimal availableCash) {
        this.availableCash = availableCash;
    }

    public BigDecimal getAccountTotal() {
        return accountTotal;
    }

    public void setAccountTotal(BigDecimal accountTotal) {
        this.accountTotal = accountTotal;
    }

    public BigDecimal getAccruedInterest() {
        return accruedInterest;
    }

    public void setAccruedInterest(BigDecimal accruedInterest) {
        this.accruedInterest = accruedInterest;
    }

    public BigDecimal getInfundingBalance() {
        return infundingBalance;
    }

    public void setInfundingBalance(BigDecimal infundingBalance) {
        this.infundingBalance = infundingBalance;
    }

    public BigDecimal getReceivedInterest() {
        return receivedInterest;
    }

    public void setReceivedInterest(BigDecimal receivedInterest) {
        this.receivedInterest = receivedInterest;
    }

    public BigDecimal getReceivedPrincipal() {
        return receivedPrincipal;
    }

    public void setReceivedPrincipal(BigDecimal receivedPrincipal) {
        this.receivedPrincipal = receivedPrincipal;
    }

    public BigDecimal getReceivedLateFees() {
        return receivedLateFees;
    }

    public void setReceivedLateFees(BigDecimal receivedLateFees) {
        this.receivedLateFees = receivedLateFees;
    }

    public BigDecimal getOutstandingPrincipal() {
        return outstandingPrincipal;
    }

    public void setOutstandingPrincipal(BigDecimal outstandingPrincipal) {
        this.outstandingPrincipal = outstandingPrincipal;
    }

    public Integer getTotalNotes() {
        return totalNotes;
    }

    public void setTotalNotes(Integer totalNotes) {
        this.totalNotes = totalNotes;
    }

    public Integer getTotalPortfolios() {
        return totalPortfolios;
    }

    public void setTotalPortfolios(Integer totalPortfolios) {
        this.totalPortfolios = totalPortfolios;
    }

    @Override
    public String toString(){
        return "investorId: " + investorId;
    }
}
