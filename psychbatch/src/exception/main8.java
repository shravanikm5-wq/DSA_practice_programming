package exception;

public class main8 {
	public static void main(String[] args) {
		System.out.println("main start");
		try {
			int i=1/0;
		}
		finally {
			System.out.println("finally close");
		}
		System.out.println("main end");
	}
}
