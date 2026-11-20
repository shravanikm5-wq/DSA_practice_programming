package DSA;

	// Deep Copy

	class Add1{
		String ad;
		public Add1(String ad) {
			this.ad=ad;
		}
	}
	public class deep {
		String n;
		int id ;
		Add1 a1;
	//Constructor
	public deep(String n, int id,Add1 a1) {
			this.n = n;
			this.id = id;
			this.a1=a1;
		}
	//Copy Constructor
	public deep(deep s1) {
		this.n=s1.n;
		this.id=s1.id;
		this.a1=new Add1(s1.a1.ad);
	}
	@Override
	public String toString() {
		return n+" "+id+" "+a1.ad;
	}
	public static void main(String[] args) {
		Add1 a = new Add1("London");
		deep n = new deep("bob",12,a);
		System.out.println(n);
		deep n1 =new deep(n);
		System.out.println(n1);	
		System.out.println("---------");
		n1.a1.ad="Bengaluru";
		System.out.println(n);
		System.out.println(n1);	
	}
	}


