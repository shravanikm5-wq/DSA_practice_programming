package collection_assignment;

import java.util.ArrayList;

public class stu {
	String name;
	int id;
	@Override
	public String toString() {
		return "tv [name=" + name + ", id=" + id + "]";
	}
	public stu(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		ArrayList<stu> l1=new ArrayList<stu>();
		l1.add(new stu ("abc",643));
		l1.add(new stu ("hfd",6889));
		for (int i = 0;i<l1.size();i++) {
			Object o1=l1.get(i);
			stu e=(stu)o1;
			System.out.println(e);
			
		}
		
		
	}
	}	

