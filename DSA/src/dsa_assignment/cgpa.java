package dsa_assignment;

	import java.util.*;

	class Student2 {
	    String name;
	    int marks;
	    int age;
	    double cgpa;

	    Student2(String name, int marks, int age, double cgpa) {
	        this.name = name;
	        this.marks = marks;
	        this.age = age;
	        this.cgpa = cgpa;
	    }

	    public String toString() {
	        return name + " " + marks + " " + age + " " + cgpa;
	    }
	}

	public class cgpa {
	    public static void main(String[] args) {

	        Comparator<Student2> com =(a, b) -> Double.compare(a.cgpa, b.cgpa);

	        List<Student2> l = new ArrayList<Student2>(Arrays.asList(
	            new Student2("Alex", 90, 21, 9.0),
	            new Student2("Bob", 84, 22, 8.5),
	            new Student2("Carol", 87, 23, 7.9),
	            new Student2("Swathi", 77, 22, 8.4),
	            new Student2("Hruthik", 89, 19, 7.7),
	            new Student2("Pradeep", 100, 25, 10.0)
	        ));

	        Collections.sort(l, com.reversed());

	        l.forEach((no) -> System.out.println(no));
	    }
	}


