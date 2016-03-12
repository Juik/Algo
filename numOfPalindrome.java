package testAndfun;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class numOfPalindrome {
	
	static int palindrome(String str) {
	    String[] strArray = str.split("");
	    List<String> list = Arrays.asList(strArray);
	    list = list.subList(1, list.size());
	    //Set does'nt allow duplicates.
	    //Sublist is required because split method gives an extra space.
	    Set<String> palindromeSet = new HashSet<String>(list);
	    String palindromeStr = null;
	    for(int i = 0;i<list.size();i++){
	        palindromeStr = list.get(i);
	        for(int j = i+1;j<list.size();j++){
	            palindromeStr = palindromeStr+list.get(j);
	            if(isPalindrome(palindromeStr)){
	                palindromeSet.add(palindromeStr);
	            }
	        }
	    }
	    return palindromeSet.size();
	}

	static boolean isPalindrome(String str){
	    char[] chars = str.toCharArray();
	    for(int i =0;i<(chars.length/2);i++){
	        if(chars[i] != chars[chars.length-1-i]){
	            return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args){
	    System.out.println(palindrome("aabaa"));
	}

	
	
	
	
//	Set<String> set = new HashSet<String>();
//	public static void main(String[] args){
//		numOfPalindrome np = new numOfPalindrome();
//		String input = "aabaa";
//		System.out.print(np.numofPal(input));
//	}
//	
//	public int numofPal(String str){
//		int sum = 0;
//		
//		for(int i=1;i<str.length();i++){
//			sum += findPals(i,str);
//		}
//		return sum;
//	}
//	
//	private int findPals(int skip, String str){
//		int count = 0;
//		for(int i=0;i<str.length()-skip+1;i++){
//			if(isPalindrome(str.substring(i, i+skip)))
//				count++;
//		}
//		return count;
//	}
//	
//	private boolean isPalindrome(String sub){
//		for(int i=0;i<sub.length()/2;i++){
//			if(sub.charAt(i)!=sub.charAt(sub.length()-1-i))
//				return false;
//		}
//		return true;
//	}
}
