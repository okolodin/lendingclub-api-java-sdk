package com.lendingclub.rest;

import static org.junit.Assert.*;

import com.lendingclub.model.*;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by tmichels on 12/8/14.
 */
public class LendingClubRestIntegrationTest {

    private ApiConfig apiConfig;
    private  LendingClubApi lendingClubApi;
    //TODO: Set your apiToken
    private String apiToken = System.getenv("LC_TOKEN");
    //TODO: set your account number
    private String investorId = System.getenv("LC_INVESTOR_ID");
    private Integer loanId = 0;

    @Before
    public void setup(){
        apiConfig = new ApiConfig(apiToken);
        apiConfig.setToken(apiToken);
        apiConfig.setApiEndpoint("https://api.lendingclub.com");
        lendingClubApi = new LendingClubApi(apiConfig);
    }

    @Test
    public void testGetSummary(){
        Summary summary = lendingClubApi.getSummary(investorId);
        assertNotNull(summary.getAccountTotal());
        assertNotNull(summary.getAccruedInterest());
        assertNotNull(summary.getAvailableCash());
        assertNotNull(summary.getInfundingBalance());
        assertNotNull(summary.getInvestorId());
        assertNotNull(summary.getOutstandingPrincipal());
        assertNotNull(summary.getReceivedInterest());
        assertNotNull(summary.getReceivedLateFees());
        assertNotNull(summary.getReceivedPrincipal());
        assertNotNull(summary.getTotalNotes());
        assertNotNull(summary.getTotalPortfolios());
    }

    @Test
    public void testGetAvailableCash(){
        AvailableCash availableCash = lendingClubApi.getAvailableCash(investorId);
        assertNotNull(availableCash.getInvestorId());
        assertNotNull(availableCash.getAvailableCash());
    }

    @Test
    public void testGetNotesOwned(){
        Notes notes = lendingClubApi.getNotesOwned(investorId);
        List<Note> notesList = notes.getNoteList();
        if (notesList!=null && notesList.size()>0){
            assertNotNull(notesList.get(0).getGrade());
            assertNotNull(notesList.get(0).getInterestRate());
            assertNotNull(notesList.get(0).getIssueDate());
            assertNotNull(notesList.get(0).getLoanAmount());
            assertNotNull(notesList.get(0).getLoanId());
            assertNotNull(notesList.get(0).getLoanLength());
            assertNotNull(notesList.get(0).getLoanStatus());
            assertNotNull(notesList.get(0).getLoanStatusDate());
            assertNotNull(notesList.get(0).getNoteAmount());
            assertNotNull(notesList.get(0).getNoteId());
            assertNotNull(notesList.get(0).getOrderDate());
            assertNotNull(notesList.get(0).getPaymentsReceived());
            assertNotNull(notesList.get(0).getSubGrade());
        }
    }

    @Test
    public void testGetDetailedNotesOwned(){
        DetailedNotes detailedNotes = lendingClubApi.getDetailedNotesOwned(investorId);
        List<DetailedNote> detailedNoteList = detailedNotes.getDetailedNoteList();
    }

    @Test
    public void testGetPortfolioOwned(){
        PortfolioOwned portfolioOwned = lendingClubApi.getPortfoliosOwned(investorId);
        if (portfolioOwned.getPortfolioId()!=null){
            assertNotNull(portfolioOwned.getPortfolioDescription());
            assertNotNull(portfolioOwned.getPortfolioId());
            assertNotNull(portfolioOwned.getPortfolioName());
        }
    }

