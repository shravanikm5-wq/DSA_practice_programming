package collection_assignment;

import java.util.ArrayList;

public class radius {
	static void area(ArrayList l2) {
		for (int i = 0; i < l2.size(); i++) {
			int r=(int)l2.get(i);
			final double pi=3.14;
			double res=pi*r*r;
			System.out.println("radius of"+r+"its area is"+res);	
		}
	}
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(6);
		l1.add(9);
		l1.add(4);
		l1.add(3);
		area(l1);
	}


}
