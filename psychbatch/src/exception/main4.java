package exception;

public class main4 {
	public static void main(String[] args) {
		System.out.println("main start");
		try {
			int a=Integer.parseInt("asd456");
			System.out.println(a);
		}
		catch(NumberFormatException e){
			System.out.println("handles");
		}
		System.out.println("main end");
		
	}


}
