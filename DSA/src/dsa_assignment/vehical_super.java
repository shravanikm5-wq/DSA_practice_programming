package dsa_assignment;

class demo{
	public demo() {
		System.out.println("be safe");
	}
}

public class vehical_super extends demo {
	public vehical_super() {
		this("this is car");
		System.out.println("this is bike");
	}
	public vehical_super(String a) {
		this("this is","bus");
		System.out.println(a);
	}
	public vehical_super(String a,String b) {
		super();
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		System.out.println("ms");
		vehical_super s=new vehical_super();
		System.out.println("me");
				
	}

}
