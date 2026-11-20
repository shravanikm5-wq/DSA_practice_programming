package collection;
import java.util.ArrayList;

public class array_list {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(10.5);
		l1.add("hello");
		l1.add('a');
		l1.add(true);
		System.out.println(l1);
		l1.add(2,50);
		System.out.println(l1);
		l1.add(100);
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);
		l1.remove(true);
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.contains(10.5));	
		System.out.println(l1.get(2));
		ArrayList l2=new ArrayList();
		l2.add(10);
		l2.add(20);
		l2.add("hello");
		l2.add(false);
		l2.add('a');
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
		l1.addAll(2,l2);
		System.out.println(l1);
//		l1.removeAll(l2);
//		System.out.println(l1);
		l1.retainAll(l2);
		System.out.println(l1);	
	}
}
