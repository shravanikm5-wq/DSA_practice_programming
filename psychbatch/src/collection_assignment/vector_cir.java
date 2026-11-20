package collection_assignment;

import java.util.Vector;

public class vector_cir {
	static void cir(Vector v2,Vector v1) {
		for(int i=0;i<v2.size();i++) {
			int r=(int)v2.get(i);
			System.out.println(0.5*r*r);	
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
		cir(v1,v2);

		
		
	}

}


