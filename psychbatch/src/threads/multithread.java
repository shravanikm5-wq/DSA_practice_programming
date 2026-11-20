package threads;
class songs{
	 static void song1(){
		for(int i=0;i<=10;i++)
		{
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("munjane");
		}
		}
	 static void song2() {
		for(int i=0;i<=10;i++)
		{
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("kagadada");
		}
		}
}
class Thread1 extends Thread{
	public void run() {
		songs.song1();
	}}
class Thread2 extends Thread{
	public void run()
	{
		songs.song2();			
	}
}

public class multithread {
public static void main(String[] args) {
	Thread1 t1=new Thread1();
	Thread2 t2=new Thread2();
	t1.start();
	t2.start();
}
}
