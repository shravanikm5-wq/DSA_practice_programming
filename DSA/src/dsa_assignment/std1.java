package dsa_assignment;

	import java.util.*;

	class Student1 {
	    String name;
	    int marks;
	    int age;
	    double cgpa;

	    Student1(String name, int marks, int age, double cgpa) {
	        this.name = name;
	        this.age = age;
	        this.marks = marks;
	        this.cgpa = cgpa;
	    }

	    public String toString() {
	        return name + " " + marks + " " + age + " " + cgpa;
	    }
	}

	public class std1 {
	    public static void main(String[] args) {

	        Comparator<Student1> com =
	            (a, b) -> Integer.compare(a.marks, b.marks);

	        List<Student1> list = new ArrayList<Student1>(Arrays.asList(
	            new Student1("Alex", 90, 21, 9.0),
	            new Student1("Bob", 84, 22, 8.5),
	            new Student1("Carol", 87, 23, 7.9),
	            new Student1("Swathi", 77, 22, 8.4),
	            new Student1("Hruthik", 89, 19, 7.7),
	            new Student1("Pradeep", 100, 25, 10.0)
	        ));

	        Collections.sort(list, com.reversed());

	        list.forEach((no) -> System.out.println(no));
	    }
	}


