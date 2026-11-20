package exception;

public class main2 {
	public static void main(String[] args) {
		System.out.println("main start");
		int[] arr= {32,78,6,65};
		try {
			System.out.println(arr[9]);;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("handles");
		}
		System.out.println("main end");
		
	}

}

