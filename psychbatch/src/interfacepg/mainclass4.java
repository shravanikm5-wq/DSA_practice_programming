package interfacepg;
interface squ{
	void area();
}
class squ1 implements squ{
	public void area()
	{
		int a=7;
		System.out.println(a*a);
	}
}

public class mainclass4 {
	public static void main(String[] args) {
	squ1 c1=new squ1();
	  c1.area();

}
}
