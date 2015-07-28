package com.lendingclub.rest;

/**
 * Created by tmichels on 12/8/14.
 */
public enum ApiVersion {

    V1 ("v1"),
    DEFAULT_VERSION ("v1");

    final String v;

    ApiVersion(String v) {
        this.v=v;
    }

    public String toString() { return v; }
}
