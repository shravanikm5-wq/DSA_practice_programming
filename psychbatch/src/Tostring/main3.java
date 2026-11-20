package Tostring;
class car{
	int cost;
	String brand;
	char type;
	car(int cost,String brand,char type){
		this.brand=brand;
		this.cost=cost;
		this.type=type;
	}
	public String toString()
	{
		return this.cost+" "+this.brand+" "+this.type;
	}


public class main3 {

	public static void main(String[] args) {
		car t1=new car(56,"sam",'c');
				System.out.print(t1);
	}
}}

