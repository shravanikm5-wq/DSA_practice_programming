package collection;
import java.util.TreeSet;

public class treeset {
	public static void main(String[] args) {
		TreeSet l1=new TreeSet();
		l1.add(10);
	    l1.add(10);
	    l1.add(90);
	    l1.add(87);
	    l1.add(45);
	   // l1.add(null);
	    System.out.println(l1);
	    System.out.println(l1.size());
	    //l1.remove(2);
	    //l1.remove(10.5);
	    //System.out.println(l1);
	    //l1.clear();
	    System.out.println(l1.isEmpty());
	    System.out.println(l1.contains(90));
	   
	    System.out.println(l1);
	    TreeSet l2=new TreeSet();
	    l2.add(30);
	    l2.add(65);
	    l2.add(43);
	    l2.add(95);
	    l2.add(23);
	    l1.retainAll(l2);
	    l1.removeAll(l2);
	    System.out.println(l1);
	    System.out.println(l1);
	    System.out.println(l2);  
	}
}
