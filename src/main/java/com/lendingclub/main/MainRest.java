package com.lendingclub.main;

import com.lendingclub.rest.ApiConfig;
import com.lendingclub.rest.LendingClubApi;

/**
 * Created by tmichels on 12/8/14.
 */
public class MainRest {

    private static String apiToken = System.getenv("LC_TOKEN");;
    private static String accountNumber = System.getenv("LC_INVESTOR_ID");

    public static void main(String args[]){
        ApiConfig apiConfig = new ApiConfig();
        apiConfig.setToken(apiToken);
        LendingClubApi lendingClubApi = new LendingClubApi(apiConfig);
        System.out.println("======= Lending Club API Account Summary =========");
        System.out.println(lendingClubApi.getSummary(accountNumber).toString());
    }
}
