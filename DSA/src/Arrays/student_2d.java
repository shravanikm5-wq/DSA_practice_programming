package Arrays;

public class student_2d {
	String name;
	int id;
	char sec;
	public student_2d(String name, int id, char sec) {
		super();
		this.name = name;
		this.id = id;
		this.sec = sec;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "student_2d [name=" + name + ", id=" + id + ", sec=" + sec + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
