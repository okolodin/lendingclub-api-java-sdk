LendingClub Java Sdk
===========================

1. Register for apiToken follow steps: https://www.lendingclub.com/developers/authentication.action
2. Create a new instance of ApiConfig and setToken and you are ready to go:

Code snippet to get account summary. 

    private static String apiToken = System.getenv("LC_TOKEN");;
    private static String accountNumber = System.getenv("LC_INVESTOR_ID");

    public static void main(String args[]){
         ApiConfig apiConfig = new ApiConfig();
         apiConfig.setToken(apiToken);
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
