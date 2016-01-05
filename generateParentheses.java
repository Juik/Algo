package testAndfun;

import java.util.ArrayList;
import java.util.List;

public class generateParentheses {
	public static void main(String args[]){
		generateParentheses gp = new generateParentheses();
		System.out.println(gp.generateParenthesis(3));
	}
	public List<String> generateParenthesis(int n) {
		if(n<=0)	return null;
		ArrayList<String>	list = new ArrayList<String>();
		String str = new String();
		dfs(list,str,n,n);
		return list;
    }
	
	private void	dfs(ArrayList<String> list, String str, int left, int right){
		if(left>right)	return;//problem with ")("
		if(left==0&&right==0){
			list.add(str);
		}
		if(left>0)	dfs(list,str+"(",left-1,right);
		if(right>0)	dfs(list, str+")",left,right-1);
	}
}
