package assignment;


	class Movie
	{
	    void watch()
	    {
	        System.out.println("Watching the movie");
	    }
	}

	class Theatre
	{
	    Movie bookTicket()
	    {
	        Movie m = new Movie();
	        return m;
	    }
	}

	class Booking
	{
	    Theatre selectTheatre()
	    {
	        Theatre t = new Theatre();
	        return t;
	    }
	}

	class MovieApp
	{
	    Booking book()
	    {
	        Booking b = new Booking();
	        return b;
	    }
	}

	class main
	{
	    public static void main(String[] args)
	    {
	        new MovieApp().book().selectTheatre().bookTicket().watch();
	       
	    }
	}


