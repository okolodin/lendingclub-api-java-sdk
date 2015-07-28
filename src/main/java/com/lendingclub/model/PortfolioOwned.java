package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by tmichels on 12/9/14.
 */
public class PortfolioOwned {

    @JsonProperty("portfolioId")
    private Integer portfolioId;

    @JsonProperty("portfolioName")
    private String portfolioName;

    @JsonProperty("portfolioDescription")
    private String portfolioDescription;

    public Integer getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Integer portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public String getPortfolioDescription() {
        return portfolioDescription;
    }

    public void setPortfolioDescription(String portfolioDescription) {
        this.portfolioDescription = portfolioDescription;
    }
}
