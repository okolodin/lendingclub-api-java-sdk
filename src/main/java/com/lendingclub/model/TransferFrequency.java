package com.lendingclub.model;

/**
 * Created by tmichels on 2/18/15.
 */
public enum TransferFrequency {
    LOAD_NOW("LOAD_NOW"),
    LOAD_ONCE("LOAD_ONCE"),
    LOAD_WEEKLY("LOAD_WEEKLY"),
    LOAD_BIWEEKLY("LOAD_BIWEEKLY"),
    LOAD_ON_DAY_1_AND_16("LOAD_ON_DAY_1_AND_16"),
    LOAD_MONTHLY("LOAD_MONTHLY");

    final String transferFrequency;

    TransferFrequency(String transferFrequency){
        this.transferFrequency = transferFrequency;
    }
}
