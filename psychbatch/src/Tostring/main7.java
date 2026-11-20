package Tostring;
class bike{
	int cost;
	String name;
	String model;
	bike(int cost,String name,String model){
		this.cost=cost;
		this.name=name;
		this.model=model;
	}
	public String toString()
	{
		return this.cost+" "+this.name+" "+this.model;
	}


public class main7 {
	public static void main(String[] args) {
		bike t1=new bike(5600,"gt","");
				System.out.print(t1);
	}

	
}

}
