package abstraction;
interface amazon{
	void buy();
}
class dress implements amazon{
	public void buy()
{
		System.out.println("hiw");
		}
}
class shoe implements amazon{
	public void buy()
{
		System.out.println("hijhg");
		}
}
class mobile implements amazon{
	public void buy()
{
		System.out.println("hiiytr");
		}
}
class stimulator{
	static void ansim(amazon a1) {
	a1.buy();
}
}


public class main {
	public static void main(String[] args) {
		shoe s1=new shoe();
		dress d1=new dress();
		mobile m1=new mobile();
		stimulator.ansim(s1);
		stimulator.ansim(d1);
		stimulator.ansim(m1);


		
	}

}
