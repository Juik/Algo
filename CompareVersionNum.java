package testAndfun;

public class CompareVersionNum {
	public static void main(String[] args){
		CompareVersionNum cvn = new CompareVersionNum();
		String input1 = new String("1.1");
		String input2 = new String("1.01.0");
		System.out.println(cvn.compareVersion(input1, input2));
	}
	 public int compareVersion(String version1, String version2) {
		 if(!version1.contains(".")||!version2.contains("."))
				if(Float.parseFloat(version1)==Float.parseFloat(version2))
					return 0;
				else
					return Float.parseFloat(version1)>Float.parseFloat(version2)?1:-1;
		 String[] ver1 = new String[100];
		 String[] ver2 = new String[100];
		 ver1 = version1.split("\\.");
		 ver2 = version2.split("\\.");
		 int mark = 0;
		 if(ver1.length>ver2.length)
			 mark = Integer.parseInt(ver1[ver1.length-1]);
		 
		 if(ver1.length<ver2.length)
			 mark = Integer.parseInt(ver2[ver2.length-1]);
			 
		 for(int i=0;i<Math.min(ver1.length, ver2.length);i++){
			 //System.out.println(ver1[i]+"?"+ver2[i]);
			 //System.out.println(ver1.length+"长度"+ver2.length);
			 
			 if(Integer.parseInt(ver1[i])>Integer.parseInt(ver2[i])||
					 (ver1[i]!=null&&ver2[i]==null))	return 1;
			 if(Integer.parseInt(ver1[i])<Integer.parseInt(ver2[i])||
					 (ver1[i]==null&&ver2[i]!=null))	return -1;
			 if(Integer.parseInt(ver1[i])==Integer.parseInt(ver2[i])
					 &&i==ver1.length-1&&i==ver2.length-1)	return 0;
		 }
		if(mark==0)	return 0;
		else
		 return ver1.length>ver2.length?1:-1;
	 }
}
