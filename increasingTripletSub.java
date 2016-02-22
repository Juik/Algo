package testAndfun;

public class increasingTripletSub {
	public static void main(String artgs[]){
		increasingTripletSub is = new increasingTripletSub();
		int[] input = {5,41,3,1,2,19};
		System.out.println(is.increasingTriplet(input));
	}
	
	public boolean increasingTriplet(int[] nums) {
		int flag1 = Integer.MAX_VALUE;
		int flag2 = Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++){
			if(nums[i] > flag2)
				return true;
			else if(nums[i] > flag1)
				flag2 = nums[i];
			else
				flag1 = nums[i];
		}
		return false;
    }
}
