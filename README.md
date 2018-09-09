LendingClub API Java SDK
===========================

Maven integration


    <dependency>
      <groupId>com.lendingclub</groupId>
      <artifactId>lendingclub-full-api-sdk</artifactId>
      <version>1.2-SNAPSHOT</version>
    </dependency>

1. Register for apiToken follow steps: https://www.lendingclub.com/developers/authentication.action
2. Create a new instance of ApiConfig and setToken and you are ready to go:

Code snippet to get account summary. 

    private static String apiToken = "YOUR API TOKEN"
    private static String accountNumber = "YOUR ACCOUNT NUMBER"

    public static void main(String args[]){
         ApiConfig apiConfig = new ApiConfig(apiToken);
         LendingClubApi lendingClubApi = new LendingClubApi(apiConfig);
         System.out.println("======= Lending Club API Account Summary =========");
         System.out.println(lendingClubApi.getSummary(accountNumber).toString());
    }

<strong>Endpoints</strong>

Summary
    
    Summary summary = lendingClubApi.getSummary(investorId);
    
Cash Available

    AvailableCash availableCash = lendingClubApi.getAvailableCash(investorId);
    
Notes Owned

    Notes notes = lendingClubApi.getNotesOwned(investorId);
     
DetailedNotes

    DetailedNotes detailedNotes = lendingClubApi.getDetailedNotesOwned(investorId);

Portfolio Owned

    PortfolioOwned portfolioOwned = lendingClubApi.getPortfoliosOwned(investorId);
    
Listed Loans

    Loans loans = lendingClubApi.getListedLoans();
    
New Portfolio

    Portfolio portfolio = new Portfolio();
    portfolio.setAid(new Long(investorId));
    portfolio.setPortfolioDescription("Test Portfolio");
    portfolio.setPortfolioName("Test Portfolio");
    PortFolioResponse portfolioResult = lendingClubApi.createPorfolio(investorId, portfolio);
    
Submit Order
    
    Order order = new Order();
    order.setLoanId(loanId);
    order.setRequestAmount(new BigDecimal(25));
    Orders orders = new Orders();
    orders.setAid(new Integer(investorId));
    orders.setOrderList(Arrays.asList(order));
    OrderConfirmations orderResponse = lendingClubApi.submitOrder(investorId, orders);

Folio Notes listed on secondary market platform

    List<Listing> listings = lendingClubApi.getFolioListings(2);
    
Folio Orders
    
    FolioResponse<FolioOrderResult[]> response = lendingClubApi.getFolioOrders(investorId, true, null, null);
    
Folio Order
    
    String txnId = "scdc63db3-5277-4a8e-9b28-dea9f7620b54";
    FolioResponse<FolioOrderResult> response = lendingClubApi.getFolioOrder(investorId, txnId);

Submit Orders on Folio platform

    List<FolioOrder> orders = new ArrayList<>();
    FolioOrder order = new FolioOrder();
    order.setExpirationDate("2018-09-20T00:00:00.000-07:00");
    order.setNoteId("123");
    order.setOrderType(OrderType.SELL);
    order.setPrice(1.1);
    orders.add(order);

    order = new FolioOrder();
    order.setExpirationDate("2018-09-20T00:00:00.000-07:00");
    order.setNoteId("14661284");
    order.setOrderType(OrderType.BUY);
    order.setPrice(27.1);
    orders.add(order);

    FolioResponse<FolioOrderResult[]> response = lendingClubApi.submitFolioOrder(investorId, orders);
        
Cancel Folio Sell Order

    String txnId = "scdc63db3-5277-4a8e-9b28-dea9f7620b54";
    FolioResponse<FolioSellOrderResult[]> response = lendingClubApi.cancelFolioRequest(investorId, txnId);        