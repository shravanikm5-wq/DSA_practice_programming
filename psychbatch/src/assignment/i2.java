package assignment;


	import java.util.ArrayList;
	import java.util.Collections;

	class Product1 implements Comparable<Product1> {
	    String name;
	    int price;

	    Product1(String name, int price) {
	        this.name = name;
	        this.price = price;
	    }

	    @Override
	    public int compareTo(Product1 p) {
	        return this.price - p.price;
	    }

	    @Override
	    public String toString() {
	        return name + " " + price;
	    }
	}

	public class i2 {
	    public static void main(String[] args) {
	        ArrayList<Product1> l = new ArrayList<>();

	        l.add(new Product1("Laptop", 50000));
	        l.add(new Product1("Mouse", 500));
	        l.add(new Product1("Keyboard", 1500));
	        l.add(new Product1("Monitor", 10000));

	        Collections.sort(l);

	        for (Product1 p : l) {
	            System.out.println(p);
	        }
	    }
	}


