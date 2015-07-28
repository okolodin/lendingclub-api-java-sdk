package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by tmichels on 12/8/14.
 */
public class Loans {

    @JsonProperty("asOfDate")
    private String asOfDate;

    @JsonProperty("loans")
    private List<Loan> loans;

    public String getAsOfDate() {
        return asOfDate;
    }

    public void setAsOfDate(String asOfDate) {
        this.asOfDate = asOfDate;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }
}
