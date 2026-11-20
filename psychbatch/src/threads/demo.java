package threads;

public class demo extends Thread {
	public static void main(String[] args) {
		demo d1= new demo();
		System.out.println(d1.getId());
		System.out.println(d1.getName());
		System.out.println(d1.getPriority());
		d1.setName("manoj");
		d1.setPriority(3);
		System.out.println(d1.getName());
		System.out.println(d1.getPriority());
	}

}
