package assignment;


	import java.util.ArrayList;
	import java.util.Collections;

	class Book implements Comparable<Book> {
	    String title;
	    int pages;

	    Book(String title, int pages) {
	        this.title = title;
	        this.pages = pages;
	    }

	    @Override
	    public int compareTo(Book b) {
	        return this.title.compareTo(b.title);
	    }

	    @Override
	    public String toString() {
	        return title + " " + pages;
	    }
	}

	public class cb4 {
	    public static void main(String[] args) {
	        ArrayList<Book> l = new ArrayList<>();

	        l.add(new Book("Java", 300));
	        l.add(new Book("Python", 250));
	        l.add(new Book("C Programming", 200));
	        l.add(new Book("HTML", 150));

	        Collections.sort(l);

	        for (Book b : l) {
	            System.out.println(b);
	        }
	    }
	}


