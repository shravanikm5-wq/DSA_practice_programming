package dsa_assignment;
class demo3{
	public demo3() {
		System.out.println("different shapes");
	}}

public class shape extends demo3 {
	public shape() {
		this("this is circle");
		System.out.println("this is rec");
	}
	public shape(String a) {
		this("this is","tri");
		System.out.println(a);
	}
	public shape(String a,String b) {
		super();
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		System.out.println("ms");
		shape s=new shape();
		System.out.println("me");
				
	}
}
	


