package question;

public class Employee {
	 private int id;
	 private String name;
	 private double salary;
	private String designation;
	 private double exp;
	private String location;
	 private String gender;
	public Employee(int id, String name, double salary, String designation, int exp, String location, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.exp = exp;
		this.location = location;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getDesignation() {
		return designation;
	}
	public double getExp() {
		return exp;
	}
	public String getLocation() {
		return location;
	}
	public String getGender() {
		return gender;
	}
	
	
	

}
