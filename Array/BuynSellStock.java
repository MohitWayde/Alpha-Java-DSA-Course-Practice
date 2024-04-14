package Array;

public class BuynSellStock {
	public static int calculateHighestProfit(int[] stockPrices){
		int buyingPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		int currentProfit = 0;
		for(int i = 0; i < stockPrices.length;i++){
			if(buyingPrice < stockPrices[i]){
				System.out.println("Buying price is "+buyingPrice+" & stock price is "+stockPrices[i]);
				currentProfit = stockPrices[i] - buyingPrice;
				maxProfit = Math.max(maxProfit, currentProfit);
				System.out.println("Max Profit is "+maxProfit);
			}
			else{
				System.out.println("Buying price is not less than current stock price, buying price is "+buyingPrice+" & stock price is "+stockPrices[i]);
				buyingPrice = stockPrices[i];
			}
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		// int stockPrices[] = {7,1,5,3,6,4};
		// int stockPrices[] = {1,7,5,3,6,4};
		int stockPrices[] = {7, 6, 4,  3, 1};
		System.out.println("The Highest profit is "+calculateHighestProfit(stockPrices));
	}
}
