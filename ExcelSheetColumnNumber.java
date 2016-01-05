package testAndfun;

public class ExcelSheetColumnNumber {
	public static void main(String args[]){
		ExcelSheetColumnNumber ecn = new ExcelSheetColumnNumber();
		System.out.println(ecn.titleToNumber("CSDS"));
	}
	public int titleToNumber(String s) {
		int tmp = 0;
        for(int i=0;i<s.length();i++){
        	int in = s.charAt(i)-64;
        	tmp = tmp*26+in;
        }
        return tmp;
    }
}
