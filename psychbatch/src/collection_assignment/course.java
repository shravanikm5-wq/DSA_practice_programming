package collection_assignment;

import java.util.ArrayList;

public class course {
	String name;
	int id;
	@Override
	public String toString() {
		return "tv [name=" + name + ", id=" + id + "]";
	}
	public course(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		ArrayList<course> l1=new ArrayList<course>();
		l1.add(new course ("abc",67));
		l1.add(new course ("hfd",68));
		for (int i = 0;i<l1.size();i++) {
			Object o1=l1.get(i);
			course e=(course)o1;
			System.out.println(e);
			
		}
		
		
	}
	}	

