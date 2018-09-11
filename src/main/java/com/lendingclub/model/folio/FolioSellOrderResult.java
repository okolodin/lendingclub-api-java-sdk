package com.lendingclub.model.folio;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Oleg Kolodin on 8/5/18.
 */
public class FolioSellOrderResult {
    /**
     * Note ID of Note being purchased or sold
     */
    @JsonProperty("noteId")
    private String noteId;

    @JsonProperty("txnId")
    private String txnId;

    @JsonProperty("status")
    private String status;

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FolioSellOrderResult{" +
                "noteId='" + noteId + '\'' +
                ", txnId='" + txnId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
