package collection_assignment;

import java.util.Vector;

public class vector_rec {
	static void rec(Vector v2,Vector v1) {
		for(int i=0;i<v2.size();i++) {
			int w=(int)v2.get(i);
			int h=(int)v2.get(i);
			System.out.println(0.5*w*h);	
		}
	}
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		Vector v2=new Vector();
		v1.add(10);
		v1.add(26);
		v1.add(80);
		v1.add(90);
		rec(v1,v2);

		
		
	}

}

