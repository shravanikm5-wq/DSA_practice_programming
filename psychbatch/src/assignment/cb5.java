package assignment;


	import java.util.ArrayList;
	import java.util.Collections;

	class Car implements Comparable<Car> {
	    String model;
	    int price;

	    public Car(String model, int price) {
	        this.model = model;
	        this.price = price;
	    }

	    @Override
	    public int compareTo(Car c) {
	        return this.model.compareTo(c.model);
	    }

	    @Override
	    public String toString() {
	        return model + " " + price;
	    }
	}

	public class cb5 {
	    public static void main(String[] args) {
	        ArrayList<Car> l = new ArrayList<>();

	        l.add(new Car("BMW", 500000));
	        l.add(new Car("Audi", 400000));
	        l.add(new Car("Honda", 200000));
	        l.add(new Car("Tesla", 600000));
	        l.add(new Car("Benz", 450000));

	        Collections.sort(l);

	        for (Car c : l) {
	            System.out.println(c);
	        }
	    }
	}


