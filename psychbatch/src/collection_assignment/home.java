package collection_assignment;

import java.util.ArrayList;

public class home {
	String name;
	int id;
	@Override
	public String toString() {
		return "tv [name=" + name + ", id=" + id + "]";
	}
	public home(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		ArrayList<home> l1=new ArrayList<home>();
		l1.add(new home ("abc",679));
		l1.add(new home ("hfd",687));
		for (int i = 0;i<l1.size();i++) {
			Object o1=l1.get(i);
			home e=(home)o1;
			System.out.println(e);
			
		}
		
		
	}
	}	







