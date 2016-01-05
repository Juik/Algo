package testAndfun;

public class Nim {
	   public static void main(String args[]){
		   int n1 = 13;
		   int n2 = 20;
		   Nim nim = new Nim();
		   System.out.println("It's "+nim.canWinNim(n1)+" to win the game");
		   System.out.println("It's "+nim.canWinNim(n2)+" to win the game");
	   }
	
	   public boolean canWinNim(int n) {
	        return n%4!=0;
	    }
}
