package com.lendingclub.model;

/**
 * Created by tmichels on 12/8/14.
 */
public enum ExecutionStatus {

    ORDER_FULFILLED("ORDER_FULFILLED", "Order Fulfilled"),
    LOAN_AMOUNT_EXCEEDED("LOAN_AMOUNT_EXCEEDED", "Loan Amount Exceeded"),
    NOT_AN_IN_FUNDING_LOAN("NOT_AN_IN_FUNDING_LOAN", "Not An In Funding Loan"),
    REQUESTED_AMNT_LOW("REQUESTED_AMNT_LOW", "Requested Amount Low"),
    REQUESTED_AMNT_ROUNDED("REQUESTED_AMNT_ROUNDED", "Requested Amount Rounded"),
    AUGMENTED_BY_MERGE("AUGMENTED_BY_MERGE", "Augmented By Merge"),
    ELIM_BY_MERGE("ELIM_BY_MERGE", "Eliminamed By Merge"),
    INSUFFICIENT_CASH("INSUFFICIENT_CASH", "Insufficient Cash"),
    MAX_AMNT_PER_LOAN_EXCEEDED("MAX_AMNT_PER_LOAN_EXCEEDED", "Max Amount Per Loan Exceeded"),
    MAX_PERCENT_PER_LOAN_EXCEEDED("MAX_PERCENT_PER_LOAN_EXCEEDED", "Max Percent Per Loan Exceeded"),
    MAX_PERCENT_PER_LOAN_TIME_EXCEEDED("MAX_PERCENT_PER_LOAN_TIME_EXCEEDED", "Max Percent Per Loan Time Exceeded"),
    MAX_AMNT_PER_LOAN_TIME_EXCEEDED("MAX_AMNT_PER_LOAN_TIME_EXCEEDED", "Max Amount Per Loan Time Exceeded"),
    NOT_AN_INVESTOR("NOT_AN_INVESTOR", "Not An Investor"),
    NOTE_ADDED_TO_PORTFOLIO("NOTE_ADDED_TO_PORTFOLIO", "Note Added To Portfolio"),
    NOT_A_VALID_PORTFOLIO("NOT_A_VALID_PORTFOLIO", "Not A Valid Portfolio"),
    ERROR_ADDING_NOTE_TO_PORTFOLIO("ERROR_ADDING_NOTE_TO_PORTFOLIO", "Error Adding Note To Portfolio"),
    SYSTEM_BUSY("SYSTEM_BUSY", "System Busy");

    final String executionStatus;
    final String displayValue;

    ExecutionStatus(String executionStatus, String displayValue){
        this.executionStatus = executionStatus;
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }
}
