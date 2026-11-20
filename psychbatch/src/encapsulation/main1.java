package encapsulation;
class insta{
	 private String pwd="rihdwj567";
	 public String getpwd() {
		 return pwd;
	 }
	 public void setpwd(String pwd) {
		 this.pwd=pwd;
		 }
}


public class main1 {
	public static void main(String[] args) {
		insta w1=new insta();
		System.out.println(w1.getpwd());
		w1.setpwd("jkhw6787775");
		System.out.println(w1.getpwd());
		}


}
