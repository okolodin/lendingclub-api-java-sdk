package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by tmichels on 12/8/14.
 */
public class Portfolios {

    @JsonProperty("myPortfolios")
    private List<Portfolio> portfolioList;

    public List<Portfolio> getPortfolioList() {
        return portfolioList;
    }

    public void setPortfolioList(List<Portfolio> portfolioList) {
        this.portfolioList = portfolioList;
    }
}
