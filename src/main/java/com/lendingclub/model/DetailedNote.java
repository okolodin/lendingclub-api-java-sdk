package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

/**
 * Created by tmichels on 12/8/14.
 */
public class DetailedNote {

    @JsonProperty("loanId")
    private Integer loanId;

    @JsonProperty("noteId")
    private Integer noteId;

    @JsonProperty("orderId")
    private Integer orderId;

    @JsonProperty("purpose")
    private String purpose;

    @JsonProperty("interestRate")
    private Number interestRate;

    @JsonProperty("portfolioId")
    private String portfolioId;

    @JsonProperty("portfolioName")
    private String portfolioName;

    @JsonProperty("loanLength")
    private Integer loanLength;

    @JsonProperty("loanStatus")
    private String loanStatus;

    @JsonProperty("grade")
    private String grade;

    @JsonProperty("currentPaymentStatus")
    private String currentPaymentStatus;

    @JsonProperty("canBeTraded")
    private Boolean canBeTraded;

    @JsonProperty("creditTrend")
    private String creditTrend;

    @JsonProperty("loanAmount")
    private BigDecimal loanAmount;

    @JsonProperty("noteAmount")
    private BigDecimal noteAmount;

    @JsonProperty("paymentsReceived")
    private BigDecimal paymentsReceived;

    @JsonProperty("accruedInterest")
    private BigDecimal accruedInterest;

    @JsonProperty("principalPending")
    private BigDecimal principalPending;

    @JsonProperty("interestPending")
    private BigDecimal interestPending;

    @JsonProperty("principalReceived")
    private BigDecimal principalReceived;

    @JsonProperty("interestReceived")
    private BigDecimal interestReceived;

    @JsonProperty("nextPaymentDate")
    private String nextPaymentDate;

    @JsonProperty("issueDate")
    private String issueDate;

    @JsonProperty("orderDate")
    private String orderDate;

    @JsonProperty("loanStatusDate")
    private String loanStatusDate;

    @JsonProperty("lastPaymentDate")
    private String lastPaymentDate;

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Number getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Number interestRate) {
        this.interestRate = interestRate;
    }

    public Integer getLoanLength() {
        return loanLength;
    }

    public void setLoanLength(Integer loanLength) {
        this.loanLength = loanLength;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCurrentPaymentStatus() {
        return currentPaymentStatus;
    }

    public void setCurrentPaymentStatus(String currentPaymentStatus) {
        this.currentPaymentStatus = currentPaymentStatus;
    }

    public Boolean getCanBeTraded() {
        return canBeTraded;
    }

    public void setCanBeTraded(Boolean canBeTraded) {
        this.canBeTraded = canBeTraded;
    }

    public String getCreditTrend() {
        return creditTrend;
    }

    public void setCreditTrend(String creditTrend) {
        this.creditTrend = creditTrend;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getNoteAmount() {
        return noteAmount;
    }

    public void setNoteAmount(BigDecimal noteAmount) {
        this.noteAmount = noteAmount;
    }

    public BigDecimal getPaymentsReceived() {
        return paymentsReceived;
    }

    public void setPaymentsReceived(BigDecimal paymentsReceived) {
        this.paymentsReceived = paymentsReceived;
    }

    public BigDecimal getAccruedInterest() {
        return accruedInterest;
    }

    public void setAccruedInterest(BigDecimal accruedInterest) {
        this.accruedInterest = accruedInterest;
    }

    public BigDecimal getPrincipalPending() {
        return principalPending;
    }

    public void setPrincipalPending(BigDecimal principalPending) {
        this.principalPending = principalPending;
    }

    public BigDecimal getInterestPending() {
        return interestPending;
    }

    public void setInterestPending(BigDecimal interestPending) {
        this.interestPending = interestPending;
    }

    public BigDecimal getPrincipalReceived() {
        return principalReceived;
    }

    public void setPrincipalReceived(BigDecimal principalReceived) {
        this.principalReceived = principalReceived;
    }

    public BigDecimal getInterestReceived() {
        return interestReceived;
    }

    public void setInterestReceived(BigDecimal interestReceived) {
        this.interestReceived = interestReceived;
    }

    public String getNextPaymentDate() {
        return nextPaymentDate;
    }

    public void setNextPaymentDate(String nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getLoanStatusDate() {
        return loanStatusDate;
    }

    public void setLoanStatusDate(String loanStatusDate) {
        this.loanStatusDate = loanStatusDate;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public String getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(String lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }
}
