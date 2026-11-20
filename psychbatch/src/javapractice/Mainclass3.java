package javapractice;
abstract class tri{
	
}
class tri1 extends tri{
	void area() {
		int b=3;
		int h=4;
		System.out.println(0.5*b*h);
	}

}



public class Mainclass3 {
	public static void main(String[] args) {
		tri1 c1 = new tri1();
		c1.area();
	}


}
