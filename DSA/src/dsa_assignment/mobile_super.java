package dsa_assignment;
class demo2{
	public demo2() {
		System.out.println("helo moto");
	}

}
public class mobile_super extends demo2 {
	public  mobile_super() {
		this("this is iphone");
		System.out.println("this is samsung");
	}
	public  mobile_super(String a) {
		this("this is","oneplus");
		System.out.println(a);
	}
	public  mobile_super(String a,String b) {
		super();
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		System.out.println("ms");
		 mobile_super s=new  mobile_super();
		System.out.println("me");
				
	}

}
