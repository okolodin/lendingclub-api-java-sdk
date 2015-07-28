package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

/**
 * Created by tmichels on 12/8/14.
 */
public class AvailableCash {

    @JsonProperty("investorId")
    private Integer investorId;
    @JsonProperty("availableCash")
    private BigDecimal availableCash;

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
}
