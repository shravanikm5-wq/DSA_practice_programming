package exception;
class voteException extends Exception{
	String msg;
	voteException (String msg) {
		this.msg=msg;
	}
public String getmessage()
{
	return msg;
}
}

public class check3 {
	static void eligible() throws voteException{
		int age=5;
		if (age>=8) {
			System.out.println("eligible");
		}
		else {
			throw new voteException("not eligible");
		}
	}
	public static void main(String[] args) {
		try {
			eligible();
		}
		catch(voteException e) {
			System.out.println(e.getmessage());
		}
	}
}
