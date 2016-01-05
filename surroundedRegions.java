package testAndfun;

public class surroundedRegions {
	
	public static void main(String args[]){
		surroundedRegions sr = new surroundedRegions();
		char sample[][]={{'X','X','X'},{'X','0','X'},{'X','X','X'}};
		sr.solve(sample);
		for(int i=0;i<sample.length;i++){
	        	for(int j=0;j<sample[0].length;j++){
	        		System.out.print(sample[i][j]);
	        		}
		 System.out.println();
		 }
	}
	
	public void solve(char[][] board) {  
        if (board == null || board.length == 0) {  
            return;  
        }  
        int height = board.length;  
        int width = board[0].length;  
        boolean[][] visit = new boolean[height][width];   
        for(int i = 0 ; i < width; i++){  
            if(board[0][i] == 'O')  visit[0][i] = true;  
            if(board[height - 1][i] == 'O') visit[height - 1][i] = true;  
        }  
        for(int i = 0 ; i < height; i++){  
            if(board[i][0] == 'O') visit[i][0] = true;  
            if(board[i][width - 1] == 'O') visit[i][width - 1] = true;  
        }  
        for(int i = 0 ; i < visit.length; i++){  
            for(int j = 0; j < visit[0].length;j++){  
                if(visit[i][j]){  
                    dfs(board, visit, i, j);  
                }  
            }  
        }  
        for(int i = 1; i < height; i++){  
            for(int j = 1; j < width; j++){  
                if(board[i][j] == 'O' && !visit[i][j]){  
                    board[i][j] = 'X';  
                }  
            }  
        }  
    }  
    private void dfs(char[][] board,boolean[][] visit,int i ,int j){  
        visit[i][j] = true;  
        if(i > 0 && board[i - 1][j] == 'O' && !visit[i - 1][j]){  
            dfs(board, visit, i - 1, j);  
        }  
        if(i < visit.length - 1 && board[i + 1][j] == 'O' && !visit[i + 1][j]){  
            dfs(board, visit, i + 1, j);  
        }  
        if(j > 0 && board[i][j - 1] == 'O' && !visit[i][j - 1]){  
            dfs(board, visit, i, j - 1);  
        }  
        if(j < visit[0].length - 1 && board[i][j + 1] == 'O' && !visit[i][j + 1]){  
            dfs(board, visit, i, j + 1);  
        }  
    }  
	
	
	
