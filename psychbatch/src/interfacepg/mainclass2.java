package interfacepg;
interface tri{
	void area();
}
class tri1 implements tri{
	public void area()
	{
		int b=7;
		int h=5;
		System.out.println(0.5*b*h);
	}
}

public class mainclass2 {
	public static void main(String[] args) {
		tri1 c1=new tri1();
		c1.area();
	}

}
