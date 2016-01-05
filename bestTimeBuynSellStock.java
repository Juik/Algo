package testAndfun;

public class bestTimeBuynSellStock {
	public static void main(String args[]){
	bestTimeBuynSellStock bb = new bestTimeBuynSellStock();
	int[] p={2,1,2,0,1};
	System.out.println("answer is:"+bb.maxProfit(p));
	}
	public int maxProfit(int[] prices) {
        int start;
        int end;
        int i=0;
        int account=0;
        if(prices.length<=1)    return 0;
        while(i<prices.length-1){
        	//System.out.println("round:"+i);
        while(prices[i]>=prices[i+1])	{
        	i++;
        	//System.out.println(i);
        	if(i==prices.length-1)	break;
        	}
        start = prices[i];
        if(i==prices.length-1)	return account;
        while(prices[i]<=prices[i+1])	{
        	i++;
        	//System.out.println(i);
        	if(i==prices.length-1)	break;
        }
        end = prices[i];
        account+=end-start;
	}
        return account;
	}
}
