package Recursion;

public class rev_string {
	public static String rev(String s) {
		if(s.isEmpty()) {
			return s;
		}
		return rev(s.substring(1))+s.charAt(0);
	}
	public static void main(String[] args) {
		System.out.println(rev("java"));
	}

}
