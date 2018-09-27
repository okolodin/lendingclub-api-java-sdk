package com.lendingclub.model.folio;

/**
 * Status of Note on Folio platform.
 * <p>
 * Created by Oleg Kolodin on 8/5/18.
 */
public enum FolioNoteStatus {
    IN_LISTING, SETTLED,
    CANCELED_BY_SELLER,
    CANCELED_TIME_EXPIRED,
    PENDING_TRADE_SETTLEMENT,
    CANCELED_BY_PAYMENT,
    CANCELED_BY_DEFAULT_OR_CHARGE_OFF,
    REPRICED,
    CANCELED_BY_BANKRUPTCY,
    SUCCESS_PENDING_SETTLEMENT,
    NOTE_NOT_AVAILABLE,
    NOTE_DATA_STALE
}
