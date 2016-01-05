package testAndfun;

import java.util.HashMap;

public class FractiontoRecurringDecimal {
	String temp = new String();//for inside to remember right output
	String rem = new String();
    String output = new String();
    String tmp = new String();//return output
    
	public static void main(String[] args){
		FractiontoRecurringDecimal frd = new FractiontoRecurringDecimal();
		System.out.println(frd.fractionToDecimal(2, 3));
	}
	
	public String fractionToDecimal(int numerator, int denominator) {
		if(numerator==0)	return new String("0");
		boolean flag = (numerator<0&&denominator>0 || numerator>0&&denominator<0);//(numerator < 0)^(denominator < 0);
		long Numerator = Math.abs((long)numerator);
		long Denominator = Math.abs((long)denominator);
		StringBuffer res = new StringBuffer();
        if (flag == true) res.append('-');
        res.append(String.valueOf((Numerator / Denominator)));
        System.out.println(res.toString());
		Numerator = Numerator % Denominator;
		if(Numerator==0)	return res.toString();
		res.append('.');
		
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        for (int i = res.length(); Numerator != 0; ++i) {
            if (map.get(Numerator) != null) break;
            map.put(Numerator, i);
            Numerator *= 10;
            res.append(String.valueOf((Numerator / Denominator)));
            Numerator %= Denominator;; 
        }
        
        if (Numerator == 0) return res.toString();
        res.insert(map.get(Numerator),"(");
        res.append(')');
        return res.toString();
		
//        if(numerator * denominator < 0)	output += "-";//if the result is negative
//        
//        int remainder = numerator % denominator;
//        if(remainder==0)	return numerator / denominator +"";//it's not a decimal
//        output += numerator / denominator + ".";
//        
//        while(remainder!=0){
//        	if((rem.contains(remainder+""))){
//        		int i=0;
//        		while(remainder!=(int) rem.charAt(i)){
//        			System.out.println("remainder:"+remainder+" rem.charAt(i):"+rem.charAt(i));
//        			temp += tmp.charAt(i);
//        			i++;
//        			System.out.println(i);
//        		}
//        		temp += "("+tmp.substring(i)+")";
//        		tmp = temp;
//        	}
//        	rem+=remainder+"";
//        	remainder *= 10;
//        	tmp+=remainder/denominator+"";
//        	remainder = remainder%denominator;
//        	//System.out.println("remainder:"+remainder+" tmp:"+tmp);
//        }
//        output+=tmp;
//        return output;
    }
}
