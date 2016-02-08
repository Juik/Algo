package testAndfun;

public class rotateArrayIII {
	public static void main(String args[]){
		rotateArrayIII ra = new rotateArrayIII();
		int[] nums = {-1};
		ra.rotate(nums, 2);
		prinf(nums);
	}
	public void rotate(int[] nums, int k) {
        int kk = k % nums.length;
        int[] new_nums = new int[nums.length];
        for(int i=0;i<kk;i++){
        	new_nums[i] = nums[nums.length - kk + i];
        }
        for(int i=kk;i<nums.length;i++){
        	new_nums[i] = nums[i - kk];
        }
        
//        prinf(new_nums);
        
        for(int i=0;i<nums.length;i++){
        	nums[i] = new_nums[i];
        }
        
    }
	
	public static void prinf(int[] input){
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}
}
