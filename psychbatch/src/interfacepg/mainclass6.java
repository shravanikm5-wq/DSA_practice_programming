package interfacepg;
interface par{
	void area();
}
class par1 implements par{
	public void area()
	{
		int w=9;
		int h=7;
		System.out.println(w*h);
	}
}

public class mainclass6 {
	public static void main(String[] args) {
		par1 c1=new par1();
		  c1.area();

	}

}
