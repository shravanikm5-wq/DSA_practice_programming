package equal;
class car{
	int cost;
	String brand;
	char type;
	car(int cost,String brand,char type){
		this.brand=brand;
		this.cost=cost;
		this.type=type;
	}

	public boolean equals(Object obj)
	{
		car t2=(car)obj;
		return this.brand==t2.brand;
	}
 }



public class main9 {
	public static void main(String[] args) {
		car t1=new car (20,"samsung",'a');
		car t2=new car(25,"samsung",'j');
		if (t1.equals(t2)) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
			
		}
		
	}



}
