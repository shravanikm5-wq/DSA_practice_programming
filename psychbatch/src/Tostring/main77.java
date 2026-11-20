package Tostring;
class course{
	int cost;
	String name;
	String university;
	course(int cost,String name,String university){
		this.cost=cost;
		this.name=name;
		this.university=university;
	}
	public String toString()
	{
		return this.cost+" "+this.name+" "+this.university;
	}


public class main77 {
	public static void main(String[] args) {
		course t1=new course (5600,"gtsbhh","y67");
				System.out.print(t1);
	}

	
}

}

}
