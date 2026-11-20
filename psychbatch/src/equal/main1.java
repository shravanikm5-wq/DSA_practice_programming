package equal;
 class tv{
	int cost;
	String brand;
	char type;
	tv(int cost,String brand,char type){
		this.brand=brand;
		this.cost=cost;
		this.type=type;
	}

	public boolean equals(Object obj)
	{
		tv t2=(tv)obj;
		return this.brand==t2.brand;
	}
 }

public class main1 {
	public static void main(String[] args) {
		tv t1=new tv(20,"samsung",'a');
		tv t2=new tv(25,"samsung",'j');
		if (t1.equals(t2)) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
			
		}
		
	}
}


