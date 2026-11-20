package equal;
class mobile{
	int cost;
	String brand;
	char type;
	mobile(int cost,String brand,char type){
		this.brand=brand;
		this.cost=cost;
		this.type=type;
	}

	public boolean equals(Object obj)
	{
		mobile t2=(mobile)obj;
		return this.brand==t2.brand;
	}
 }

public class main6 {
	public static void main(String[] args) {
		mobile t1=new mobile (20,"samsung",'a');
		mobile t2=new mobile(25,"sam",'j');
		if (t1.equals(t2)) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
			
		}
		
	}

}
