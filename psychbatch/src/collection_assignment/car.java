package collection_assignment;

import java.util.ArrayList;

public class car {
	String name;
	int id;
	@Override
	public String toString() {
		return "tv [name=" + name + ", id=" + id + "]";
	}
	public car(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		ArrayList<car> l1=new ArrayList<car>();
		l1.add(new car ("abc",67));
		l1.add(new car ("hfd",68));
		for (int i = 0;i<l1.size();i++) {
			Object o1=l1.get(i);
			car e=(car)o1;
			System.out.println(e);
			
		}
		
		
	}
	}	




