package encapsulation;
class atm{
	 private String pin="4567";
	 public String getpwd() {
		 return pin;
	 }
	 public void setpwd(String pwd) {
		 this.pin=pwd;
		 }
}


public class main4 {
	public static void main(String[] args) {
		atm w1=new atm();
		System.out.println(w1.getpwd());
		w1.setpwd("56784");
		System.out.println(w1.getpwd());
		}

}
