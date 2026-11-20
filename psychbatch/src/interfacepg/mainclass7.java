package interfacepg;
interface sec{
	void area();
}
class sec1 implements sec{
	public void area()
	{
		int r=9;
		System.out.println(3.14*r*r*0.25);
	}
}

public class mainclass7 {
	public static void main(String[] args) {
		sec1 c1=new sec1();
		  c1.area();

	}

}
