package com.lendingclub.rest;

import com.lendingclub.http.Http;
import com.lendingclub.http.HttpRequest;
import com.lendingclub.http.HttpResponse;
import com.lendingclub.model.*;
import com.lendingclub.model.folio.*;
import com.lendingclub.rest.util.CsvUtils;
import com.lendingclub.rest.util.JsonMapper;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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
                    ". Was expecting "+req.getExpectedCode());
        } else {
            return res;
        }
    }

    //
    // Secondarymarket/Folio API
    //

    /**
     * Treats HTTP response codes 200 and 400 as expected codes.
     * @param req HTTP Request instance
     * @return HTTP Response
     */
    private final HttpResponse folioApiRequest(HttpRequest req) {
        req.setAuthorization(config.getToken());
        HttpResponse res = Http.send(req);
        int responseCode = res.getResponseCode();

        if (responseCode > 299 && responseCode != 400) {
            if (res.getResponseCode() == 401) {
                throw new ApiTokenException(res.getString());
            } else {
                throw new ApiException(responseCode, res.getString());
            }
        } else if (req.getExpectedCode() != -1 && responseCode != req.getExpectedCode()) {
            throw new RuntimeException("Unexpected response from LendingClub API. Got response code " + res.getResponseCode() +
                    ". Was expecting " + req.getExpectedCode());
        } else {
            return res;
        }
    }

    private final String uriFolioResourceUri() {
        return uriBase() + "/secondarymarket";
    }

    /**
     * 1. Listings.
     * Returns notes listed on secondary market platform.
     *
     * @param updatedSince Filter listings to include only ones that were modified/created within the last updatedSince
     *                     minutes. Parameter is ignored if set to null.
     * @return
     */
    public List<Listing> getFolioListings(Integer updatedSince){
        try {
            String params = (updatedSince != null) ? ("?updatedSince=" + updatedSince) : "";
            InputStream result = apiRequest(new HttpRequest()
                    .url(uriFolioResourceUri() + "/listings" + params)
                    .method("GET")
                    .header("Accept", "text/csv")
                    .expectsCode(200)).getStream();

            return CsvUtils.parseFolioListings(result);
        } catch (JsonGenerationException e) {
            throw new ResourceException(e);
        } catch (JsonMappingException e) {
            throw new ResourceException(e);
        } catch (IOException e) {
            throw new ResourceException(e);
        }
    }

    /** 2. Orders
     * Get Folio platform orders.
     * Known limitations:
     * <ul>
     *     <li>Mixing BUY and SELL orders in one request is not allowed.</li>
     * </ul>
     * @param investorId
     * @param includeDetails
     * @param orderType optional
     * @param status optional
     * @return
     */
    public FolioResponse<FolioOrderResult[]> getFolioOrders(String investorId, boolean includeDetails,
                                                            OrderType orderType, List<FolioNoteStatus> status) {
        try {
            String query = "?includeDetails=" + includeDetails;
            if (orderType != null) { query += "&orderType=" + orderType.toString(); };
            if (status != null) {
                for (FolioNoteStatus s : status) {
                    query += "&status=" + s.toString();
                }
            }
            HttpResponse response = folioApiRequest(new HttpRequest()
                    .url(uriFolioResourceUri() + "/accounts/" + investorId + "/orders" + query)
                    .method("GET")
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    //.expectsCode(200)
                    );
            JsonMapper<FolioOrderResult[]> mapper =
                    new JsonMapper<FolioOrderResult[]>(FolioOrderResult[].class);
            FolioResponse<FolioOrderResult[]> result = mapper.parseResponse(jsonMapper, response);
            return result;
        } catch (JsonGenerationException e) {
            throw new ResourceException(e);
        } catch (JsonMappingException e) {
            throw new ResourceException(e);
        } catch (IOException e) {
            throw new ResourceException(e);
        }

    }

    /** 3. GET Order
     * Get Folio order.
     * @param investorId Investor ID
     * @param txnId Transaction ID
     * @return
     */
    public FolioResponse<FolioOrderResult> getFolioOrder(String investorId, String txnId) {
        try {
            HttpResponse response = folioApiRequest(new HttpRequest()
                            .url(uriFolioResourceUri() + "/accounts/" + investorId + "/orders/" + txnId)
                            .method("GET")
                            .header("Accept", "application/json")
                            .header("Content-Type", "application/json")
                    //.expectsCode(200)
            );
            JsonMapper<FolioOrderResult> mapper =
                    new JsonMapper<FolioOrderResult>(FolioOrderResult.class);
            FolioResponse<FolioOrderResult> result = mapper.parseResponse(jsonMapper, response);
            return result;
        } catch (JsonGenerationException e) {
            throw new ResourceException(e);
        } catch (JsonMappingException e) {
            throw new ResourceException(e);
        } catch (IOException e) {
            throw new ResourceException(e);
        }
    }

    /** 4. BUY/SELL Order.
     *
     * @param investorId
     * @param orders
     * @return
     */
    public FolioResponse<FolioOrderResult[]> submitFolioOrder(String investorId, List<FolioOrder> orders) {
        try {
            HttpResponse response = folioApiRequest(new HttpRequest()
                    .url(uriFolioResourceUri() + "/accounts/" + investorId + "/orders")
                    .method("POST")
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    //.expectsCode(200)
                    .content(jsonMapper.writeValueAsBytes(orders)));
            JsonMapper<FolioOrderResult[]> mapper =
                    new JsonMapper<FolioOrderResult[]>(FolioOrderResult[].class);
            FolioResponse<FolioOrderResult[]> result = mapper.parseResponse(jsonMapper, response);
            return result;
        } catch (JsonGenerationException e) {
            throw new ResourceException(e);
        } catch (JsonMappingException e) {
            throw new ResourceException(e);
        } catch (IOException e) {
            throw new ResourceException(e);
        }
    }

    /** 5.	Cancel	Request.
     *
     * Cancel Folio SELL order.
     * @param investorId Investor ID
     * @param txnId Transaction ID, nullable
     * @return
     */
    public FolioResponse<FolioSellOrderResult[]> cancelFolioRequest(String investorId, String txnId) {
        try {
            String[] payload = null;
            if (txnId != null) {
                payload = new String[1];
                payload[0] = txnId;
            } else {
                payload = new String[0];
            }
            HttpResponse response = folioApiRequest(new HttpRequest()
                    .url(uriFolioResourceUri() + "/accounts/" + investorId + "/orders/cancel")
                    .method("POST")
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    //.expectsCode(200)
                    .content(jsonMapper.writeValueAsBytes(payload)));
            JsonMapper<FolioSellOrderResult[]> mapper =
                    new JsonMapper<FolioSellOrderResult[]>(FolioSellOrderResult[].class);
            FolioResponse<FolioSellOrderResult[]> result = mapper.parseResponse(jsonMapper, response);
            return result;
        } catch (JsonGenerationException e) {
            throw new ResourceException(e);
        } catch (JsonMappingException e) {
            throw new ResourceException(e);
        } catch (IOException e) {
            throw new ResourceException(e);
        }
    }

    /** 6.Reprice	Request
     * Reprice Folio SELL order.
     *
     * @param investorId
     * @param txnId Transaction ID
     * @param price New price
     * @param expirationDate Order expiration date
     * @return
     */
    public FolioResponse<OrderRepriceResult[]> repriceFolioRequest(String investorId, String txnId, Double price,
                                                                     String expirationDate) {
        try {
            RepriceRequest[] payload = new RepriceRequest[1];
            RepriceRequest request = new RepriceRequest();
            request.setTxnId(txnId);
            request.setPrice(price.toString());
            request.setExpirationDate(expirationDate);
            payload[0] = request;
            HttpResponse response = folioApiRequest(new HttpRequest()
                    .url(uriFolioResourceUri() + "/accounts/" + investorId + "/orders")
                    .method("POST")
                    // workaround for PATCH
                    .header("X-HTTP-Method-Override", "PATCH")
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    //.expectsCode(200)
                    .content(jsonMapper.writeValueAsBytes(payload)));
            JsonMapper<OrderRepriceResult[]> mapper =
                    new JsonMapper<OrderRepriceResult[]>(OrderRepriceResult[].class);
            FolioResponse<OrderRepriceResult[]> result = mapper.parseResponse(jsonMapper, response);
            return result;
        } catch (JsonGenerationException e) {
            throw new ResourceException(e);
        } catch (JsonMappingException e) {
            throw new ResourceException(e);
        } catch (IOException e) {
            throw new ResourceException(e);
        }
    }


}
