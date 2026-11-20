package Recursion;

public class palindrome {
	public static boolean ispal(String s,int i,int j) {
		if(i>=j) {
			return true;
		}
		if(s.charAt(i)!=s.charAt(j)) {
			return false;
		}
		return ispal(s,++i,--j);
	}

	public static void main(String[] args) {
		String s="Shravani";
		if(ispal(s,0,s.length()-1)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
