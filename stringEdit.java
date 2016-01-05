package testAndfun;

public class stringEdit {
	public static void main(String[] args){
		stringEdit st = new stringEdit();
		String input = "BC";
		System.out.println(st.delete(st.str, input));
	}
	public String str;
	
	//如果什么都没输入，就按老师给的例子
	public stringEdit(){
		str = new String("ABCDBCEFGHTH");
	}
	
	//如果输入了就按输入的走
	public stringEdit(String in){
		str = new String(in);
	}
	
	//求长度
	public int len(){
		return str.length();
	}
	
	//插入字符串，s为原字符串，num为插入第num个数字之前，t为插入字符串
	public String insstr(String s, int num, String t){
		return s.substring(0, num-1)+t+s.substring(num-1);
	}
	
	//替换s中的t为p
	public String repl(String s, String p, String t){
		return s.replace(p, t);
	}
	
	public String delete(String s, String del){
		return s.replace(del, "");
	}
	
	//查找s中有没有p，有的话返回第几个，没有的话返回-1
	public int search(String s, String p){
		return s.indexOf(p);
	}
	
	//两个字符串连接
	public String strcat(String s, String p){
		return s+p;
	}
}
