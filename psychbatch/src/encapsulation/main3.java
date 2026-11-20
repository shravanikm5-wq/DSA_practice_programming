package encapsulation;
class student{
	 private String clgpwd="hdgdyt767";
	 public String getpwd() {
		 return clgpwd;
	 }
	 public void setpwd(String pwd) {
		 this.clgpwd=pwd;
		 }
}

public class main3 {
	public static void main(String[] args) {
		student w1=new student();
		System.out.println(w1.getpwd());
		w1.setpwd("3445735$#y@");
		System.out.println(w1.getpwd());
		}

}