    @Test
    public void testGetListedLoans(){
        Loans loans = lendingClubApi.getListedLoans();
        assertNotNull(loans.getAsOfDate());
        List<Loan> loanList = loans.getLoans();
        if (loanList!=null && loanList.size()>0){
            assertNotNull(loanList.get(0).getSubGrade());
            assertNotNull(loanList.get(0).getAcceptD());
            assertNotNull(loanList.get(0).getAccNowDelinq());
            assertNotNull(loanList.get(0).getAccOpenPast24Mths());
            assertNotNull(loanList.get(0).getAddrState());
            assertNotNull(loanList.get(0).getAddrZip());
            assertNotNull(loanList.get(0).getAnnualInc());
            assertNotNull(loanList.get(0).getAvgCurBal());
            assertNotNull(loanList.get(0).getBcOpenToBuy());
            assertNotNull(loanList.get(0).getBcUtil());
            assertNotNull(loanList.get(0).getChargeoffWithin12Mths());
            assertNotNull(loanList.get(0).getCollections12MthsExMed());
            assertNotNull(loanList.get(0).getCreditPullD());
            assertNotNull(loanList.get(0).getDelinq2Yrs());
            assertNotNull(loanList.get(0).getDelinqAmnt());
            //assertNotNull(loanList.get(0).getDesc());
            assertNotNull(loanList.get(0).getDti());
            assertNotNull(loanList.get(0).getEarliestCrLine());
            assertNotNull(loanList.get(0).getEmpLength());
            assertNotNull(loanList.get(0).getEarliestCrLine());
            //assertNotNull(loanList.get(0).getEmpTitle());
            assertNotNull(loanList.get(0).getExpD());
            assertNotNull(loanList.get(0).getExpDefaultRate());
            assertNotNull(loanList.get(0).getFicoRangeHigh());
            assertNotNull(loanList.get(0).getFicoRangeLow());
            assertNotNull(loanList.get(0).getFundedAmount());
            assertNotNull(loanList.get(0).getGrade());
            assertNotNull(loanList.get(0).getListD());
            assertNotNull(loanList.get(0).getLoanAmount());
            assertNotNull(loanList.get(0).getMemberId());
            assertNotNull(loanList.get(0).getMortAcc());
            assertNotNull(loanList.get(0).getMoSinOldIlAcct());
            assertNotNull(loanList.get(0).getMoSinRcntRevTlOp());
            assertNotNull(loanList.get(0).getMoSinRcntTl());
            assertNotNull(loanList.get(0).getNumAcctsEver120Ppd());
            assertNotNull(loanList.get(0).getNumActvBcTl());
            assertNotNull(loanList.get(0).getNumActvRevTl());
            assertNotNull(loanList.get(0).getNumBcSats());
            assertNotNull(loanList.get(0).getNumBcTl());
            assertNotNull(loanList.get(0).getNumIlTl());
            assertNotNull(loanList.get(0).getNumOpRevTl());
            assertNotNull(loanList.get(0).getNumRevAccts());
            assertNotNull(loanList.get(0).getNumRevTlBalGt0());
            assertNotNull(loanList.get(0).getNumSats());
            assertNotNull(loanList.get(0).getNumTl120dpd2m());
            assertNotNull(loanList.get(0).getNumTl30dpd());
            assertNotNull(loanList.get(0).getNumTl90gDpd24m());
            assertNotNull(loanList.get(0).getNumTlOpPast12m());
            assertNotNull(loanList.get(0).getOpenAcc());
            assertNotNull(loanList.get(0).getReviewStatus());
            //assertNotNull(loanList.get(0).getReviewStatusD());
            assertNotNull(loanList.get(0).getRevolBal());
            assertNotNull(loanList.get(0).getRevolUtil());
            assertNotNull(loanList.get(0).getServiceFeeRate());
            assertNotNull(loanList.get(0).getSubGrade());
            assertNotNull(loanList.get(0).getTaxLiens());
            assertNotNull(loanList.get(0).getTerm());
            assertNotNull(loanList.get(0).getTotalAcc());
            assertNotNull(loanList.get(0).getTotalBalExMort());
            assertNotNull(loanList.get(0).getTotalBcLimit());
            assertNotNull(loanList.get(0).getTotalIlHighCreditLimit());
            assertNotNull(loanList.get(0).getTotalRevHiLim());
            assertNotNull(loanList.get(0).getTotCollAmt());
            assertNotNull(loanList.get(0).getTotCurBal());
            assertNotNull(loanList.get(0).getTotHiCredLim());
        }
    }

