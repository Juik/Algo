package testAndfun;

public class romanToInteger {
	public static void main(String args[]){
		String s="XLIV";
		romanToInteger rt = new romanToInteger();
		System.out.println(rt.romanToInt(s));
		
	}
	
	public int read(char c){
		switch(c){
		case 'M': return 1000;
		case 'D': return 500;
		case 'C': return 100;
		case 'L': return 50;
		case 'X': return 10;
		case 'V': return 5;
		case 'I': return 1;
		default: return 0;
		}
	}
	
	public int romanToInt(String s) {
        int result=0;
        int po;
        int tmp=10000;
        if(s.length()==1) return read(s.charAt(0));
        else if(s.length()==0) return 0;
        else{
		for(int i=0;i<s.length();i++){
			po=read(s.charAt(i));
			System.out.println("po:"+po);
			if(po>tmp)	result=result-2*tmp+po;
			else result+=po;
			System.out.println("result:"+result);
			tmp = po;
			
        }
        }
        return result;
    }
}
