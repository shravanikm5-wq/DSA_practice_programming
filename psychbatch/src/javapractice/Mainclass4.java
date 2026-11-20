package javapractice;
abstract class rec{
	
}
class rec1 extends rec{
	void area() {
		int w=3;
		int h=4;
		System.out.println(w*h);
	}

}

public class Mainclass4 {
	public static void main(String[] args) {
		rec1 c1 = new rec1();
		c1.area();
	}



}
