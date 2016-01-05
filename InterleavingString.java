package testAndfun;
//////////////////////////////////////////////////////////////////////problem big
/*


*/
public class InterleavingString {
    int pt1=0;
    int pt2=0;
    int pt3=0;
    public static void main(String args[]){
    	InterleavingString is = new InterleavingString();
    	String s1="aabcc";
    	String s2="dbbca";
    	String s3="aadbbcbcac";
    	String s4="aadbbbaccc";
    	System.out.println(is.isInterleave(s1, s2, s3));
    }
	public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())	return false;
        return helper(s1,s2,pt1,pt2,s3,pt3);
    }
	
	private boolean helper(String s1,String s2,int pt1, int pt2, String s3,int pt3){
		
		if(pt1>s1.length()-1||pt2>s2.length())	return false;
		System.out.println(s1.charAt(pt1)+""+pt1+""+s2.charAt(pt2)+""+pt2+""+s3.charAt(pt3)+pt3);
		if(pt1==s1.length()-1&&pt2==s2.length()-1)	return true;
		if(s3.charAt(pt3)!=s1.charAt(pt1)&&s3.charAt(pt3)!=s2.charAt(pt2))	return false;
		return ((s3.charAt(pt3)==s1.charAt(pt1)) && helper(s1,s2,++pt1,pt2,s3,++pt3)) ||
		((s3.charAt(pt3)==s2.charAt(pt2)) && helper(s1,s2,pt1,++pt2,s3,++pt3));
		
	}
}
