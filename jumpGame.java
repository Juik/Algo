package testAndfun;

public class jumpGame {
	public static void main(String[] args){
		jumpGame jg = new jumpGame();
		int[] input = {2,1,3,1,1,4};
		int[] input2 = {2,1,0,3,4};
		System.out.println(jg.canJump(input2));
	}
	
	public boolean canJump(int[] nums) {
	        int maxReach = 0;
	        if(nums[0]==0&&nums.length==1)
	        	return true;
	        for(int i=0; i < nums.length; i++){
	        	if(maxReach < i)
	        		return false;
	        	if(maxReach < i+nums[i])
	        		maxReach = i + nums[i];
	        	
	        	
	        }
	        return true;
	    }
}
