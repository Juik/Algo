package testAndfun;

public class missingNum {

	public static void main(String[] args){
		missingNum mn = new missingNum();
		int[] nums = {0,1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17};
		System.out.println(mn.missingNumber(nums));
	}
	
	public int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length+1) / 2;
        int sum1 = 0;
        for(int i=0;i<nums.length;i++){
        	sum1 += nums[i];
        }
        return sum - sum1;
		
    }
}
