package interfacepg;
interface tra{
	void area();
}
class tra1 implements tra{
	public void area()
	{
		int a=7;
		int b=9;
		int h=7;
		System.out.println(0.5*a+b*h);
	}
}


public class mainclass5 {
	public static void main(String[] args) {
		tra1 c1=new tra1();
		  c1.area();

	}
	

}
