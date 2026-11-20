package Tostring;
class tv{
	int cost;
	String brand;
	char type;
	tv(int cost,String brand,char type){
		this.brand=brand;
		this.cost=cost;
		this.type=type;
	}

	public String toString()
	{
		return this.cost+" "+this.brand+" "+this.type;
	}


public class main1 {
	public static void main(String[] args) {
		tv t1=new tv(20,"samsung",'a');
				System.out.print(t1);
	}
}}


