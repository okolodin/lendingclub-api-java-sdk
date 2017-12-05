package com.lendingclub.rest;

/**
 * Created by tmichels on 12/8/14.
 */
public class ApiConfig {

    ApiVersion apiVersion = ApiVersion.DEFAULT_VERSION;
    String apiEndpoint = "https://api.lendingclub.com";
    String token;

    public ApiConfig() { }

    public ApiConfig(String token) {
        this.token = token;
    }

    public String getApiEndpoint() {
        return apiEndpoint;
    }

    public ApiConfig setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
        return this;
    }

    public String getToken() {
        return token;
    }

    public ApiConfig setToken(String token) {
        this.token = token;
        return this;
    }

    public ApiVersion getApiVersion() {
        return apiVersion;
    }
}
