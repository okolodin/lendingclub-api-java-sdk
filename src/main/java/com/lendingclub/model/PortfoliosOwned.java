package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by tmichels on 12/9/14.
 */
public class PortfoliosOwned {

    @JsonProperty("myPortfolios")
    private List<PortfolioOwned> portfolioOwnedList;

    public List<PortfolioOwned> getPortfolioOwnedList() {
        return portfolioOwnedList;
    }

    public void setPortfolioOwnedList(List<PortfolioOwned> portfolioOwnedList) {
        this.portfolioOwnedList = portfolioOwnedList;
    }
}
