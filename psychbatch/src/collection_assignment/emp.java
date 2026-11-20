package collection_assignment;

import java.util.ArrayList;

public class emp {
	String name;
	int id;
	@Override
	public String toString() {
		return "emp [name=" + name + ", id=" + id + "]";
	}
	public emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		ArrayList<emp> l1=new ArrayList<emp>();
		l1.add(new emp ("abc",697));
		l1.add(new emp ("hfd",68));
		for (int i = 0;i<l1.size();i++) {
			Object o1=l1.get(i);
			emp e=(emp)o1;
			System.out.println(e);
			
		}	
	}
	}	






