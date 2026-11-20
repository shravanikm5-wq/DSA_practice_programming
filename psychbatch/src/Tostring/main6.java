package Tostring;
class clothes{
	int cost;
	String name;
	String wear;
	clothes(int cost,String name,String wear){
		this.cost=cost;
		this.name=name;
		this.wear=wear;
	}
	public String toString()
	{
		return this.cost+" "+this.name+" "+this.wear;
	}



public class main6 {

	public static void main(String[] args) {
		clothes t1=new clothes(560,"trade","yttre");
				System.out.print(t1);
	}
}}

