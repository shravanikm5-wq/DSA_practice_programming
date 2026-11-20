package encapsulation;
class whatsapp{
	 private String pwd="345";
	 public String getpwd() {
		 return pwd;
	 }
	 public void setpwd(String pwd) {
		 this.pwd=pwd;
		 }
}

public class mains {
	public static void main(String[] args) {
		whatsapp w1=new whatsapp();
		System.out.println(w1.getpwd());
		w1.setpwd("5624");
		System.out.println(w1.getpwd());
		}

}
