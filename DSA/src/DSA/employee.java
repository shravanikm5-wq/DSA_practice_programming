package DSA;

public class employee {
	int id;
	String name;
	double sal;
	employee(int id,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
		
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", sal=" + sal + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
