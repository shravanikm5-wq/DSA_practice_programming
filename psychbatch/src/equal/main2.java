package equal;
class laptop{
	int cost;
	String brand;
	char type;
	laptop(int cost,String brand,char type){
		this.brand=brand;
		this.cost=cost;
		this.type=type;
	}

	public boolean equals(Object obj)
	{
		laptop t2=(laptop)obj;
		return this.brand==t2.brand;
	}
 }

public class main2 {
	public static void main(String[] args) {
		laptop t1=new laptop(20,"samsung",'a');
		laptop t2=new laptop(25,"sams",'j');
		if (t1.equals(t2)) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
			
		}
		
	}
}


