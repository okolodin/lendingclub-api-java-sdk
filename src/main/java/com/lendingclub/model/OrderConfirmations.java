package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by tmichels on 12/8/14.
 */
public class OrderConfirmations {

    @JsonProperty("orderInstructId")
    private String orderInstructId;

    @JsonProperty("orderConfirmations")
    private List<OrderConfirmation> orderConfirmationList;

    public String getOrderInstructId() {
        return orderInstructId;
    }

    public void setOrderInstructId(String orderInstructId) {
        this.orderInstructId = orderInstructId;
    }

    public List<OrderConfirmation> getOrderConfirmationList() {
        return orderConfirmationList;
    }

    public void setOrderConfirmationList(List<OrderConfirmation> orderConfirmationList) {
        this.orderConfirmationList = orderConfirmationList;
    }
}
