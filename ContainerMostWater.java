package testAndfun;

public class ContainerMostWater {
	public static void main(String args[]){
		ContainerMostWater  cw = new 	ContainerMostWater();
		int[] a={2,3,1,5,2,4,8,4,2,9,11,2,4};
		System.out.print(cw.maxArea(a));
	}

	public int maxArea(int[] height) {
		/*
        int max=0;
        for(int i=0;i<height.length;i++){
        	for(int j=i+1;j<height.length;j++){
        		int area = Math.min(height[i], height[j])*(j-i);
        		if(area>max)	max=area;
        	}
        }
        return max;
        */
		int left=0;
		int right=height.length-1;
		int max=0;
		while(left<right){
			int area=Math.min(height[left], height[right])*(right-left);
			if(area>max)	max=area;
			if(height[left]>height[right])	right=findright(height,right);
			else	left=findleft(height,left);
			
		}
		return max;
    }
	private int findright(int[] height,int r){
		for(int i=r-1;i>=0;i--){
			if(height[i]>height[r])	return i;
			
		}
		return 0;
	}
	private int findleft(int[] height,int l){
		for(int i=l+1;i<height.length;i++){
			if(height[i]>height[l])	return i;
		}
		return height.length-1;
	}
}