    @Test
    public void testCreatePortfolio(){
        Portfolio portfolio = new Portfolio();
        portfolio.setAid(investorId);
        portfolio.setPortfolioDescription("Test Portfolio");
        portfolio.setPortfolioName("Test Portfolio");
        PortFolioResponse portfolioResult = lendingClubApi.createPorfolio(investorId, portfolio);
        assertNotNull(portfolioResult.getPortfolioId());
        assertNotNull(portfolioResult.getPortfolioName());
        assertNotNull(portfolioResult.getPortfolioDescription());
    }

    @Test
    public void testSubmitOrder(){
        Order order = new Order();
        order.setLoanId(loanId);
        order.setRequestAmount(new BigDecimal(25));
        Orders orders = new Orders();
        orders.setAid(new Integer(investorId));
        orders.setOrderList(Arrays.asList(order));
        OrderConfirmations orderResponse = lendingClubApi.submitOrder(investorId, orders);
        System.out.println(orderResponse.getOrderInstructId());
        List<OrderConfirmation> orderConfirmations = orderResponse.getOrderConfirmationList();
        for (OrderConfirmation orderConfirmation : orderConfirmations){
            assertNotNull(orderConfirmation.getLoanId());
            assertNotNull(orderConfirmation.getRequestedAmount());
            assertNotNull(orderConfirmation.getInvestedAmount());
            List<ExecutionStatus> executionStatuses = orderConfirmation.getExecutionStatusList();
            for (ExecutionStatus executionStatus : executionStatuses){
                assertNotNull(executionStatus);
            }
        }
    }

    @Test
    public void testAddFunds(){
        Funds fund = new Funds();
        fund.setAmount(new BigDecimal(100));
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        fund.setEstimatedFundsTransferDate(calendar.getTime());
        fund.setStartDate(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 50);
        fund.setEndDate(calendar.getTime());
        fund.setTransferFrequency(TransferFrequency.LOAD_BIWEEKLY);
        Funds addFundsResult = lendingClubApi.addFunds(investorId, fund);
        assertNotNull(addFundsResult);
    }

    @Test
    public void testWithDrawFunds(){
        Funds fund = new Funds();
        fund.setAmount(new BigDecimal(1));
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        fund.setStartDate(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 20);
        fund.setEndDate(calendar.getTime());
        fund.setEstimatedFundsTransferDate(calendar.getTime());
        fund.setTransferFrequency(TransferFrequency.LOAD_BIWEEKLY);
        Funds withDrawFundsResult = lendingClubApi.withDrawFunds(investorId, fund);
        assertNotNull(withDrawFundsResult);
    }

    @Test
    public void pendingTransfer(){
        Transfers pendingTransfers = lendingClubApi.getPendingTransfers(investorId);
        List<Transfer> transfers = pendingTransfers.getTransfers();
        for (Transfer transfer : transfers){
            System.out.println(transfer.getTransferId());
            assertNotNull(transfer.getTransferId());
            assertNotNull(transfer.getAmount());
            assertNotNull(transfer.getCancellable());
            System.out.println(transfer.getFrequency());
            assertNotNull(transfer.getFrequency());
            assertNotNull(transfer.getOperation());
            assertNotNull(transfer.getStatus());
            assertNotNull(transfer.getSourceAccount());
        }
    }

    @Test
    public void cancelTransfer(){
        CancelTransferRequest transferRequest = new CancelTransferRequest();
        transferRequest.setTransferIds(Arrays.asList(new Long(1)));
        CancelTransferResult cancelTransferResult = lendingClubApi.cancelTransfers(investorId, transferRequest);
        System.out.println(cancelTransferResult.getCancellationResults().get(0).getMessage());
    }
}
