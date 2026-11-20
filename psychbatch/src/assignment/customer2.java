package assignment;


	class Book
	{
	    void read()
	    {
	        System.out.println("Reading the book");
	    }
	}

	class Courier
	{
	    Book deliver()
	    {
	        Book b = new Book();
	        return b;
	    }
	}

	class BookApp
	{
	    Courier order()
	    {
	        Courier c = new Courier();
	        return c;
	    }
	}

	class customer2
	{
	    public static void main(String[] args)
	    {
	        Book b = new BookApp().order().deliver();
	        b.read();
	    }
	}

