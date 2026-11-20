package encapsulation;
class patient{
	 private int number=45678;
	 public int getpwd() {
		 return number;
	 }
	 public void setpwd(int number) {
		 this.number=number;
		 }
}


public class mains5 {
	public static void main(String[] args) {
		patient w1=new patient();
		System.out.println(w1.getpwd());
		w1.setpwd(56784);
		System.out.println(w1.getpwd());
		}
	

}
