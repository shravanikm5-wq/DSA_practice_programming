package threads;
class tester extends Thread{
	public void run()
{
		for(int i=1;i<=10;i++) {
			try {
			Thread.sleep(1000);
		}
			catch(InterruptedException e) {
				e.printStackTrace();
				}
		System.out.println(i);
		}
}
}

public class main {
	public static void main(String[] args) {
		tester t1=new tester();
		t1.start();
		
	}
}