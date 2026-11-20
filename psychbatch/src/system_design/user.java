package system_design;
class insta{
	private static insta login;
	private insta() {
		System.out.println("the user logged in");
	}
	public static insta getinstance() {
		if(login==null) {
			login=new insta();
		}
		return login;
	}
}
public class user {
	public static void main(String[] args) {
		insta i1=insta.getinstance();
		System.out.println(i1);
		insta i2=insta.getinstance();
		System.out.println(i2);
		
	}
}
