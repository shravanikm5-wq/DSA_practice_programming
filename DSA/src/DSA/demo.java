package DSA;

public class demo {
	public demo() {
	  this("this second");
	  System.out.println("this first");
	}
	public demo(String a) {
		this("this","third");
		System.out.println(a);
	}
	public demo(String a,String b) {
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		System.out.println("main start");
		demo d1=new demo();
		System.out.println("main ends");
	}

}