	/*
	Boolean[][] visited;
	Boolean[][] captured;
	int len1;
	int len2;
	public void solve(char[][] board) {
		if (board == null || board.length == 0) {  
            return;  
        } 
        len1=board.length;
        len2=board[0].length;
        if(len1<=2||len2<=2)	return;
        
        captured = new Boolean[len1][len2];
        for(int i=0;i<len1;i++)
        	for(int j=0;j<len2;j++)
        		captured[i][j]=new Boolean(false);
        
        visited= new Boolean[len1][len2];
        for(int i=0;i<len1;i++)
        	for(int j=0;j<len2;j++)
        		visited[i][j]=new Boolean(false);
        
        for(int j=0;j<len2;j++){
        	if(board[0][j]=='0')	{
        		captured[0][j]=true;
        		visited[0][j]=true;
        		search(board[0][j],0,j,board);
        	}
        }
        for(int j=0;j<len2;j++){
        	if(board[len1-1][j]=='0')	{
        		captured[len1-1][j]=true;
        		visited[len1-1][j]=true;
        		search(board[len1-1][j],len1-1,j,board);
        	}
        }
        for(int i=0;i<len1;i++){
        	if(board[i][0]=='0')	{
        		captured[i][0]=true;
        		visited[i][0]=true;
        		search(board[i][0],i,0,board);
        	}
        }
        for(int i=0;i<len1;i++){
        	if(board[i][len2-1]=='0')	{
        		captured[i][len2-1]=true;
        		visited[i][len2-1]=true;
        		search(board[i][len2-1],i,len2-1,board);
        	}
        }
        
        //After every search
        for(int i=0;i<len1;i++)
        	for(int j=0;j<len2;j++)
        		if(captured[i][j]==false)	board[i][j]='X';
    }

	private void search(char c,int x, int y, char[][] board) {
		if(x==0){
			if(y==0){
				if(board[x+1][y]=='0' && visited[x+1][y]==false)	{visited[x+1][y]=true;captured[x+1][y]=true;search(board[x+1][y],x+1,y,board);}//下面
				if(board[x][y+1]=='0' && visited[x][y+1]==false)	{visited[x][y+1]=true;captured[x][y+1]=true;search(board[x][y+1],x,y+1,board);}//右边
			}
			else if(y==len2-1){
				if(board[x+1][y]=='0' && visited[x+1][y]==false)	{visited[x+1][y]=true;captured[x+1][y]=true;search(board[x+1][y],x+1,y,board);}//下面
				if(board[x][y-1]=='0' && visited[x][y-1]==false)	{visited[x][y-1]=true;captured[x][y-1]=true;search(board[x][y-1],x,y-1,board);}//左边
			}
			else{
				if(board[x+1][y]=='0' && visited[x+1][y]==false)	{visited[x+1][y]=true;captured[x+1][y]=true;search(board[x+1][y],x+1,y,board);}
				if(board[x][y-1]=='0' && visited[x][y-1]==false)	{visited[x][y-1]=true;captured[x][y-1]=true;search(board[x][y-1],x,y-1,board);}
				if(board[x][y+1]=='0' && visited[x][y+1]==false)	{visited[x][y+1]=true;captured[x][y+1]=true;search(board[x][y+1],x,y+1,board);}
			}
		}
		else if(x==len1-1){
			if(y==0){
				if(board[x-1][y]=='0' && visited[x-1][y]==false)	{visited[x-1][y]=true;captured[x-1][y]=true;search(board[x-1][y],x-1,y,board);}
				if(board[x][y+1]=='0' && visited[x][y+1]==false)	{visited[x][y+1]=true;captured[x][y+1]=true;search(board[x][y+1],x,y+1,board);}
			}
			else if(y==len2-1){
				if(board[x-1][y]=='0' && visited[x-1][y]==false)	{visited[x-1][y]=true;captured[x-1][y]=true;search(board[x-1][y],x-1,y,board);}
				if(board[x][y-1]=='0' && visited[x][y-1]==false)	{visited[x][y-1]=true;captured[x][y-1]=true;search(board[x][y-1],x,y-1,board);}
			}
			else{
				if(board[x-1][y]=='0' && visited[x-1][y]==false)	{visited[x-1][y]=true;captured[x-1][y]=true;search(board[x-1][y],x-1,y,board);}
				if(board[x][y+1]=='0' && visited[x][y+1]==false)	{visited[x][y+1]=true;captured[x][y+1]=true;search(board[x][y+1],x,y+1,board);}
				if(board[x][y-1]=='0' && visited[x][y-1]==false)	{visited[x][y-1]=true;captured[x][y-1]=true;search(board[x][y-1],x,y-1,board);}
			}
		}
		else{
			if(board[x+1][y]=='0' && visited[x+1][y]==false)	{visited[x+1][y]=true;captured[x+1][y]=true;search(board[x+1][y],x+1,y,board);}//down
			if(board[x-1][y]=='0' && visited[x-1][y]==false)	{visited[x-1][y]=true;captured[x-1][y]=true;search(board[x-1][y],x-1,y,board);}//up
			if(board[x][y+1]=='0' && visited[x][y+1]==false)	{visited[x][y+1]=true;captured[x][y+1]=true;search(board[x][y+1],x,y+1,board);}//right
			if(board[x][y-1]=='0' && visited[x][y-1]==false)	{visited[x][y-1]=true;captured[x][y-1]=true;search(board[x][y-1],x,y-1,board);}//left
		}
	}
	*/
}
