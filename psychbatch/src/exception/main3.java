package exception;

public class main3 {
	public static void main(String[] args) {
		System.out.println("main start");
		try {
			main3 m1=null;
			System.out.println(m1.hashCode());
		}
		catch(NullPointerException e){
			System.out.println("handles");
		}
		System.out.println("main end");
		
	}
}

