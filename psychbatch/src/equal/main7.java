package equal;
class home{
	int cost;
	String brand;
	char type;
	home(int cost,String brand,char type){
		this.brand=brand;
		this.cost=cost;
		this.type=type;
	}

	public boolean equals(Object obj)
	{
		home t2=(home)obj;
		return this.brand==t2.brand;
	}
 }


public class main7 {
	public static void main(String[] args) {
		home t1=new home (20,"samsung",'a');
		home t2=new home(25,"samsung",'j');
		if (t1.equals(t2)) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
			
		}
		
	}

}
