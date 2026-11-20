package interfacepg;
interface elli{
	void area();
}
class elli1 implements elli{
	public void area()
	{
		int a=9;
		int b=9;
		System.out.println(3.14*a*b);
	}
}

public class mainclass8 {
	public static void main(String[] args) {
		elli1 c1=new elli1();
		  c1.area();

	}



}
