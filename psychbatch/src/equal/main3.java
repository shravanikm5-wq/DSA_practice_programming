package equal;
class cloth{
	int cost;
	String brand;
	char type;
	cloth(int cost,String brand,char type){
		this.brand=brand;
		this.cost=cost;
		this.type=type;
	}

	public boolean equals(Object obj)
	{
		cloth t2=(cloth)obj;
		return this.brand==t2.brand;
	}
 }

public class main3 {
	public static void main(String[] args) {
		cloth t1=new cloth(20,"samsung",'a');
		cloth t2=new cloth(25,"samsung",'j');
		if (t1.equals(t2)) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
			
		}
		
	}
}

