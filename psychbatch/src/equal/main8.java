package equal;
class bike{
	int cost;
	String brand;
	char type;
	bike(int cost,String brand,char type){
		this.brand=brand;
		this.cost=cost;
		this.type=type;
	}

	public boolean equals(Object obj)
	{
		bike t2=(bike)obj;
		return this.brand==t2.brand;
	}
 }


public class main8 {
	public static void main(String[] args) {
		bike t1=new bike (20,"samsung",'a');
		bike t2=new bike(25,"samsun",'j');
		if (t1.equals(t2)) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
			
		}
		
	}


}
