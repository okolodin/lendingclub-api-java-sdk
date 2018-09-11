package com.lendingclub.model.folio;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Oleg Kolodin on 8/7/18.
 */
public class RepriceRequest {
    @JsonProperty("txnId")
    private String txnId;

    @JsonProperty("price")
    private String price;

    @JsonProperty("expirationDate")
    private String expirationDate;

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "RepriceRequest{" +
                "txnId='" + txnId + '\'' +
                ", price='" + price + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
