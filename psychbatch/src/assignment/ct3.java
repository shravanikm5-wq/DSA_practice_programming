package assignment;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	class Book {
	    String title;
	    int pages;

	    Book(String title, int pages) {
	        this.title = title;
	        this.pages = pages;
	    }
	}

	class SortByTitle implements Comparator<Book> {
	    public int compare(Book b1, Book b2) {
	        return b1.title.compareTo(b2.title);
	    }
	}

	public class ct3 {
	    public static void main(String[] args) {
	        ArrayList<Book> l = new ArrayList<>();

	        l.add(new Book("Java", 300));
	        l.add(new Book("Python", 250));
	        l.add(new Book("C Programming", 200));
	        l.add(new Book("HTML", 150));

	        Collections.sort(l, new SortByTitle());

	        for (Book b : l) {
	            System.out.println(b.title + " " + b.pages);
	        }
	    }
	

}
