package testAndfun;

public class IntegerToRoman {
	public static void main(String args[]){
		IntegerToRoman ir = new IntegerToRoman();
		System.out.println(ir.intToRoman(3842));
	}
	
	public String intToRoman(int num) {
        int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] number={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<value.length;i++){
        	while(num>=value[i]){
        		num-=value[i];
        		sb.append(number[i]);
        	}
        }
        return sb.toString();
    }
}
