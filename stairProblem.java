package testAndfun;
//
import java.util.Scanner;
import java.lang.*;

public class stairProblem {
	public static void  main(String args[]) throws Exception{
		System.out.println("Please input the num of stairs:");
		Scanner a = new Scanner(System.in);
		String str = a.nextLine();
		if(!isQualify(str))		throw new Exception("wrong input");
		System.out.println(resolve(Integer.parseInt(str)));
		
	}
	
	private static boolean isQualify(String str){
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)<'0'||str.charAt(i)>'9'){
				return false;
			}
		}
		return true;
	}
	
	private static int resolve(int i){
		if(i==1) return 1;
		else if(i==2) return 2;
		else	return resolve(i-1)+resolve(i-2);
	}
	
	
}
