package exception;

public class main7 {
	public static void main(String[] args) {
		System.out.println("main start");
		try {
			int i=1/0;
		}
		catch(ArithmeticException e){
			System.out.println("handling");
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("main end");
		
	}

}
