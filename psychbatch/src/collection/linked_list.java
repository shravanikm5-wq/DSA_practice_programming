package collection;
import java.util.LinkedList;

public class linked_list {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
	    l1.add(10);
	    l1.add(10.5);
	    l1.add("hello");
	    l1.add('a');
	    l1.add(true);
	    l1.add(null);
	    System.out.println(l1);
	    System.out.println(l1.size());
	    //l1.remove(2);
	    //l1.remove(10.5);
	    //System.out.println(l1);
	   // l1.clear();
	    //System.out.println(l1.isEmpty());
	    System.out.println(l1.contains("hi"));
	    System.out.println(l1.get(4));
	    l1.set(3,"bye");
	    System.out.println(l1);
	    LinkedList l2=new LinkedList();
	    l2.add(30);
	    l2.add(10.7);
	    l2.add("hii");
	    l2.add('b');
	    l2.add(false);
	    l1.retainAll(l2);
	    System.out.println(l1);
	    
	    
	    
	    
	}

}
