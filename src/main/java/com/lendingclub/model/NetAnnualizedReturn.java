package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

/**
 * Created by Oleg Kolodin on 12/05/2017.
 */
public class NetAnnualizedReturn {

    @JsonProperty("primaryNAR")
    private BigDecimal primaryNAR;

    @JsonProperty("primaryAdjustedNAR")
    private BigDecimal primaryAdjustedNAR;

    @JsonProperty("primaryUserAdjustedNAR")
    private BigDecimal primaryUserAdjustedNAR;

    @JsonProperty("tradedNAR")
    private BigDecimal tradedNAR;

    @JsonProperty("tradedAdjustedNAR")
    private BigDecimal tradedAdjustedNAR;

    @JsonProperty("tradedUserAdjustedNAR")
    private BigDecimal tradedUserAdjustedNAR;

    @JsonProperty("combinedNAR")
    private BigDecimal combinedNAR;

    @JsonProperty("combinedAdjustedNAR")
    private BigDecimal combinedAdjustedNAR;

    @JsonProperty("combinedUserAdjustedNAR")
    private BigDecimal combinedUserAdjustedNAR;


    public BigDecimal getPrimaryNAR() {
        return primaryNAR;
    }

    public void setPrimaryNAR(BigDecimal primaryNAR) {
        this.primaryNAR = primaryNAR;
    }

    public BigDecimal getPrimaryAdjustedNAR() {
        return primaryAdjustedNAR;
    }

    public void setPrimaryAdjustedNAR(BigDecimal primaryAdjustedNAR) {
        this.primaryAdjustedNAR = primaryAdjustedNAR;
    }

    public BigDecimal getPrimaryUserAdjustedNAR() {
        return primaryUserAdjustedNAR;
    }

    public void setPrimaryUserAdjustedNAR(BigDecimal primaryUserAdjustedNAR) {
        this.primaryUserAdjustedNAR = primaryUserAdjustedNAR;
    }

    public BigDecimal getTradedNAR() {
        return tradedNAR;
    }

    public void setTradedNAR(BigDecimal tradedNAR) {
        this.tradedNAR = tradedNAR;
    }

    public BigDecimal getTradedAdjustedNAR() {
        return tradedAdjustedNAR;
    }

    public void setTradedAdjustedNAR(BigDecimal tradedAdjustedNAR) {
        this.tradedAdjustedNAR = tradedAdjustedNAR;
    }

    public BigDecimal getTradedUserAdjustedNAR() {
        return tradedUserAdjustedNAR;
    }

    public void setTradedUserAdjustedNAR(BigDecimal tradedUserAdjustedNAR) {
        this.tradedUserAdjustedNAR = tradedUserAdjustedNAR;
    }

    public BigDecimal getCombinedNAR() {
        return combinedNAR;
    }

    public void setCombinedNAR(BigDecimal combinedNAR) {
        this.combinedNAR = combinedNAR;
    }

    public BigDecimal getCombinedAdjustedNAR() {
        return combinedAdjustedNAR;
    }

    public void setCombinedAdjustedNAR(BigDecimal combinedAdjustedNAR) {
        this.combinedAdjustedNAR = combinedAdjustedNAR;
    }

    public BigDecimal getCombinedUserAdjustedNAR() {
        return combinedUserAdjustedNAR;
    }

    public void setCombinedUserAdjustedNAR(BigDecimal combinedUserAdjustedNAR) {
        this.combinedUserAdjustedNAR = combinedUserAdjustedNAR;
    }

}
