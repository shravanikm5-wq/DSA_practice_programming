package collection;
import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack l1=new Stack();
		l1.add(10);
	    l1.add(6);
	    l1.add(67);
	    l1.add(87);
	    l1.add(89);
	    l1.add(null);
	    System.out.println(l1);
	    System.out.println(l1.size());
	    System.out.println(l1);
	    System.out.println(l1.capacity());
	    
 l1.remove(89);
  System.out.println(l1);
	  l1.remove(10.5);
	    System.out.println(l1);
       l1.clear();
	   // System.out.println(l1.isEmpty());
	   // System.out.println(l1);
	    //System.out.println(l1.contains(56));
	   //// System.out.println(l1);
	   // System.out.println(l1.get(4));
	    //l1.set(3,"bye");
	    System.out.println(l1);
	    Stack l2=new Stack();

	    l2.add(30);
	    l2.add(19);
	    l2.add(87);
	    l2.add(34);
	    l2.add(12);
	    System.out.println(l2);
	    l1.retainAll(l2);
	    System.out.println(l1);   
}	}
   