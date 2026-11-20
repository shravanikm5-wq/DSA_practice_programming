package collection_assignment;

import java.util.ArrayList;

public class laptop {
	String name;
	int id;
	@Override
	public String toString() {
		return "tv [name=" + name + ", id=" + id + "]";
	}
	public laptop(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		ArrayList<laptop> l1=new ArrayList<laptop>();
		l1.add(new laptop ("abc",4499));
		l1.add(new laptop ("hfd",68));
		for (int i = 0;i<l1.size();i++) {
			Object o1=l1.get(i);
			laptop e=(laptop)o1;
			System.out.println(e);
			
		}
		
		
	}
	






}
