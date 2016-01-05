package testAndfun;

public class gasStation {
	
	public static void main(String args[]){
		gasStation gs = new gasStation();
		int g[]={1,2,3,4,5};
		int c[]={3,4,5,1,2};
		System.out.println(gs.canCompleteCircuit(g, c));
		
	}
	/*
	public int canCompleteCircuit(int[] gas, int[] cost){
		int ans=-1;
		//如果gas小于cost，那肯定到不了，否则是一定能
		if(stats(gas)<stats(cost)){
			return ans;
		}
		ans = maxNum(gas);
		return ans;
	}
	
	//看这一圈有多少gas或cost
		public static int  stats(int[] input){
			int res=0;
			for(int i=0;i<input.length;i++){
				res+=input[i];
			}
			return res;
		}
	
	//看这个数组里面谁最多的下标
	public static int maxNum(int[] input){
		int max=0;
		if(input==null||input.length==0)
			return -1;
		for(int i=0;i<input.length;i++){
			if(input[i]>max)
				max = i;
		}
		return max;
	}
	*/
	public int canCompleteCircuit(int[] gas, int[] cost){
		int ans=-1;
		int sum=0;
		int total=0;
		if(stats(gas)<stats(cost))
			return ans;
		for(int i=0;i<gas.length;i++){
			sum += gas[i]-cost[i];
			total += gas[i]-cost[i];
			if(sum<0){
				ans=i;sum=0;
			}
		}
		if(total<0)	return -1;
		else return ans+1;
	}
	
	//看这一圈有多少gas或cost
		public static int  stats(int[] input){
			int res=0;
			for(int i=0;i<input.length;i++){
				res+=input[i];
			}
			return res;
		}
}
