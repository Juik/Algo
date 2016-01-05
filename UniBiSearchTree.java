package testAndfun;

public class UniBiSearchTree {
	public int numTrees(int n) {

        if(n==0)	return 1;
        if(n==1)	return 1;
        return helper(n);
    }
	private int helper(int n){
		int result=0;
		for(int i=0;i<n;i++){
			result+=numTrees(i)*numTrees(n-i-1);
		}
		return result;
	}
}
