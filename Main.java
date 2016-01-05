package testAndfun;import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;

public class Main {
	static int N = 49631;
	public static void main(String[] args){
		String filename = "/Users/FredQiu/Desktop/final_prject/raw_49631.txt";
		String outFile = "/Users/FredQiu/Desktop/final_prject/formatted_data_49631.csv";
		String[] title = new String[N];
		String[] year = new String[N];
		String[] genre = new String[N];
		String[] creator = new String[N];
		String[] description = new String[N];
		String[] rating = new String[N];
		
		try {
			BufferedReader br = new BufferedReader( new InputStreamReader(new FileInputStream(filename),"UTF-8"));
			String line;
			boolean newline=false;
			int col= 0;
			int row =0;
			while ((line = br.readLine()) != null) {
				if(line.equals("@")){
					col=0;
					if(newline)
						row++;
					newline = !newline;
				}else if(line.equals("$")){
					col++;
				}else {
					switch(col){
					case 0:
						title[row]=line;
/*						if(line.equals("Creed (2015) - IMDb"))
							System.out.println(row);
*/						break;
					case 1:
						rating[row]=line;
						break;
					case 2:
						year[row]=line;
						break;
					case 3:
						genre[row]=line;
						break;
					case 4:
						creator[row]=line;
						break;
					case 5:
						description[row]=line;
						break;
					}
				}
			}
			br.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
//		printArr(title);
//		printArr(rating);
//		printArr(year);
//		printArr(genre);
//		printArr(creator);
//		printArr(description);

		HashSet<String> genreSet= new HashSet<String>();
		HashSet<String> creatorSet = new HashSet<String>();
		fillHashSet(genreSet, genre, genre.length);
		fillHashSet(creatorSet, creator, 5);
//		System.out.println(creatorSet);
//		printHashSet(creatorSet);
		System.out.println(genreSet.size());
		System.out.println(creatorSet.size());

		GeneratorOutput(genreSet, creatorSet,title, rating, genre, creator, outFile);
		System.out.println("done");
	}
	
	private static void GeneratorOutput(HashSet<String> genreSet, HashSet<String> creatorSet, String[] title, String[] rating, String[] genre, String[] creator, String outFile) {
		Writer writer = null;

		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream(outFile), "utf-8"));
		    writer.write("title,rating,TV");
			Iterator<String> genreIterator = genreSet.iterator();
			while(genreIterator.hasNext()){
				writer.write(","+genreIterator.next());
			}
			Iterator<String> creatorIterator = creatorSet.iterator();
			while(creatorIterator.hasNext()){
				writer.write(","+creatorIterator.next());
			}
			writer.write("\n");
			for(int i=0;i<N;i++){
				String pattern = "[()]";

				// Create a Pattern object
				Pattern r = Pattern.compile(pattern);
				String[] strs = r.split(title[i]);
				if(strs.length==3){
					writer.write(strs[0].trim()+',');
					writer.write(rating[i]);
					if(strs[1].length()==4)
						writer.write("0,");
					else
						writer.write("1,");
				}else
					continue;
				
				HashSet<String> temp = new HashSet<String>();

				fillHashSet(temp, genre[i]);
				genreIterator = genreSet.iterator();
				while(genreIterator.hasNext()){
					if(temp.contains(genreIterator.next()))
						writer.write(","+1);
					else
						writer.write(","+0);
				}

				fillHashSet(temp, creator[i],5);
				creatorIterator = creatorSet.iterator();
				while(creatorIterator.hasNext()){
					if(temp.contains(creatorIterator.next()))
						writer.write(","+1);
					else
						writer.write(","+0);
				}
				writer.write("\n");
			}
		} catch (IOException ex) {
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {/*ignore*/}
		}
	}
	private static void fillHashSet(HashSet<String> hashSet, String str) {
		hashSet.clear();
		String[] temp = str.split(",");
		for(int j=0;j<temp.length;j++){
			temp[j]=temp[j].trim();
			hashSet.add(temp[j]);
		}
		
	}
	private static void fillHashSet(HashSet<String> hashSet, String[] arr, int length) {
		for(int i=0;i<arr.length;i++){
			length = 5;
			String[] temp = arr[i].split(",");
			if(length>temp.length)
				length = temp.length;
			for(int j=0;j<length;j++){
				temp[j]=temp[j].trim();
				hashSet.add(temp[j]);
			}
		}
	}

	private static void fillHashSet(HashSet<String> hashSet, String str, int length) {
		hashSet.clear();
		String[] temp = str.split(",");
		if(length>temp.length)
			length = temp.length;
		for(int j=0;j<length;j++){
			temp[j]=temp[j].trim();
			hashSet.add(temp[j]);
		}
	}

	public static void printArr(String[] arr){
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	
	}
	
	public static void printHashSet(HashSet<String> set){
		Iterator<String> it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
