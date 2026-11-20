package dsa_assignment;

public class dosa {
	String name;
	int qty;
	String size;
	public dosa(String name) {
		this(name,1);
	}
	public dosa(String name,int qty) {
		this(name,qty,"small");
	}
	public dosa(String name,int qty,String size) {
		this.name=name;
		this.qty=qty;
		this.size=size;
	}
	public static void main(String[] args) {
		dosa p=new dosa("oniondosa");
		System.out.println(p.name+" "+p.qty+" "+p.size);
		
	}

}
