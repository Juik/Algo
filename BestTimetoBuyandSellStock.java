package testAndfun;

public class BestTimetoBuyandSellStock {
	public static void main(String args[]){
		BestTimetoBuyandSellStock bs = new BestTimetoBuyandSellStock();
		int[] bit = {1,2,3,4,2,4,6,8,6,34,23,1,2,4,3,12,5,6};
		System.out.println(bs.maxProfit(bit));
	}
	public int maxProfit(int[] prices) {
		int max=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<prices.length;i++){
			if(prices[i]<min)	min=prices[i];
			int dif = prices[i]-min;
			if(dif>max)	max=dif;
		}
		return max;
		
    }
}
