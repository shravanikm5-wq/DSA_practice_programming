package equal;
class course{
	int cost;
	String university;
	char type;
	course(int cost,String brand,char type){
		this.cost=cost;
		this.type=type;
		this.university=university;
	}


	public boolean equals(Object obj)
	{
		course t2=(course)obj;
		return this.university==t2.university;
	}
 }

public class main5 {
	public static void main(String[] args) {
		course t1=new course(20,"bangalore",'a');
		course t2=new course(25,"mysore",'j');
		if (t1.equals(t2)) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");	
		}
	}
}
