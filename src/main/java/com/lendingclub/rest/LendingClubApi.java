package com.lendingclub.rest;

import com.lendingclub.http.Http;
import com.lendingclub.http.HttpRequest;
import com.lendingclub.http.HttpResponse;
import com.lendingclub.model.*;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.IOException;

/**
 * Created by tmichels on 12/8/14.
 */
public class LendingClubApi {

    private static final ObjectMapper jsonMapper;

    static {
        jsonMapper = new ObjectMapper();
        jsonMapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
    }

    final ApiConfig config;

    public LendingClubApi(ApiConfig apiConfig) {
        this.config = apiConfig;
    }


    public Funds addFunds(String investorId, Object fund){
        try {
            Funds result = jsonMapper.readValue(apiRequest(new HttpRequest()
                    .url(uriBase() + "/accounts/" + investorId + "/funds/add")
                    .method("POST")
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .expectsCode(200)
                    .content(jsonMapper.writeValueAsBytes(fund))).getStream(),Funds.class);
            return result;
        } catch (IOException e) {
            throw new ResourceException(e);
        }
    }

    public Funds withDrawFunds(String investorId, Object fund){
        try {
            Funds result = jsonMapper.readValue(apiRequest(new HttpRequest()
                    .url(uriBase() + "/accounts/" + investorId + "/funds/withdraw")
                    .method("POST")
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .expectsCode(200)
                    .content(jsonMapper.writeValueAsBytes(fund))).getStream(),Funds.class);
            return result;
        } catch (IOException e) {
            throw new ResourceException(e);
        }
    }

    public Transfers getPendingTransfers(String investorId){
        return new ResourceRepresentation(apiRequest(new HttpRequest()
                .url(uriBase()+"/accounts/"+investorId +"/funds/pending")
                .method("GET")
                .header("Accept", "application/json"))).as(Transfers.class);
    }

    public CancelTransferResult cancelTransfers(String investorId, Object cancelTransfer){
        try {
            CancelTransferResult result = jsonMapper.readValue(apiRequest(new HttpRequest()
                    .url(uriBase() + "/accounts/" + investorId + "/funds/cancel")
                    .method("POST")
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .expectsCode(200)
                    .content(jsonMapper.writeValueAsBytes(cancelTransfer))).getStream(),CancelTransferResult.class);
            return result;
        } catch (IOException e) {
            throw new ResourceException(e);
        }
    }

    public Summary getSummary(String investorId){
        return new ResourceRepresentation(apiRequest(new HttpRequest()
                .url(uriBase()+"/accounts/"+investorId +"/summary")
                .method("GET")
                .header("Accept", "application/json"))).as(Summary.class);
    }

    public AvailableCash getAvailableCash(String investorId){
        return new ResourceRepresentation(apiRequest(new HttpRequest()
                .url(uriBase()+"/accounts/"+investorId +"/availablecash")
                .method("GET")
                .header("Accept", "application/json"))).as(AvailableCash.class);
    }

    public Notes getNotesOwned(String investorId){
        return new ResourceRepresentation(apiRequest(new HttpRequest()
                .url(uriBase()+"/accounts/"+investorId +"/notes")
                .method("GET")
                .header("Accept", "application/json"))).as(Notes.class);
    }

    public DetailedNotes getDetailedNotesOwned(String investorId){
        return new ResourceRepresentation(apiRequest(new HttpRequest()
                .url(uriBase()+"/accounts/"+investorId +"/detailednotes")
                .method("GET")
                .header("Accept", "application/json"))).as(DetailedNotes.class);
    }

    public PortfoliosOwned getPortfoliosOwned(String investorId){
        return new ResourceRepresentation(apiRequest(new HttpRequest()
                .url(uriBase()+"/accounts/"+investorId +"/portfolios")
                .method("GET")
                .header("Accept", "application/json"))).as(PortfoliosOwned.class);
    }


    public Loans getListedLoans(){
        return getListedLoans(false);
    }

    /**
     * @param showAll true to get all listed loans, false for 'Results will contain only the loans listed in the most recent listing period. If the listing is currently in progress, it will return the loans that have been listed so far.'
     * @return
     */
    public Loans getListedLoans(boolean showAll){
        return new ResourceRepresentation(apiRequest(new HttpRequest()
                .url(uriBase() + "/loans/listing" + "?showAll=" + showAll)
                .method("GET")
                .header("Accept", "application/json"))).as(Loans.class);
    }

    public PortFolioResponse createPorfolio(String investorId, Portfolio portfolio){
        try{
            PortFolioResponse result = jsonMapper.readValue(apiRequest(new HttpRequest()
                .url(uriBase() + "/accounts/" + investorId + "/portfolios")
                .method("POST")
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .expectsCode(200)
                .content(jsonMapper.writeValueAsBytes(portfolio))).getStream(),PortFolioResponse.class);

            return result;
        } catch (JsonGenerationException e) {
            throw new ResourceException(e);
        } catch (JsonMappingException e) {
            throw new ResourceException(e);
        } catch (IOException e) {
            throw new ResourceException(e);
        }
    }

    public OrderConfirmations submitOrder(String investorId, Orders orders){
        try{
            OrderConfirmations result = jsonMapper.readValue(apiRequest(new HttpRequest()
                    .url(uriBase()+"/accounts/"+investorId +"/orders")
                    .method("POST")
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .expectsCode(200)
                    .content(jsonMapper.writeValueAsBytes(orders))).getStream(),OrderConfirmations.class);

            return result;
        } catch (JsonGenerationException e) {
            throw new ResourceException(e);
        } catch (JsonMappingException e) {
            throw new ResourceException(e);
        } catch (IOException e) {
            throw new ResourceException(e);
        }
    }

    private final String uriBase() {
        return(config.getApiEndpoint()+"/api/investor/"+config.getApiVersion());
    }

    private final HttpResponse apiRequest(HttpRequest req) {
        req.setAuthorization(config.getToken());
        HttpResponse res = Http.send(req);
        if(res.getResponseCode()>299) {
            if(res.getResponseCode()==401) {
                throw new ApiTokenException(res.getString());
            } else {
                throw new ApiException(res.getResponseCode(), res.getString());
            }
        } else if(req.getExpectedCode()!=-1 && res.getResponseCode()!=req.getExpectedCode()) {
            throw new RuntimeException("Unexpected response from LendingClub API. Got response code "+res.getResponseCode()+
                    ". Was expecing "+req.getExpectedCode());
        } else {
            return res;
        }
    }
}
