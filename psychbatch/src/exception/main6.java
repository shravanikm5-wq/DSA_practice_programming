package exception;

public class main6 {
	public static void main(String[] args) {
		System.out.println("main start");
		try {
			int i=1/0;
		}
		catch(ArithmeticException e){
			int[] arr= {5,7,8,9};
		try {
			System.out.println(arr[9]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught");
		}
		
		System.out.println("main end");
		
	}


}
}
