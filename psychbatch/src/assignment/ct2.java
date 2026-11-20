package assignment;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	class Product {
	    String name;
	    int price;

	    Product(String name, int price) {
	        this.name = name;
	        this.price = price;
	    }
	}

	class SortByPrice implements Comparator<Product> {
	    public int compare(Product p1, Product p2) {
	        return Integer.compare(p1.price, p2.price);
	    }
	}

	public class ct2 {
	    public static void main(String[] args) {
	        ArrayList<Product> l = new ArrayList<>();

	        l.add(new Product("Laptop", 50000));
	        l.add(new Product("Mouse", 500));
	        l.add(new Product("Keyboard", 1500));
	        l.add(new Product("Monitor", 10000));

	        Collections.sort(l, new SortByPrice());

	        for (Product p : l) {
	            System.out.println(p.price + " " + p.name);
	        }
	    }
	

}
