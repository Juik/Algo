package testAndfun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringEditMain {
	public static void main(String[] args){
		System.out.println("1．生成字符串");
		System.out.println("2．显 示");
		System.out.println("3．求字符串长度");
		System.out.println("4．字符串插入");
		System.out.println("5．字符串替换");
		System.out.println("6．字符串删除");
		System.out.println("7．字符串查找");
		System.out.println("8．字符串的连接");
		System.out.println("0．返回");
		
		//用br来读进来的数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		
		//我在这里写死了，如果你想做一个可以自己输入的，我已经在stringEdit里写好了另一个有参构造，直接调用那个也可以
		stringEdit ss = new stringEdit();
		
	    try {
			String s = br.readLine();
			while(!s.equals("0")){
				switch(Integer.valueOf(s)){
				case 1:
					// 这里也是写死了，提前在上面给出，如果觉得不爽，可以1的时候再读进来一个字符串然后再new stringEdit
					System.out.println("已生成");
					break;
				case 2:
					System.out.println(ss.str);
					break;
				case 3:
					System.out.println("字符串长度为"+ss.len());
					break;
				case 4:
					System.out.println("请输入要插入的字符串：");
					String tmp = br.readLine();
					System.out.println("请输入要插入在第几个字符前面：");
					String num = br.readLine();
					System.out.println("插入后为："+ss.insstr(ss.str, Integer.parseInt(num), tmp));
					break;
				case 5:
					System.out.println("请输入要替换的字符：");
					String p = br.readLine();
					System.out.println("请输入要更改为的字符：");
					String t = br.readLine();
					System.out.println("替换后为："+ss.repl(ss.str, p, t));
					break;
				case 6:
					System.out.println("输入你想删除的字符段：");
					String del = br.readLine();
					System.out.println("删除后字符串为："+ss.delete(ss.str, del));
					break;
				case 7:
					System.out.println("请输入想查找的字符或字符串：");
					String sea = br.readLine();
					if(ss.search(ss.str, sea)==-1)
						System.out.println("您搜索的字符段不存在");
					else{
						System.out.println("位于第"+ss.search(ss.str,sea));
					}
					break;
				case 8:
					System.out.println("请输入你要连接的字符串:");
					String tail = br.readLine();
					System.out.println("结果为："+ss.strcat(ss.str, tail));
					break;
				}
				System.out.println("请输入您要选择的选项：");
				s = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}  
	    System.out.println("欢迎使用字符串转换系统！");
	}
}
