package testAndfun;

import java.util.HashSet;

public class validSudoku {
	
	public boolean isValidSudoku(char[][] board) {
        //first judge column
		for(int i=0;i<board[0].length;i++){
			HashSet<Character> column = new HashSet<Character>();
			for(int j=0;j<board.length;j++){
				if(board[i][j]!='.'&&!column.add(board[i][j]))	return false;
			}
		}
		
		//then judge row
		for(int i=0;i<board.length;i++){
			HashSet<Character> row = new HashSet<Character>();
			for(int j=0;j<board[i].length;j++){
				if(board[i][j]!='.'&&!row.add(board[i][j]))	return false;
			}
		}
		
		//check 3*3 
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				HashSet<Character> sub = new HashSet<Character>();
				for(int m=i*3;m<i*3+3;m++){
					for(int n=j*3;n<j*3+3;n++){
						if(board[m][n]!='.'&&!sub.add(board[m][n]))	return false;
					}
				}
			}
		}
		
		return true;
    }
	
}
