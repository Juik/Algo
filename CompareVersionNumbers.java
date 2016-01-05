//这个版本我完全理解错了，但是写的非常精彩。。。留下来吧，下次我重新写
package testAndfun;

public class CompareVersionNumbers {
	public static void main(String[] args){
		CompareVersionNumbers cvn = new CompareVersionNumbers();
		String v1 = "1.10";
		String v2 = "1.10";
		System.out.println(cvn.compareVersion(v1, v2));
	}
	
public int compareVersion(String version1, String version2) {
		if(!version1.contains(".")||!version2.contains("."))
			if(Float.parseFloat(version1)==Float.parseFloat(version2))
				return 0;
			else
				return Float.parseFloat(version1)>Float.parseFloat(version2)?1:-1;
		String out1="";
		String out2="";
        String[] ver1 = version1.split("\\.");
        for(int i=0;i<ver1.length;i++){
        	out1 += ver1[i];
        }
        System.out.println(out1);
        
        String[] ver2 = version2.split("\\.");
        for(int i=0;i<ver2.length;i++){
        	out2 += ver2[i];
        }
        System.out.println(out2);
        
        int len1 = out1.length();
        int len2 = out2.length();
        int i=0;
        int j=0;
        while(i<len1&&j<len2){
        		System.out.println("out1:"+out1.charAt(i)+"out2:"+out2.charAt(j));
        		if(out1.charAt(i)>out2.charAt(j))
        			return 1;
        		else if(out1.charAt(i)==out2.charAt(j)&&((i==len1-1&&j!=len2-1)||(j==len2-1&&i!=len1-1)))
        			return i==len1-1&&j!=len2?-1:1;
        		else if(out1.charAt(i)==out2.charAt(j)&&(i==len1-1&&j==len2-1))
        			return 0;
        		else if(out1.charAt(i)<out2.charAt(j))
        			return -1;
        		i++;
        		j++;
        }
		return 0;
    }
}
