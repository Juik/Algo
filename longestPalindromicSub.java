package testAndfun;

public class longestPalindromicSub {
	int lo, maxLen;
	
	public static void main(String[] args){
		longestPalindromicSub lps =new longestPalindromicSub();
//		System.out.println(checkCentre("racecar",3));
		System.out.println(lps.longestPalindrome("saojlnzuqpracecarpquz,c,zuonklqpzmsjlasiewvvz,l"));
	} 
	
	
	public String longestPalindrome_mostBeautiful(String s) {
	    int len = s.length();
	    if (len < 2)
	        return s;

	    for (int i = 0; i < len-1; i++) {
	        extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
	        extendPalindrome(s, i, i+1); //assume even length.
	    }
	    return s.substring(lo, lo + maxLen);
	}

	private void extendPalindrome(String s, int j, int k) {
	    while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
	        j--;
	        k++;
	    }
	    if (maxLen < k - j - 1) {
	        lo = j + 1;
	        maxLen = k - j - 1;
	    }
	}
	
	
	public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return "";
        }
        int len = s.length();
        boolean[][] dp = new boolean[len][len];//dp[j][i]==true means array from j to i is palindrome
        int start = 0;
        int end = 0;
        int max = 0;
        
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j <= i; j++) {
                if(s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[j+1][i-1])) {
                    dp[j][i] = true;
                }
                if(dp[j][i] && max < i - j + 1) {
                    max = i - j + 1;
                    start = j;
                    end = i;
                }
            }
        }
        return s.substring(start, end + 1);
    }
	
	public String longestPalindrome2(String s) {
		
		String max = "";
		
		if(s==null||s.length()==0)
			return max;
		if(s.length()==1)
			return s;
        for(int i=1;i<s.length()-1;i++){
        	if(checkCentre(s,i).length() > max.length())
        		max = checkCentre(s,i);
        }
        return max;
    }
	
	//dude, I didn't consider about add/even condition of palindrome
	//assume s.charAt(i) as the centre of a palindrome, return the palindrome
	private static String checkCentre(String s, int i){
		String ret = "";
		int left = i-1;
		int right = i+1;
		while(left>=0 && right <= s.length()-1){
			if(s.charAt(left)==s.charAt(right)){
				ret += s.charAt(left);
				left--;
				right++;
			}
			else
				break;
		}
		return (new StringBuilder(ret).reverse().toString())+s.charAt(i)+ret;
	}
}
