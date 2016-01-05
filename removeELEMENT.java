package testAndfun;
//
import java.util.Arrays;

public class removeELEMENT {
	public static void main(String args[]){
		removeELEMENT re = new removeELEMENT();
		int[] A={7,25,21,2,20,7,24,9,24,24,6,22,5,1,26,17,18,29,25,9,8,27,6,26,8,5,27,5,0,29,26,29,24,18,23,14,25,17,15,20,11,22,4,17,15,0,26,3,21,21,12,0,10,10,26,19,15,23,16,7,14,12,7,8,0,0,14,26,18,22,8,21,6,12,0,21,4,26,16,26,18,21};
		System.out.println(re.removeElement(A,26));
		
	}
	
    public int removeElement(int[] A, int elem) {
        String s = Arrays.toString(A);
        s=s.replace(elem+"","");
        s=s.replace(",","");
        s=s.replace(" ","");
        return s.length()-2;
    }
}
