package assignment;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	class Movie {
	    String name;
	    double rating;

	    Movie(String name, double rating) {
	        this.name = name;
	        this.rating = rating;
	    }
	}

	class SortByRating implements Comparator<Movie> {
	    public int compare(Movie m1, Movie m2) {
	        return Double.compare(m2.rating, m1.rating);
	    }
	}

	public class ct5 {
	    public static void main(String[] args) {
	        ArrayList<Movie> l = new ArrayList<>();

	        l.add(new Movie("Movie A", 8.2));
	        l.add(new Movie("Movie B", 9.1));
	        l.add(new Movie("Movie C", 7.5));
	        l.add(new Movie("Movie D", 8.8));

	        Collections.sort(l, new SortByRating());

	        for (Movie m : l) {
	            System.out.println(m.rating + " " + m.name);
	        }
	    }
	

}
