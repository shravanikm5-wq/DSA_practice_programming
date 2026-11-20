package collection;

import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(10);
	    v1.add(10.5);
	    v1.add("hello");
	    v1.add('a');
	    v1.add(true);
	    v1.add(null);
	    System.out.println(v1);
	    System.out.println(v1.size());
	    //l1.remove(2);
	    //l1.remove(10.5);
	    //System.out.println(l1);
	   // l1.clear();
	    //System.out.println(l1.isEmpty());
	    System.out.println(v1.contains("hi"));
	    System.out.println(v1.get(4));
	    v1.set(3,"bye");
	    System.out.println(v1);
	    Vector v2=new Vector();
	    v2.add(30);
	    v2.add(10.7);
	    v2.add("hii");
	    v2.add('b');
	    v2.add(false);
	    v1.retainAll(v2);
	    System.out.println(v1);
	    
	    
	    
	    
	    
	}

}


