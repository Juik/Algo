package testAndfun;

public class findPathinMaze {
	public static void main(String[] args){
		findPathinMaze fp = new findPathinMaze();
		int[][] maze = {{1,0,9,1},
						{1,1,0,1},
						{0,1,1,1},
						};
		System.out.println(fp.maze(maze));
	}
	
	
	public int maze(int[][] grid){
		int[][] bool = new int[grid.length][grid[0].length];
		bool[0][0] = grid[0][0];
		for(int i=0;i<bool.length;i++){
			for(int j=0;j<bool[0].length;j++){
				if(i==0 && j==0)
					continue;
				//少考虑了最右边和最下边的情况，所以上面给的例子没成立，下次头不疼了把这两个case的if加上。
				if(i==0)
					if(grid[0][j-1]==1||grid[1][j]==1)
						bool[0][j]=1;
					else
						bool[0][j]=0;
				else if(j==0)
					if(grid[i-1][0]==1||grid[i][1]==1)
						bool[i][0]=1;
					else
						bool[i][0]=0;
				else
					bool[i][j] = Math.max(bool[i-1][j],bool[i][j-1]);
				
				if(grid[i][j]==9 && bool[i][j]==1)
					return 1;
			}
		}
		return 0;
	}
}
