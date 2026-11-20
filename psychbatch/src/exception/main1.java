package exception;

public class main1 {
	public static void main(String[] args) {
		System.out.println("main start");
		try {
			int i=1/0;
		}
		catch(ArithmeticException e){
			System.out.println("handles");
		}
		System.out.println("main end");
		
	}

}
