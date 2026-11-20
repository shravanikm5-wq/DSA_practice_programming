package assignment;

	import java.util.ArrayList;
	import java.util.Collections;

	class Employee1 implements Comparable<Employee1> {
	    String name;
	    int salary;

	    Employee1(String name, int salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    @Override
	    public int compareTo(Employee1 e) {
	        return this.name.compareTo(e.name);
	    }

	    @Override
	    public String toString() {
	        return name + " " + salary;
	    }
	}

	public class cb1 {
	    public static void main(String[] args) {
	        ArrayList<Employee1> l = new ArrayList<>();

	        l.add(new Employee1("Ravi", 25000));
	        l.add(new Employee1("Anu", 30000));
	        l.add(new Employee1("Kiran", 20000));
	        l.add(new Employee1("Banu", 28000));

	        Collections.sort(l);

	        for (Employee1 e : l) {
	            System.out.println(e);
	        }
	    }

}


