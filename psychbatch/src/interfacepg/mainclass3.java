package interfacepg;
interface rec{
	void area();
}
class rec1 implements rec{
	public void area()
	{
		int b=7;
		int w=5;
		System.out.println(b*w);
	}
}

public class mainclass3 {
	public static void main(String[] args) {
	rec1 c1=new rec1();
	c1.area();
}

}
