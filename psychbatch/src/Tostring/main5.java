package Tostring;
class std{
	int fees;
	String name;
	String course;
	std(int fees,String name,String course){
		this.fees=fees;
		this.name=name;
		this.course=course;
	}
	public String toString()
	{
		return this.fees+" "+this.name+" "+this.course;
	}



public class main5 {

	public static void main(String[] args) {
		std t1=new std(56,"manoj","java");
				System.out.print(t1);
	}
}}

