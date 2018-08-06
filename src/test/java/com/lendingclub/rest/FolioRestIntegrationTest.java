package com.lendingclub.rest;

import com.lendingclub.model.folio.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class FolioRestIntegrationTest {

    private ApiConfig apiConfig;
    private LendingClubApi lendingClubApi;
    //TODO: Set your apiToken
    private String apiToken = System.getenv("LC_TOKEN");
    //TODO: set your account number
    private String investorId = System.getenv("LC_INVESTOR_ID");
    private Integer loanId = 0;

    @Before
    public void setup() {
        apiConfig = new ApiConfig(apiToken);
        apiConfig.setApiEndpoint("https://api.lendingclub.com");
        lendingClubApi = new LendingClubApi(apiConfig);
    }

    /** Get all listings. Note, full catalog may reach tens of megabytes.
     *
     */
    @Test
    public void testGetFolioListings() {
        List<Listing> listings = lendingClubApi.getFolioListings(2);
        assertNotNull(listings);
        System.out.println("----- Listings");
        for (Listing l : listings) {
            System.out.println(l.toString());
        }
    }

    @Test
    public void testGetFolioOrders() {
        FolioResponse<FolioOrderResult[]> response = lendingClubApi.getFolioOrders(investorId, true, null, null);
        assertNotNull(response);
        System.out.println("----- Orders response (with details)");
        System.out.println(response.toString());

        if (response.getValue() != null) {
            for (FolioOrderResult o : response.getValue()) {
                System.out.println(o.toString());
            }
        }

        List<FolioNoteStatus> statuses = new ArrayList<>();
        //statuses.add(FolioNoteStatus.SETTLED);
        statuses.add(FolioNoteStatus.CANCELED_BY_PAYMENT);
        response = lendingClubApi.getFolioOrders(investorId, false, OrderType.BUY, statuses);
        assertNotNull(response);
        System.out.println("----- BUY/CANCELED_BY_PAYMENT Orders response (no details)");
        System.out.println(response.toString());

        if (response.getValue() != null) {
            for (FolioOrderResult o : response.getValue()) {
                System.out.println(o.toString());
            }
        }

    }

    @Test
    public void testSubmitFolioOrder() {
        List<FolioOrder> orders = new ArrayList<>();
        FolioOrder order = new FolioOrder();
        order.setExpirationDate("2018-09-20T00:00:00.000-07:00");
        order.setNoteId("123");
        order.setOrderType(OrderType.SELL);
        order.setPrice(1.1);
        orders.add(order);

        order = new FolioOrder();
        order.setExpirationDate("2018-09-20T00:00:00.000-07:00");
        order.setNoteId("146641284");
        order.setOrderType(OrderType.BUY);
        order.setPrice(27.1);
        orders.add(order);

        FolioResponse<FolioOrderResult[]> response = lendingClubApi.submitFolioOrder(investorId, orders);
        assertNotNull(response);
        System.out.println("----- Order response");
        System.out.println(response.toString());

        if (response.getValue() != null) {
            for (FolioOrderResult o : response.getValue()) {
                System.out.println(o.toString());
            }
        }
    }

}
