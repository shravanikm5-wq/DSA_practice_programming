package collection_assignment;

import java.util.ArrayList;

public class mobile {
	String name;
	int id;
	@Override
	public String toString() {
		return "tv [name=" + name + ", id=" + id + "]";
	}
	public mobile(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		ArrayList<tv> l1=new ArrayList<tv>();
		l1.add(new tv ("abc",67));
		l1.add(new tv ("hfd",67));
		for (int i = 0;i<l1.size();i++) {
			Object o1=l1.get(i);
			tv e=(tv)o1;
			System.out.println(e);
			
		}
		
		
	}
	}	
