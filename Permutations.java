package testAndfun;

import java.util.ArrayList;

public class Permutations {
	public ArrayList<ArrayList<Integer>> permute(int[] num) {
        boolean visited[] = new boolean[num.length];
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        permut(num,visited,tmp,list);
        return list;
    }
	private static void permut(int[] num,boolean[] visited,ArrayList<Integer> tmp,ArrayList<ArrayList<Integer>> list ){
		if(tmp.size()==num.length)	list.add(tmp);
		for(int i=0;i<num.length;i++){
			if(visited[i]==false){
				tmp.add(num[i]);
				visited[i]=true;
				permut(num,visited,tmp,list);
				visited[i]=false;
				tmp.remove(tmp.size()-1);//why??for what?
			}
		}
	}
	
}
