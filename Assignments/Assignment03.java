import java.util.Scanner;

// CSE 110     : #11178
// Assignment  : Assignment 03
// Author      : Madison Chester - 1219358478
// Description : determine whether to buy, sell, or hold shares in a stock market

public class Assignment03 {

    public static void main(String[] args) {  
        // declare and instantiate the Scanner
    	Scanner in = new Scanner(System.in);
        
        // declare and initialize the variables
        int currentShares = 0;
        int marketPrice = 0;
        int purchasePrice = 0;
        int availableFunds = 0;
        
        // prompt for and collect the inputs
        System.out.print("Current Shares  : ");
        currentShares = in.nextInt();
        System.out.print("Market Price    : ");
        marketPrice = in.nextInt();
        System.out.print("Purchase Price  : ");
        purchasePrice = in.nextInt();
        System.out.print("Available Funds : ");
        availableFunds = in.nextInt();
        
        // compute the required values
        final int TRANSACTION_FEE = 10;
        double numberOfSharesToBuy = (availableFunds - TRANSACTION_FEE) / marketPrice;
        numberOfSharesToBuy = Math.floor(numberOfSharesToBuy);
        int numberOfShares2Buy = (int)numberOfSharesToBuy;
        int totalBuyCost = TRANSACTION_FEE + marketPrice * numberOfShares2Buy;
        int perShareBuyValue = purchasePrice - marketPrice;
        int totalBuyValue = perShareBuyValue * numberOfShares2Buy;
        int perShareSellValue = marketPrice - purchasePrice;
        int totalSellValue = perShareSellValue * currentShares;

        // display the required outputs
        if (marketPrice < purchasePrice && totalBuyValue > TRANSACTION_FEE)
        	System.out.println("Buy " + numberOfShares2Buy + " shares");
        	else if (marketPrice > purchasePrice && totalSellValue > TRANSACTION_FEE)
        		System.out.println("Sell " + currentShares + " shares");
        	else 
        		System.out.println("Hold shares");
        
       
    }
}
