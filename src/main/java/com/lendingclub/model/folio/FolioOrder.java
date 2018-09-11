package com.lendingclub.model.folio;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

/**
 * Created by Oleg Kolodin on 8/5/18.
 */
public class FolioOrder {
    /**
     * Note ID of Note being purchased or sold
     */
    @JsonProperty("noteId")
    private String noteId;

    /**
     * price to purchase or sell Note
     */
    @JsonProperty("price")
    private Double price;

    /**
     * BUY or SELL
     */
    @JsonProperty("orderType")
    private OrderType orderType;

    @JsonProperty("expirationDate")
    private String expirationDate;

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "FolioOrder{" +
                "noteId='" + noteId + '\'' +
                ", price=" + price +
                ", orderType=" + orderType +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
