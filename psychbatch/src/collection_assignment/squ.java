package collection_assignment;

import java.util.ArrayList;

public class squ {
	static void area(ArrayList l2) {
		for (int i = 0; i < l2.size(); i++) {
			int a=(int)l2.get(i);
			double res=a*a;
			System.out.println(res);	
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
