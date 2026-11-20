package exception;
class carException extends Exception{
	String msg;
	carException (String msg) {
		this.msg=msg;
	}
public String getmessage()
{
	return msg;
}
}
public class check1 {
	static void drive() throws carException{
		int gear=5;
		if (gear>=8) {
			System.out.println("car drive");
		}
		else {
			throw new carException("not move");
		}
	}
	public static void main(String[] args) {
		try {
			drive();
		}
		catch(carException e) {
			System.out.println(e.getmessage());
		}
	}
}
