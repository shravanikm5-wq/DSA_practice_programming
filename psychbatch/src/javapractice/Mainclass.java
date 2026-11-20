package javapractice; 
abstract class circle{
	
}
class circle1 extends circle{
	void area() {
		int r=3;
		System.out.println(3.14*r*r);
	}

}


public class Mainclass {
	public static void main(String[] args) {
		circle1 c1 = new circle1();
		c1.area();
	}

}
