package Recursion;

public class print_odd {
	public static void print(int n) {
		if(n==0) {
			return;
		}
		if(n%2!=0)
		System.out.println(n);
		print(n-1);
	}
	public static void main(String[] args) {
		print(10);
	}


}
