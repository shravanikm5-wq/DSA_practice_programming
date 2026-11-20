package collection_assignment;

import java.util.ArrayList;

public class cloth {
	String name;
	int id;
	@Override
	public String toString() {
		return "tv [name=" + name + ", id=" + id + "]";
	}
	public cloth(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		ArrayList<cloth> l1=new ArrayList<cloth>();
		l1.add(new cloth ("abc",67));
		l1.add(new cloth ("hfd",68));
		for (int i = 0;i<l1.size();i++) {
			Object o1=l1.get(i);
			cloth e=(cloth)o1;
			System.out.println(e);
			
		}
		
		
	}
	}	






