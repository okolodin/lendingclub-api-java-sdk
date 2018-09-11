package com.lendingclub.model.folio;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Folio listing.
 *
 * Real example:
 * <pre>
 *     Listing{noteId='167204093', outstandingPrincipal='18.8513674997', accruedInterest='0.13139926796597223', loanStatus='Current', price='18.92', markupOrDiscount='-0.0033', yieldToMaturity='0.0989', daysSinceLastPayment='18', creditScoreTrend='DOWN', ficoEndRangeHigh='634', ficoEndRangeLow='630', listingStartDate='2018-08-04T22:19:53.000-07:00', expirationDate='2018-08-11T00:00:00.000-07:00', isNeverLate='true', subGrade='B4', term='36', originalNoteAmount='25.0', interestRate='0.1091', remainingPayments='26', applicationType='INDIVIDUAL'}
 * </pre>
 * Created by Oleg Kolodin on 8/5/18.
 */
public class Listing {

    @JsonProperty("noteId")
    private String noteId;

    /**
     * Loan ID is present only in orders endpoint, not in the listing
     */
    @JsonProperty("loanId")
    private String loanId;

    @JsonProperty("outstandingPrincipal")
    private String outstandingPrincipal;

    @JsonProperty("accruedInterest")
    private String accruedInterest;

    // loanStatus could be a constant/enum
    @JsonProperty("loanStatus")
    private String loanStatus;

    @JsonProperty("price")
    private String price;

    @JsonProperty("markupOrDiscount")
    private String markupOrDiscount;

    @JsonProperty("yieldToMaturity")
    private String yieldToMaturity;

    @JsonProperty("daysSinceLastPayment")
    private String daysSinceLastPayment;

    @JsonProperty("creditScoreTrend")
    private String creditScoreTrend;

    @JsonProperty("ficoEndRangeHigh")
    private String ficoEndRangeHigh;

    @JsonProperty("ficoEndRangeLow")
    private String ficoEndRangeLow;

    @JsonProperty("listingStartDate")
    private String listingStartDate;

    @JsonProperty("expirationDate")
    private String expirationDate;

    @JsonProperty("isNeverLate")
    private String isNeverLate;

    @JsonProperty("subGrade")
    private String subGrade;

    @JsonProperty("term")
    private String term;

    @JsonProperty("originalNoteAmount")
    private String originalNoteAmount;

    @JsonProperty("interestRate")
    private String interestRate;

    @JsonProperty("remainingPayments")
    private String remainingPayments;

    @JsonProperty("applicationType")
    private String applicationType;

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getOutstandingPrincipal() {
        return outstandingPrincipal;
    }

    public void setOutstandingPrincipal(String outstandingPrincipal) {
        this.outstandingPrincipal = outstandingPrincipal;
    }

    public String getAccruedInterest() {
        return accruedInterest;
    }

    public void setAccruedInterest(String accruedInterest) {
        this.accruedInterest = accruedInterest;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMarkupOrDiscount() {
        return markupOrDiscount;
    }

    public void setMarkupOrDiscount(String markupOrDiscount) {
        this.markupOrDiscount = markupOrDiscount;
    }

    public String getYieldToMaturity() {
        return yieldToMaturity;
    }

    public void setYieldToMaturity(String yieldToMaturity) {
        this.yieldToMaturity = yieldToMaturity;
    }

    public String getDaysSinceLastPayment() {
        return daysSinceLastPayment;
    }

    public void setDaysSinceLastPayment(String daysSinceLastPayment) {
        this.daysSinceLastPayment = daysSinceLastPayment;
    }

    public String getCreditScoreTrend() {
        return creditScoreTrend;
    }

    public void setCreditScoreTrend(String creditScoreTrend) {
        this.creditScoreTrend = creditScoreTrend;
    }

    public String getFicoEndRangeHigh() {
        return ficoEndRangeHigh;
    }

    public void setFicoEndRangeHigh(String ficoEndRangeHigh) {
        this.ficoEndRangeHigh = ficoEndRangeHigh;
    }

    public String getFicoEndRangeLow() {
        return ficoEndRangeLow;
    }

    public void setFicoEndRangeLow(String ficoEndRangeLow) {
        this.ficoEndRangeLow = ficoEndRangeLow;
    }

    public String getListingStartDate() {
        return listingStartDate;
    }

    public void setListingStartDate(String listingStartDate) {
        this.listingStartDate = listingStartDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getIsNeverLate() {
        return isNeverLate;
    }

    public void setIsNeverLate(String isNeverLate) {
        this.isNeverLate = isNeverLate;
    }

    public String getSubGrade() {
        return subGrade;
    }

    public void setSubGrade(String subGrade) {
        this.subGrade = subGrade;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getOriginalNoteAmount() {
        return originalNoteAmount;
    }

    public void setOriginalNoteAmount(String originalNoteAmount) {
        this.originalNoteAmount = originalNoteAmount;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getRemainingPayments() {
        return remainingPayments;
    }

    public void setRemainingPayments(String remainingPayments) {
        this.remainingPayments = remainingPayments;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    @Override
    public String toString() {
        return "Listing{" +
                "noteId='" + noteId + '\'' +
                ", loanId='" + loanId + '\'' +
                ", outstandingPrincipal='" + outstandingPrincipal + '\'' +
                ", accruedInterest='" + accruedInterest + '\'' +
                ", loanStatus='" + loanStatus + '\'' +
                ", price='" + price + '\'' +
                ", markupOrDiscount='" + markupOrDiscount + '\'' +
                ", yieldToMaturity='" + yieldToMaturity + '\'' +
                ", daysSinceLastPayment='" + daysSinceLastPayment + '\'' +
                ", creditScoreTrend='" + creditScoreTrend + '\'' +
                ", ficoEndRangeHigh='" + ficoEndRangeHigh + '\'' +
                ", ficoEndRangeLow='" + ficoEndRangeLow + '\'' +
                ", listingStartDate='" + listingStartDate + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", isNeverLate='" + isNeverLate + '\'' +
                ", subGrade='" + subGrade + '\'' +
                ", term='" + term + '\'' +
                ", originalNoteAmount='" + originalNoteAmount + '\'' +
                ", interestRate='" + interestRate + '\'' +
                ", remainingPayments='" + remainingPayments + '\'' +
                ", applicationType='" + applicationType + '\'' +
                '}';
    }
}
