package dsa_assignment;


	import java.util.*;

	class Student3 {
	    String name;
	    int age;
	    int marks;
	    double cgpa;

	    Student3(String name, int age, int marks, double cgpa) {
	        this.name = name;
	        this.age = age;
	        this.marks = marks;
	        this.cgpa = cgpa;
	    }

	    public String toString() {
	        return name + " " + age + " " + marks + " " + cgpa;
	    }
	}

	public class student3 {
	    public static void main(String[] args) {

	        Comparator<Student3> com =
	            (a, b) -> a.name.compareToIgnoreCase(b.name);

	        List<Student3> l = new ArrayList<Student3>(Arrays.asList(
	            new Student3("mandy", 90, 21, 9.0),
	            new Student3("Bob", 84, 22, 8.5),
	            new Student3("Carol", 87, 23, 7.9),
	            new Student3("alex", 77, 22, 8.4),
	            new Student3("Hruthik", 89, 19, 7.7),
	            new Student3("Pradeep", 100, 25, 10.0)
	        ));

	        Collections.sort(l, com);

	        for (Student3 x : l) {
	            System.out.println(x);
	        }
	    }
	}


