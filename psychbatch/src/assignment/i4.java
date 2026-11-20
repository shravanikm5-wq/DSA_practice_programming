package assignment;


	import java.util.ArrayList;
	import java.util.Collections;

	class Book1 implements Comparable<Book1> {
	    String title;
	    int pages;

	    Book1(String title, int pages) {
	        this.title = title;
	        this.pages = pages;
	    }

	    @Override
	    public int compareTo(Book1 b) {
	        return this.title.compareTo(b.title);
	    }

	    @Override
	    public String toString() {
	        return title + " " + pages;
	    }
	}

	public class i4 {
	    public static void main(String[] args) {
	        ArrayList<Book1> l = new ArrayList<>();

	        l.add(new Book1("Java", 300));
	        l.add(new Book1("Python", 250));
	        l.add(new Book1("C Programming", 200));
	        l.add(new Book1("HTML", 150));

	        Collections.sort(l);

	        for (Book1 b : l) {
	            System.out.println(b);
	        }
	    }


}
