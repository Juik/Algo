package testAndfun;

import java.util.ArrayList;
import java.util.List;

/*Find the oldest sisters of the given Person object. Such class recursively defines a Person father, 
 * Person mother, and a List&amp;lt;Person&amp;gt; of children. 
*/

public class findOldestSister {
	public static void main(String[] args){
		findOldestSister fos = new findOldestSister();
		person girl1 = new person("Grace","Bob","Sasa",16,"F");
		person girl2 = new person("June","Bob","Mary",19,"F");
		person girl3 = new person("Linda","Marc","Mary",5,"F");
		person girl4 = new person("Bella","Marc","Mary",15,"F");
		person boy1 = new person("Jack","Marc","Mary",22,"M");
		List<person> list1 = new ArrayList<person>();
		List<person> list2 = new ArrayList<person>();
		List<person> list3 = new ArrayList<person>();
		List<person> list4 = new ArrayList<person>();
		list1.add(girl1);
		list2.add(girl1);
		list2.add(girl2);
		list3.add(girl2);
		list3.add(girl3);
		list3.add(girl4);
		list3.add(boy1);
		list4.add(girl3);
		list4.add(girl4);
		list4.add(boy1);
		person man1 = new person("Bob","","",45,"M","Mary",list2);
		person man2 = new person("Marc","","",48,"M","",list4);
		person lady1 = new person("Mary","","",42,"F","",list1);
		person lady2 = new person("Sasa","","",47,"F","Bpb",list3);
		List<person> list = new ArrayList<person>();
		list.add(man1);
		list.add(man2);
		list.add(lady1);
		list.add(lady2);
		
		getKids(man2.name,list);
		getOldestKids(man2.name,list);

	}


static class person{
	public String name;
	private String father;
	private String mother;
	private String gender;
	private int age;
	private String ex;
	private List<person> kids;
	
	public person(String n, String f, String m, int age, String sex){
		this.name = n;
		this.father = f;
		this.mother = m;
		this.gender = sex;
		this.age = age;
	}
	
	public person(String n,String f, String m, int age, String sex, String ex, List<person> kids){
		this.name = n;
		this.father = f;
		this.mother = m;
		this.gender = sex;
		this.ex = ex;
		this.kids = kids;
		this.age = age;
	}
	
	public void getParents(){
		System.out.println("Dad is "+this.father + "Mom is "+this.mother);
		
	}
	
	public List<person> getAllKids(){
		List<person> kids = new ArrayList<person>();
		for(person p : kids){
			System.out.println(p.name);
			kids.add(p);
		}
		return kids;
	}
	
	public void OldestKids(){
		int max = Integer.MIN_VALUE;
		String maxName = null;
		for(person p:kids){
			if(p.age>max && p.gender.equals("F")){
				max = p.age;
				maxName = p.name;
			}
		}
		System.out.println(maxName);
	}
}

static void getKids(String name, List<person> people){
	for(person person: people){
		if(person.name.equals(name)){
			person.getAllKids();
		}
	}
}

static void getOldestKids(String name, List<person> people){
	for(person person:people){
		if(person.name.equals(name)){
			person.OldestKids();
		}
	}
}
}
