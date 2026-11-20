package exception;
class phonepayException extends Exception{
	String msg;
	phonepayException (String msg) {
		this.msg=msg;
	}
public String getmessage()
{
	return msg;
}
}

public class check5 {
	static void pay() throws phonepayException{
		int pin=5;
		if (pin>=8) {
			System.out.println("wrong pin");
		}
		else {
			throw new phonepayException("correct pin");
		}
	}
	public static void main(String[] args) {
		try {
			pay();
		}
		catch(phonepayException e) {
			System.out.println(e.getmessage());
		}
	}
}
