package com.lendingclub.rest;

import org.codehaus.jackson.annotate.JsonProperty;

public class PortFolioResponse {

    @JsonProperty(value = "portfolioId")
	String portfolioId;
    @JsonProperty(value="portfolioName")
    String portfolioName;
    @JsonProperty(value="portfolioDescription")
    String portfolioDescription;

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

    public String getPortfolioDescription() {
        return portfolioDescription;
    }

    public void setPortfolioDescription(String portfolioDescription) {
        this.portfolioDescription = portfolioDescription;
    }
}
