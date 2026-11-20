package collection_assignment;

import java.util.ArrayList;

public class sec {
	static void area(ArrayList l2) {
		for (int i = 0; i < l2.size(); i++) {
			int r=(int)l2.get(i);
			double res=0.5*r*r*6;
			System.out.println(res);	
		}
	}
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(6);
		l1.add(9);
		l1.add(4);
		l1.add(99);
		area(l1);
	}



}
