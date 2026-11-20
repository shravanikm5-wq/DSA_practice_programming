package DSA;
class demo1{
	public demo1() {
		System.out.println("this is demo");
	}
}

public class Super extends demo1 {
	public Super() {
		this("this is second");
		System.out.println("this is first");
	}
	public Super(String a) {
		this("this is","third");
		System.out.println(a);
	}
	public Super(String a,String b) {
		super();
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		System.out.println("ms");
		Super s=new Super();
		System.out.println("me");
				
	}
	

}
