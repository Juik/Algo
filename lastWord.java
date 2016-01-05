package testAndfun;

public class lastWord {
	public static void main(String args[]){
		lastWord lw = new lastWord();
		String s ="     a";
		System.out.println(lw.lenthOfLastWord(s));
	}

	public int lenthOfLastWord(String s){
		int i=s.length()-1;
		int count=0;
		if(s.equals(""))   return 0;
		while(s.charAt(i)==' ')	{if(i==0)   return 0; i--;}
		while(i>=0 && s.charAt(i)!=' ' ){
			if((s.charAt(i)>='a'&& s.charAt(i)<='z')||(s.charAt(i)>='A'&& s.charAt(i)<='Z')){
				count++;
				i--;
				}
			else return 0;
		}
		return count;
	}

}
