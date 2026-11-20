package collection_assignment;

import java.util.ArrayList;

public class bike {
	String name;
	int id;
	@Override
	public String toString() {
		return "tv [name=" + name + ", id=" + id + "]";
	}
	public bike(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		ArrayList<bike> l1=new ArrayList<bike>();
		l1.add(new bike ("abc",69));
		l1.add(new bike ("hfd",68));
		for (int i = 0;i<l1.size();i++) {
			Object o1=l1.get(i);
			bike e=(bike)o1;
			System.out.println(e);
			
		}
		
		
	}
	}	





