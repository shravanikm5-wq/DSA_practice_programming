package encapsulation;
class creditcard{
	 private int pin=87653;
	 public int getpwd() {
		 return pin;
	 }
	 public void setpwd(int pin) {
		 this.pin=pin;
		 }
}


public class main5 {
	public static void main(String[] args) {
		creditcard w1=new creditcard();
		System.out.println(w1.getpwd());
		w1.setpwd(76544);
		System.out.println(w1.getpwd());
		}


}
