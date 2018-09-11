package com.lendingclub.model.folio;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Oleg Kolodin on 8/5/18.
 */
public class FolioOrderResult {
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

    @JsonProperty("orderType")
    private OrderType orderType;

    @JsonProperty("expirationDate")
    private String expirationDate;

    @JsonProperty("txnId")
    private String txnId;

    @JsonProperty("status")
    private FolioNoteStatus status;

    @JsonProperty("note")
    private Listing note;

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

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public FolioNoteStatus getStatus() {
        return status;
    }

    public void setStatus(FolioNoteStatus status) {
        this.status = status;
    }

    public Listing getNote() {
        return note;
    }

    public void setNote(Listing note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "FolioOrderResult{" +
                "noteId='" + noteId + '\'' +
                ", price=" + price +
                ", orderType=" + orderType +
                ", expirationDate='" + expirationDate + '\'' +
                ", txnId='" + txnId + '\'' +
                ", status=" + status +
                ", note=" + note +
                '}';
    }
}
