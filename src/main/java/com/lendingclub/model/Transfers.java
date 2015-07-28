package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by tmichels on 2/18/15.
 */
public class Transfers {

   @JsonProperty("transfers")
   public List<Transfer> transfers;

    public List<Transfer> getTransfers() {
        return transfers;
    }

    public void setTransfers(List<Transfer> transfers) {
        this.transfers = transfers;
    }
}
