package com.lendingclub.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.math.BigDecimal;

/**
 * Created by Oleg Kolodin on 12/05/2017.
 */
public class Adjustments {

    @JsonProperty("adjustmentForPastDueNotes")
    private BigDecimal adjustmentForPastDueNotes;

    @JsonProperty("userAdjustmentForPastDueNotes")
    private BigDecimal userAdjustmentForPastDueNotes;

    public BigDecimal getAdjustmentForPastDueNotes() {
        return adjustmentForPastDueNotes;
    }

    public void setAdjustmentForPastDueNotes(BigDecimal adjustmentForPastDueNotes) { this.adjustmentForPastDueNotes = adjustmentForPastDueNotes; }

    public BigDecimal getUserAdjustmentForPastDueNotes() {
        return userAdjustmentForPastDueNotes;
    }

    public void setUserAdjustmentForPastDueNotes(BigDecimal userAdjustmentForPastDueNotes) { this.userAdjustmentForPastDueNotes = userAdjustmentForPastDueNotes; }
}
