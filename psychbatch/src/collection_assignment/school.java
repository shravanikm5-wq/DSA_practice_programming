package collection_assignment;

import java.util.ArrayList;

public class school {
	String name;
	int id;
	@Override
	public String toString() {
		return "tv [name=" + name + ", id=" + id + "]";
	}
	public school(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		ArrayList<school> l1=new ArrayList<school>();
		l1.add(new school ("abc",670));
		l1.add(new school ("hfd",680));
		for (int i = 0;i<l1.size();i++) {
			Object o1=l1.get(i);
			school e=(school)o1;
			System.out.println(e);
			
		}	
	}
}
