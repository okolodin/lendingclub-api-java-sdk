package com.lendingclub.rest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oleg Kolodin on 8/5/18.
 */
public enum FolioResponseType {
    OK(200),
    FAILED_VALIDATION(400), UNAUTHORIZED(401), INCORRECT_URL(404), UNEXPECTED_FAILURE(500), SERVICE_UNAVAILABLE(503);

    private final int value;
    private static Map<Integer, FolioResponseType> valuesMap = new HashMap<Integer, FolioResponseType>();

    static {
        for (int i = 0; i < values().length; i++) {
            valuesMap.put(values()[i].value, values()[i]);
        }
    }

    FolioResponseType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static FolioResponseType fromInt(int i) {
        return valuesMap.get(i);
    }
}
