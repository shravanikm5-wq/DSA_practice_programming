package assignment;
import java.util.ArrayList;
import java.util.Collections;


	

	class Employee implements Comparable<Employee> {
	    String name;
	    int salary;

	    Employee(String name, int salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    @Override
	    public int compareTo(Employee e) {
	        return this.name.compareTo(e.name);
	    }

	    @Override
	    public String toString() {
	        return name + " " + salary;
	    }
	}

	public class iterator1 {
	    public static void main(String[] args) {
	        ArrayList<Employee> l = new ArrayList<>();

	        l.add(new Employee("Ravi", 25000));
	        l.add(new Employee("Anu", 30000));
	        l.add(new Employee("Kiran", 20000));
	        l.add(new Employee("Banu", 28000));

	        Collections.sort(l);

	        for (Employee e : l) {
	            System.out.println(e);
	        }
	    }
	

}
