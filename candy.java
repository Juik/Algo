package testAndfun;

public class candy {
	public static void main(String[] args){
		candy c = new candy();
		int[] input = {4,3,2,1};
		prinf(input);
		System.out.println(c.candy_num(input));
	}
	
	public int candy_num(int[] ratings){
		if(ratings==null||ratings.length==0)
			return 0;
		if(ratings.length==1)
			return 1;
		

		//forward
		int[] candy = new int[ratings.length];
		candy[0] = 1;
		for(int i=1;i<ratings.length;i++){
			if(ratings[i]>ratings[i-1])
				candy[i] = candy[i-1] + 1;
			else
				candy[i] = 1;
		}
		prinf(candy);
		
		//backward
		int sum = candy[ratings.length-1];
		for(int i=ratings.length-1;i>0;i--){
			if(ratings[i-1]>ratings[i] && candy[i] >= candy[i-1])
				candy[i-1] = candy[i] + 1;
			sum += candy[i-1];
		}
		prinf(candy);
		return sum;
	}
	
	private static void prinf(int[] in){
		for(int i=0;i<in.length;i++)
			System.out.print(in[i]+" ");
		System.out.println();
	}
}
