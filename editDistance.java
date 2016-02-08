package testAndfun;

public class editDistance {
	
	//main idea is to find the longest common subsequence
	public static void main(String[] args){
//		editDistance ed = new editDistance();
		String word1 = "";
		String word2 = "";
//		System.out.println(ed.minDistance(word1, word2));
		System.out.println(minDis(word1, word2));
//		System.out.println("s".substring(0,0));
	}
	
	public static int minDis(String w1, String w2){

		if(w1.equals("")||w1==null)
			return w2.length();
		if(w2.equals("")||w2==null)
			return w1.length();
		if(w1.charAt(w1.length()-1)==w2.charAt(w2.length()-1))
			return minDis(w1.substring(0, w1.length()-1),w2.substring(0, w2.length()-1));
		
		return min(minDis(w1.substring(0, w1.length()-1),w2.substring(0, w2.length()-1))+1,
				minDis(w1.substring(0, w1.length()-1),w2)+1,
				minDis(w1,w2.substring(0,w2.length()-1))+1
				);
	}
	
	public static int min(int s1, int s2, int s3){
		return Math.min(s1, Math.min(s2, s3));
	}
	
	
	//below this was my previous attempt
	//but this one is very low efficiency when two strings are too long
	public static String lcs(String a, String b) {
		 int aLen = a.length();
		    int bLen = b.length();
		    if(aLen == 0 || bLen == 0){
		        return "";
		    }else if(a.charAt(aLen-1) == b.charAt(bLen-1)){
		        return lcs(a.substring(0,aLen-1),b.substring(0,bLen-1))
		            + a.charAt(aLen-1);
		    }else{
		        String x = lcs(a, b.substring(0,bLen-1));
		        String y = lcs(a.substring(0,aLen-1), b);
		        return (x.length() > y.length()) ? x : y;
		    }
    }
	
	public static String lcs1(String a, String b) {
	    int[][] lengths = new int[a.length()+1][b.length()+1];
	 
	    // row 0 and column 0 are initialized to 0 already
	 
	    for (int i = 0; i < a.length(); i++)
	        for (int j = 0; j < b.length(); j++)
	            if (a.charAt(i) == b.charAt(j))
	                lengths[i+1][j+1] = lengths[i][j] + 1;
	            else
	                lengths[i+1][j+1] =
	                    Math.max(lengths[i+1][j], lengths[i][j+1]);
	 
	    // read the substring out from the matrix
	    StringBuffer sb = new StringBuffer();
	    for (int x = a.length(), y = b.length();
	         x != 0 && y != 0; ) {
	        if (lengths[x][y] == lengths[x-1][y])
	            x--;
	        else if (lengths[x][y] == lengths[x][y-1])
	            y--;
	        else {
	            assert a.charAt(x-1) == b.charAt(y-1);
	            sb.append(a.charAt(x-1));
	            x--;
	            y--;
	        }
	    }
	 
	    return sb.reverse().toString();
	}
	
	public int minDistance(String word1, String word2) {
		System.out.println(lcs1(word1,word2));
//		System.out.println(Math.max(word1.length(), word2.length()) - lcs(word1,word2).length());
        return Math.max(word1.length(), word2.length()) - lcs1(word1,word2).length();
    }
	
}
