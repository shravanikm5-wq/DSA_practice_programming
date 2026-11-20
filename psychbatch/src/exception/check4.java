package exception;
class marksException extends Exception{
	String msg;
	marksException (String msg) {
		this.msg=msg;
	}
public String getmessage()
{
	return msg;
}
}

public class check4 {
	static void result() throws marksException{
		int mark=5;
		if (mark>=8) {
			System.out.println("pass");
		}
		else {
			throw new marksException("fail");
		}
	}
	public static void main(String[] args) {
		try {
			result();
		}
		catch(marksException e) {
			System.out.println(e.getmessage());
		}
	}
}

