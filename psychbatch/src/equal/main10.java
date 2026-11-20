package equal;
class emp{
	int id;
	String name;
	char dep;
	emp(int id,String name,char dep){
		this.id=id;
		this.name=name;
		this.dep=dep;
	}
	public boolean equals(Object obj)
	{
		emp t2=(emp)obj;
		return this.dep==t2.dep;
	}
 }
public class main10 {
	public static void main(String[] args) {
		emp t1=new emp(2,"kavana",'a');
		emp t2=new emp(2,"kavana",'a');
		if (t1.equals(t2)) {
			System.out.println("same");
		}
		else {
			System.out.println("diff");
		}	
	}
}

