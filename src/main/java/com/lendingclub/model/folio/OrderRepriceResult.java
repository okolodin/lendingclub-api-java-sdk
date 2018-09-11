package com.lendingclub.model.folio;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Oleg Kolodin on 8/7/18.
 */
public class OrderRepriceResult {

    @JsonProperty("noteId")
    private String noteId;

    @JsonProperty("price")
    private Double price;

    @JsonProperty("orderType")
    private OrderType orderType;

    @JsonProperty("expirationDate")
    private String expirationDate;

    @JsonProperty("txnId")
    private String txnId;

    @JsonProperty("status")
    private String status;

}
