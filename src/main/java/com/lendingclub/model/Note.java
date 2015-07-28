package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

/**
 * Created by tmichels on 12/8/14.
 */
public class Note {

    @JsonProperty("loanId")
    private BigDecimal loanId;
    @JsonProperty("noteId")
    private BigDecimal noteId;
    @JsonProperty("orderId")
    private BigDecimal orderId;
    @JsonProperty("interestRate")
    private BigDecimal interestRate;
    @JsonProperty("loanLength")
    private Integer loanLength;
    @JsonProperty("loanStatus")
    private String loanStatus;
    @JsonProperty("grade")
    private String grade;
    @JsonProperty("loanAmount")
    private BigDecimal loanAmount;
    @JsonProperty("noteAmount")
    private BigDecimal noteAmount;
    @JsonProperty("paymentsReceived")
    private BigDecimal paymentsReceived;
    @JsonProperty("issueDate")
    private String issueDate;
    @JsonProperty("orderDate")
    private String orderDate;
    @JsonProperty("loanStatusDate")
    private String loanStatusDate;
    @JsonProperty("subGrade")
    private String subGrade;

    public BigDecimal getLoanId() {
        return loanId;
    }

    public void setLoanId(BigDecimal loanId) {
        this.loanId = loanId;
    }

    public BigDecimal getNoteId() {
        return noteId;
    }

    public void setNoteId(BigDecimal noteId) {
        this.noteId = noteId;
    }

    public BigDecimal getOrderId() {
        return orderId;
    }

    public void setOrderId(BigDecimal orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
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

    public String getSubGrade() {
        return subGrade;
    }

    public void setSubGrade(String subGrade) {
        this.subGrade = subGrade;
    }
}
