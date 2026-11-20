package javapractice;
abstract class sec{
	
}
class sec1 extends sec{
	void area() {
		int r =3;
		System.out.println(0.5*r*r*3.14);
	}

}

public class mainclass8 {
	public static void main(String[] args) {
		sec1 c1 = new sec1();
		c1.area();
	}

}
