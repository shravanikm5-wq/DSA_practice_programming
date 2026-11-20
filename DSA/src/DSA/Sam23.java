package DSA;


	// Shallow Copy
	class Add{
		String ad;
		public Add(String ad) {
			this.ad=ad;
		}
	}
	public class Sam23 {
		String n;
		int id ;
		Add a1;
	//Constructor
	public Sam23(String n, int id,Add a1) {
			this.n = n;
			this.id = id;
			this.a1=a1;
		}
	//Copy Constructor
	public Sam23(Sam23 s1) {
		this.n=s1.n;
		this.id=s1.id;
		this.a1=s1.a1;
	}
	@Override
	public String toString() {
		return n+" "+id+" "+a1.ad;
	}
	public static void main(String[] args) {
		Add a = new Add("London");
		Sam23 n = new Sam23("bob",12,a);
		System.out.println(n);
		Sam23 n1 =new Sam23(n);
		System.out.println(n1);	
		System.out.println("---------");
		n1.a1.ad="Bengaluru";
		System.out.println(n);
		System.out.println(n1);	
	}
	}


