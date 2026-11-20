package interfacepg;
interface circle{
	void area();
}
class circle1 implements circle{
	public void area()
	{
		int r=5;
		System.out.println(3.14*r*r);
	}
}

public class mainclass1 {
	public static void main(String[] args) {
		circle1 c1=new circle1();
		c1.area();
	}
	
	

}

