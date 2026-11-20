package collection_assignment;

import java.util.Vector;

public class vector_elli {
	static void elli(Vector v2,Vector v1) {
		for(int i=0;i<v2.size();i++) {
			int b=(int)v2.get(i);
			int a=(int)v2.get(i);
			System.out.println(30*a*b);	
		}
	}
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(37);
		v1.add(40);
		Vector v2=new Vector();
		v1.add(10);
		v1.add(26);
		v1.add(80);
		v1.add(98);
		elli(v1,v2);
	}

}

