package testAndfun;

public class moveZero {
	public static void main(String[] args){
		int[] nums={0,0,1};
		moveZero mz = new moveZero();
		mz.moveZeroes(nums);
//		prinf(nums);
	}
	
	 public void moveZeroes(int[] nums) {
		 	int t = 0;
	        for(int i=0;i<nums.length;i++){
	        	prinf(nums);
	            if(nums[i]==0){
	                for(int j=i;j<nums.length-1;j++){
	                    nums[j] = nums[j+1];
	                }
	                nums[nums.length-1] = 0;
	                i = i - 1;
	                t += 1;
	            }
	            if(i + t == nums.length-1)	break;
	        }
	    }
	 
	 private static void prinf(int[] inputs){
		 for(int input : inputs){
			 System.out.print(input+" ");
		 }
		 System.out.println();
	 }
}
