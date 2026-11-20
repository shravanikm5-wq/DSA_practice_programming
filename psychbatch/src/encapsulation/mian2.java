package encapsulation;
class account{
	 private String pwd="rtyu56";
	 public String getpwd() {
		 return pwd;
	 }
	 public void setpwd(String pwd) {
		 this.pwd=pwd;
		 }
}

public class mian2 {
	public static void main(String[] args) {
		account w1=new account();
		System.out.println(w1.getpwd());
		w1.setpwd("54rv5^");
		System.out.println(w1.getpwd());
		}


}
