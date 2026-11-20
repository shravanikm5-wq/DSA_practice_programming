package assignment;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	class Employee {
	    String name;
	    int salary;

	    Employee(String name, int salary) {
	        this.name = name;
	        this.salary = salary;
	    }
	}

	class SortBySalary implements Comparator<Employee> {
	    public int compare(Employee e1, Employee e2) {
	        return Integer.compare(e2.salary, e1.salary);
	    }
	}

	public class ct1 {
	    public static void main(String[] args) {
	        ArrayList<Employee> l = new ArrayList<>();

	        l.add(new Employee("Ravi", 25000));
	        l.add(new Employee("Anu", 35000));
	        l.add(new Employee("Kiran", 20000));
	        l.add(new Employee("Banu", 30000));

	        Collections.sort(l, new SortBySalary());

	        for (Employee e : l) {
	            System.out.println(e.salary + " " + e.name);
	        }
	    }
	}


