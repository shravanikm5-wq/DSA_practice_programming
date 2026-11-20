package exception;
class atmException extends Exception{
	String msg;
	atmException (String msg) {
		this.msg=msg;
	}
public String getmessage()
{
	return msg;
}
}
public class check2 {
	static void account() throws carException{
		int abal=5;
		if (abal>=8) {
			System.out.println("minimum");
		}
		else {
			throw new carException("not bal");
		}
	}
	public static void main(String[] args) {
		try {
			account();
		}
		catch(carException e) {
			System.out.println(e.getmessage());
		}
	}
}
