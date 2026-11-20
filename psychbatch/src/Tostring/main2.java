package Tostring;
class laptop{
	int cost;
	String brand;
	char type;
	laptop(int cost,String brand,char type){
		this.brand=brand;
		this.cost=cost;
		this.type=type;
	}

	public String toString()
	{
		return this.cost+" "+this.brand+" "+this.type;
	}

public class main2 {

	public static void main(String[] args) {
		laptop t1=new laptop(30,"samsung",'b');
				System.out.print(t1);
	}
}}

