package equal;
class school{
	int cost;
	String brand;
	char type;
	school(int cost,String brand,char type){
		this.brand=brand;
		this.cost=cost;
		this.type=type;
	}

	public boolean equals(Object obj)
	{
		school t2=(school)obj;
		return this.brand==t2.brand;
	}
 }

public class main4 {
	public static void main(String[] args) {
		school t1=new school(20,"samsung",'a');
		school t2=new school(25,"samsung",'j');
		if (t1.equals(t2)) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
			
		}
		
	}


}
