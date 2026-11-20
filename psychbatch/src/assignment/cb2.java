package assignment;


	import java.util.ArrayList;
	import java.util.Collections;

	class Product2 implements Comparable<Product2> {
	    String name;
	    int price;

	    Product2(String name, int price) {
	        this.name = name;
	        this.price = price;
	    }

	    @Override
	    public int compareTo(Product2 p) {
	        return this.price - p.price;
	    }

	    @Override
	    public String toString() {
	        return name + " " + price;
	    }
	}

	public class cb2 {
	    public static void main(String[] args) {
	        ArrayList<Product2> l = new ArrayList<>();

	        l.add(new Product2("Laptop", 50000));
	        l.add(new Product2("Mouse", 500));
	        l.add(new Product2("Keyboard", 1500));
	        l.add(new Product2("Monitor", 10000));

	        Collections.sort(l);

	        for (Product2 p : l) {
	            System.out.println(p);
	        }
	    }
	}

