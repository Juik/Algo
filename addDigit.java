package testAndfun;

import java.util.ArrayList;
import java.util.List;

public class addDigit {
	public static void main(String args[]){
		List<Integer> num = new ArrayList<Integer>();
		for(int i=0;i<21;i++){
			num.add(i);
		}
		System.out.println("-------------------------------------");
		for(int i =0; i<num.size();i++){
			
			System.out.println("| when input is "+num.get(i)+" the answer is "+ addDigits(num.get(i))+" |");
		}
		System.out.println("-------------------------------------");
	}
	public static int addDigits(int num) {
		while((num+"").length()!=1){
			int tmp = 0;
			while(num!=0){
			tmp += num % 10;
			num = num / 10;
//			System.out.println(num);
			}
			num = tmp;
			
		}
		return num;
    }
	
}
