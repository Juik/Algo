package testAndfun;

public class productArrayExceptSelf {
	public static void main(String[] args){
		productArrayExceptSelf paes = new productArrayExceptSelf();
		int[] input = {1,0};
		printf(paes.productExceptSelf(input));
	}
	
	public static void printf(int[] inp){
		for(int i=0;i<inp.length;i++){
			System.out.print(inp[i]+" ");
		}
	}
	
	
	 public int[] productExceptSelf(int[] nums) {
	     int[] output = new int[nums.length]; 
	     int product = 1;
	     for(int i=0;i<nums.length;i++){
	    	 product *= nums[i];
	     }
		 for(int i=0;i<nums.length;i++){
			 int tmp = 1;
			 if(nums[i]==0){
				 for(int j=0;j<i;j++){
					 tmp *= nums[j];
				 }
				 for(int j=i+1;j<nums.length;j++){
					 tmp *= nums[j];
				 }
			 output[i] = tmp;
			 }
			 else{
			 output[i] = product / nums[i];
			 }
		 }
	     
	     return output;
	    }
}
