package javapractice;
abstract class square{
	
}
class square1 extends square{
	void area() {
		int a=3;
		System.out.println(a*a);
	}

}

public class Mainclass1 {
	public static void main(String[] args) {
		square1 c1 = new square1();
		c1.area();
	}


}
